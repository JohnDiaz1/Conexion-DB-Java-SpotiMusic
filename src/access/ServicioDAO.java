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
import model.ServicioModel;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class ServicioDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<ServicioModel> listarDatos() {

        ArrayList<ServicioModel> servicio = new ArrayList<>();
        try {
            if (conn == null) {

                conn = ConnectionDB.getConnection();
                String sql = "SELECT servicio_titulo FROM servicio";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    ServicioModel servicioModel = new ServicioModel(result.getString(1));
                    servicio.add(servicioModel);
                }

                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return servicio;
    }

    public int obtenerIdServicio(String titulo) {
        int id = 0;
        try {
            if (conn == null) {

                conn = ConnectionDB.getConnection();
                String sql = "SELECT servicio_id FROM servicio WHERE servicio_titulo = '" + titulo + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();

                while (result.next()) {
                    id = result.getInt(1);
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;
    }
}
