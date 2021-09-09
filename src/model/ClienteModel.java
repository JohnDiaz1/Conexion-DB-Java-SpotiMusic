/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author nabet
 */
public class ClienteModel implements Serializable {
    
    private String username;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;
    private String password;
    private String nacimiento;

    
    public ClienteModel(){    
    }
    
    /**
     * Constructor manejo interno de tabla
     * @param username
     * @param nombre
     * @param apellido
     * @param email
     * @param celular
     * @param password
     * @param nacimiento 
     */
    
    public ClienteModel(String username, String nombre, String apellido, String email,
            String celular, String password, String nacimiento){
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular= celular;
        this.password = password;
        this.nacimiento = nacimiento;
    }
    
    public ClienteModel(String username){
        this.username = username;
    }

    public ClienteModel(String username, String nombre, String apellido, String email,
            String celular, String nacimiento){
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular= celular;
        this.nacimiento = nacimiento;
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nacimiento
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
}
