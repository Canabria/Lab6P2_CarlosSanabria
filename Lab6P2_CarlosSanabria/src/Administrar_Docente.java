
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
public class Administrar_Docente {
    private ArrayList<Docentes> listaDocentes = new ArrayList();
    private File archivo = null;

    public Administrar_Docente(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Docentes> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(ArrayList<Docentes> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaDocentes;
    }

    //extra mutador
    public void setPersona(Docentes p) {
        this.listaDocentes.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Docentes t : listaDocentes) {
                bw.write(t.getTitulo()+ ";");
                bw.write(t.getTitulo_pos()+ ";");
                bw.write(t.getCant_clases()+ ";");
                bw.write(t.getFac()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaDocentes = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaDocentes.add(new Docentes(sc.next(),
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
