
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
public class Docentes extends Personas{
    //Atributo
    private String Titulo;
    private String Titulo_pos;
    private int cant_clases;
    private String fac;
    private ArrayList<Proyecto>p=new ArrayList();
    //Constructor

    public Docentes() {
        super();
    }

    public Docentes(String Titulo, String Titulo_pos, int cant_clases, String fac) {
        this.Titulo = Titulo;
        this.Titulo_pos = Titulo_pos;
        this.cant_clases = cant_clases;
        this.fac = fac;
    }

    public Docentes(String Titulo, String Titulo_pos, int cant_clases, String fac, String nom, String apellido, String num_reg, String username, String password) {
        super(nom, apellido, num_reg, username, password);
        this.Titulo = Titulo;
        this.Titulo_pos = Titulo_pos;
        this.cant_clases = cant_clases;
        this.fac = fac;
    }
    //Mutador

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTitulo_pos() {
        return Titulo_pos;
    }

    public void setTitulo_pos(String Titulo_pos) {
        this.Titulo_pos = Titulo_pos;
    }

    public int getCant_clases() {
        return cant_clases;
    }

    public void setCant_clases(int cant_clases) {
        this.cant_clases = cant_clases;
    }

    public String getFac() {
        return fac;
    }

    public void setFac(String fac) {
        this.fac = fac;
    }

    public ArrayList<Proyecto> getP() {
        return p;
    }

    public void setP(ArrayList<Proyecto> p) {
        this.p = p;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString()+"Docentes: " + " Titulo: " + Titulo + ", Titulo Posgrado: " + Titulo_pos + ", Cantidad de clases: " + cant_clases + ", Facultad: " + fac + ", Proyectos: " + p + '}';
    }
    
}
