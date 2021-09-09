/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class ClienteDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<ClienteModel> datosCliente(String username) {

        ArrayList<ClienteModel> cliente = new ArrayList<>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "SELECT * FROM cliente WHERE cliente.cliente_username = '" + username + "'";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    ClienteModel clienteModel = new ClienteModel(result.getString(1), result.getString(2), result.getString(3),
                            result.getString(4), result.getString(5), result.getString(6), result.getString(7));
                    cliente.add(clienteModel);
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

    public String actualizarCliente(ClienteModel usuario) {

        String actualizado = null;

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "UPDATE `cliente` SET `cliente_nombre`= '" + usuario.getNombre() + "',"
                        + "`cliente_apellido`= '" + usuario.getApellido() + "',"
                        + "`cliente_email`= '" + usuario.getEmail() + "',"
                        + "`cliente_celular`='" + usuario.getCelular() + "'"
                        + " WHERE cliente_username = '" + usuario.getUsername() + "';";
                statement = conn.prepareStatement(sql);
                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    actualizado = "Datos Actualizados";
                } else {
                    actualizado = "Error al actualizar datos";
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actualizado;
    }
}
