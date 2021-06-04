/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Alumnos extends Personas{
    //Atributos
    private int edad;
    private String ID;
    private String carrera;
    private int anos_carrera;
    private double promedio;
    private String fac;
//Constructores
    public Alumnos() {
        super();
    }

    public Alumnos(int edad, String ID, String carrera, int anos_carrera, double promedio, String fac) {
        this.edad = edad;
        this.ID = ID;
        this.carrera = carrera;
        this.anos_carrera = anos_carrera;
        this.promedio = promedio;
        this.fac = fac;
    }

    public Alumnos(int edad, String ID, String carrera, int anos_carrera, double promedio, String fac, String nom, String apellido, String num_reg, String username, String password) {
        super(nom, apellido, num_reg, username, password);
        this.edad = edad;
        this.ID = ID;
        this.carrera = carrera;
        this.anos_carrera = anos_carrera;
        this.promedio = promedio;
        this.fac = fac;
    }
    //Mutadores

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnos_carrera() {
        return anos_carrera;
    }

    public void setAnos_carrera(int anos_carrera) {
        this.anos_carrera = anos_carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }
    //ToString

    @Override
    public String toString() {
        return "Alumnos: " + " Edad: " + edad + ", ID: " + ID + ", Carrera:" + carrera + ", Anos carrera: " + anos_carrera + ", Promedio: " + promedio + ", Facultad: " + fac + '}';
    }
    
    
}
