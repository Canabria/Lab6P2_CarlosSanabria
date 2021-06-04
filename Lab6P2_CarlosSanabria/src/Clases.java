
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Clases {
    //Atributos
    private String nom;
    private String sec;
    private int codigo;
    private int codigo_carrera;
    private int cant_max;
    private int num_aula;
    ArrayList<Proyecto>p=new ArrayList();
    ArrayList<Alumnos>a=new ArrayList();
    //Constructores

    public Clases(String nom, String sec, int codigo, int codigo_carrera, int cant_max, int num_aula) {
        this.nom = nom;
        this.sec = sec;
        this.codigo = codigo;
        this.codigo_carrera = codigo_carrera;
        this.cant_max = cant_max;
        this.num_aula = num_aula;
    }
    //Mutadores

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(int codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public int getCant_max() {
        return cant_max;
    }

    public void setCant_max(int cant_max) {
        this.cant_max = cant_max;
    }

    public int getNum_aula() {
        return num_aula;
    }

    public void setNum_aula(int num_aula) {
        this.num_aula = num_aula;
    }

    public ArrayList<Proyecto> getP() {
        return p;
    }

    public void setP(ArrayList<Proyecto> p) {
        this.p = p;
    }

    public ArrayList<Alumnos> getA() {
        return a;
    }

    public void setA(ArrayList<Alumnos> a) {
        this.a = a;
    }
//ToString
    @Override
    public String toString() {
        return "Clases: " + " Nombre: " + nom + ", Sección: " + sec + ", Codigo aula: " + codigo + ", Codigo carrera: " + codigo_carrera + ", Cantidad maxima: " + cant_max + ", Numero de aula: " + num_aula + ", Proyectos: " + p + ", Alumnos: " + a + '}';
    }
    
}
