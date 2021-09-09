/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nabet
 */
public class ServicioModel {

    private int id;
    private String titulo;

    public ServicioModel(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public ServicioModel(String titulo) {
        this.titulo = titulo;
    }

    public ServicioModel(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

}
