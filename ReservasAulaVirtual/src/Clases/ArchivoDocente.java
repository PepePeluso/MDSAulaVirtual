/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deric
 */
public class ArchivoDocente {
    public void escribirArchivo(Profesor nuevo) {
        try {
            File f = new File("profesor.cvs");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.close();
            }
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(nuevo.getNombre() + ";"
                    + nuevo.getCedula() + ";"
                    + nuevo.getFechaNacimiento().getDia() + ";"
                    + nuevo.getFechaNacimiento().getMes()+ ";"
                    + nuevo.getFechaNacimiento().getAno()+ ";"
                    + nuevo.getFacultad() + ";"
                    + nuevo.getTitulo() + ";"
                    + nuevo.getLogin().getUsuario() + ";"
                    + nuevo.getLogin().getContrasena());
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
    }
    
    public ArrayList<Profesor> concur(){
        ArrayList<Profesor> a = new ArrayList<>();
        try {
            File f = new File("profesor.cvs");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    String[] p = Linea.split(";");
                    a.add(new Profesor(
                            p[0],
                            p[1],
                            new Fecha(Integer.parseInt(p[2]), Integer.parseInt(p[3]), Integer.parseInt(p[4])),
                            p[5],
                            p[6],
                            new Login(p[7], p[8])));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo...");
        }
        return a;
    }
    
}
