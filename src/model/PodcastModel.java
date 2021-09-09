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
public class PodcastModel {

    private String titulo;
    private int episodios;
    private int temporadas;

    public PodcastModel(String titulo, int episodios, int temporadas) {
        this.titulo = titulo;
        this.episodios = episodios;
        this.temporadas = temporadas;
    }

    public PodcastModel(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the episodios
     */
    public int getEpisodios() {
        return episodios;
    }

    /**
     * @return the temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

}
