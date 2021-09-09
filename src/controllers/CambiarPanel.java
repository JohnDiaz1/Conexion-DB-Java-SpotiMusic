/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JPanel;

/**
 *
 * @author nabet
 */
public class CambiarPanel {

    private final JPanel container;
    private final JPanel contenido;

    public CambiarPanel(JPanel container, JPanel contenido) {

        this.container = container;
        this.contenido = contenido;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();

        this.container.add(this.contenido);
        this.container.revalidate();
        this.container.repaint();

    }

}
