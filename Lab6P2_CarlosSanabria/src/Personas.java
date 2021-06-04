/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Personas {
    //Atributos
    private String nom;
    private String apellido;
    private String num_reg;
    private String username;
    private String password;
    
    //Constructor

    public Personas() {
    }

    public Personas(String nom, String apellido, String num_reg, String username, String password) {
        this.nom = nom;
        this.apellido = apellido;
        this.num_reg=num_reg;
        this.username = username;
        this.password = password;
    }
//mutadores
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_reg() {
        return num_reg;
    }

    public void setNum_reg(String num_reg) {
        this.num_reg = num_reg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//ToString
    @Override
    public String toString() {
        return "";
    }
    
}
