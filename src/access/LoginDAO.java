/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ClienteModel;
import persistencia.ArchiCliente;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class LoginDAO {

    private Connection conn;
    private PreparedStatement statement;
    private ClienteModel clienteModel;
    private ArchiCliente per;

    public String estaRegistrado(String username, String password) throws IOException {

        String busquedaUsuario = null;

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
                String sql = ("SELECT cliente.cliente_username, cliente.cliente_clave FROM cliente WHERE cliente_username = '" + username + "'" + " && cliente_clave = '" + password + "'");
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                if (result.next()) {
                    busquedaUsuario = "Usuario encontrado";
                    clienteModel = new ClienteModel(username);
                    per = new ArchiCliente();
                    per.guardar(clienteModel);
                } else {
                    busquedaUsuario = "Usuario o contraseña invalidos";
                }
            }
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return busquedaUsuario;
    }

    public String agregarUsuario(ClienteModel usuario) {

        String agregado = null;

        try {
            if (conn == null) {

                conn = ConnectionDB.getConnection();
                String username = usuario.getUsername();
                String sqlUser = ("SELECT cliente.cliente_username FROM cliente WHERE cliente_username = '" + username + "'");
                statement = conn.prepareStatement(sqlUser);
                ResultSet result = statement.executeQuery();

                if (result.next()) {
                    agregado = "El usuario ya existe";
                    return agregado;
                }

                String sql = "INSERT INTO `cliente`(`cliente_username`, `cliente_nombre`, `cliente_apellido`, `cliente_email`, `cliente_celular`, `cliente_clave`, `cliente_fecha_nacimiento`)"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?)";
                statement = conn.prepareStatement(sql);
                statement.setString(1, usuario.getUsername());
                statement.setString(2, usuario.getNombre());
                statement.setString(3, usuario.getApellido());
                statement.setString(4, usuario.getEmail());
                statement.setString(5, usuario.getCelular());
                statement.setString(6, usuario.getPassword());
                statement.setString(7, usuario.getNacimiento());
                int rowsInserted = statement.executeUpdate();
                statement.close();
                if (rowsInserted > 0) {
                    agregado = " El usuario se registro con exito";
                } else {
                    agregado = "No se pudo registrar el usuario";
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return agregado;
    }
}
