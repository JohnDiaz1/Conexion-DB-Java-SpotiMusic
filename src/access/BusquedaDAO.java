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
import model.CancionModel;
import model.PodcastModel;
import utils.ConnectionDB;

/**
 *
 * @author nabet
 */
public class BusquedaDAO {

    private Connection conn;
    private PreparedStatement statement;

    public ArrayList<CancionModel> buscarCancion(String titulo) {
        ArrayList<CancionModel> cancion = new ArrayList<CancionModel>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT servicio.servicio_titulo, cancion.cancion_resenia, cancion.cancion_anio,"
                        + " cantante.cantante_nombre, cantante.cantante_apellido FROM"
                        + " servicio JOIN cancion on servicio.servicio_id = cancion.cancion_id"
                        + " JOIN cantante on cancion.cancion_cantante = cantante.cantante_id"
                        + " WHERE servicio.servicio_titulo = '" + titulo + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    CancionModel cancionModel = new CancionModel(result.getString(1), result.getString(2), result.getInt(3),
                            result.getString(4));
                    cancion.add(cancionModel);
                }
                if (!result.next()) {
                    CancionModel cancionModel = new CancionModel("No se encontro");
                    cancion.add(cancionModel);
                    return cancion;
                }

                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cancion;
    }

    public ArrayList<PodcastModel> buscarPodcast(String titulo) {
        ArrayList<PodcastModel> podcast = new ArrayList<PodcastModel>();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();

                String sql = " SELECT servicio_titulo, podcast_episodios, podcast_temporadas"
                        + " FROM servicio join podcast on servicio.servicio_id = podcast.podcast_id"
                        + " WHERE servicio.servicio_titulo = '" + titulo + "';";
                statement = conn.prepareStatement(sql);
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    PodcastModel podcastModel = new PodcastModel(result.getString(1), result.getInt(2), result.getInt(3));
                    podcast.add(podcastModel);
                }
                if (!result.next()) {
                    PodcastModel podcastModel = new PodcastModel("No se encontro");
                    podcast.add(podcastModel);
                    return podcast;
                }
                statement.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return podcast;
    }
}
