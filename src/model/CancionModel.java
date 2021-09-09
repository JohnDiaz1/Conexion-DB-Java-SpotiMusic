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
public class CancionModel {

    private String titulo;
    private String resenia;
    private int anio;
    private String cantante;

    /**
     * Constructor manejo interno de tabla
     *
     * @param titulo
     * @param resenia
     * @param anio
     * @param cantante
     */
    public CancionModel(String titulo, String resenia, int anio, String cantante) {
        this.titulo = titulo;
        this.resenia = resenia;
        this.anio = anio;
        this.cantante = cantante;
    }

    public CancionModel(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the resenia
     */
    public String getResenia() {
        return resenia;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return the cantante
     */
    public String getCantante() {
        return cantante;
    }

}
