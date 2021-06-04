
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Administrar_Proyecto {
     //Atributos
     private ArrayList<Proyecto> listaProyecto = new ArrayList();
    private File archivo = null;
//Constructor
    public Administrar_Proyecto(String path) {
        archivo = new File(path);
    }
//Mutador
    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(ArrayList<Proyecto> listaProyectos) {
        this.listaProyecto = listaProyectos;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaProyecto;
    }

    //extra mutador
    public void setPersona(Proyecto p) {
        this.listaProyecto.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Proyecto t : listaProyecto) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getDescrip()+ ";");
                bw.write(t.getPunta()+ ";");
                bw.write(t.getDificultad()+ ";");
                bw.write(t.getTiempo()+ ";");
                bw.write(t.getCant_max()+ ";");
                bw.write(t.getFecha()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaProyecto = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaProyecto.add(new Proyecto(sc.next(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.nextInt(),
                                    sc.next(),
                                    sc.nextInt(),
                                    sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
