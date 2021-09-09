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
import model.TransmisionModel;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class TransmisionDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<TransmisionModel> listarDatos(String username) {

        ArrayList<TransmisionModel> transmision = new ArrayList<>();
        try {
            if (conn == null) {

                conn = ConnectionDB.getConnection();
                String sql = "SELECT servicio_titulo, transmision_fecha FROM transmision"
                        + " JOIN servicio ON Transmision.transmision_servicio = Servicio.servicio_id"
                        + " WHERE Transmision.transmision_username = '" + username + "'";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    TransmisionModel transmisionModel = new TransmisionModel(result.getString(1), result.getString(2));
                    transmision.add(transmisionModel);
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return transmision;
    }

    public void agregar(String username, int servicio, String fecha) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "INSERT INTO `transmision`(`transmision_username`, `transmision_servicio`, `transmision_fecha`)"
                        + " VALUES (?,?,?)";
                statement = conn.prepareStatement(sql);
                statement.setString(1, username);
                statement.setInt(2, servicio);
                statement.setString(3, fecha);
                int rowsInserted = statement.executeUpdate();
                statement.close();
                if (rowsInserted > 0) {
                    System.out.println("El usuario se registro con exito");
                } else {
                    System.out.println("No se pudo registrar el usuario");
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void eliminar(String username, int servicio){
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = "DELETE FROM transmision WHERE transmision_username = '"+username+"'"
                        + "AND transmision_servicio = '"+servicio+"';";
                statement = conn.prepareStatement(sql);
                int rowsInserted = statement.executeUpdate();
                statement.close();
                if (rowsInserted > 0) {
                    System.out.println("El usuario se registro con exito");
                } else {
                    System.out.println("No se pudo registrar el usuario");
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
