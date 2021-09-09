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
public class TransmisionModel {

    private final String servicio;
    private final String fecha;

    public TransmisionModel(String servicio, String fecha) {
        this.servicio = servicio;
        this.fecha = fecha;
    }

    /**
     * @return the servicio
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

}
