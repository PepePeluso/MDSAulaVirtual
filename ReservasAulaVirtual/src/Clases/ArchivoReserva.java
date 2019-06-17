/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

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
public class ArchivoReserva {
    public void escribirArchivo(Reserva nuevo) {
        try {
            File f = new File("reserva.cvs");
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
            bw.write(nuevo.getNombreConcurso() + ";"
                    + nuevo.getFechaInicio().getAño() + ";"
                    + nuevo.getFechaInicio().getMes() + ";"
                    + nuevo.getFechaInicio().getDia() + ";"
                    + nuevo.getFechaFinal().getAño() + ";"
                    + nuevo.getFechaFinal().getMes() + ";"
                    + nuevo.getFechaFinal().getDia() + ";"
                    + nuevo.getReglasConcurso() + ";"
                    + nuevo.getValorConcurso() + ";"
                    + nuevo.getDescripcionConcurso());
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
    }

    public void Mostrar(DefaultTableModel modeloConcurso) {
        while (modeloConcurso.getRowCount() > 0) {
            modeloConcurso.removeRow(0);
        }
        try {
            File f = new File("concurso.cvs");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    String[] concur = Linea.split(";");
                    Fecha f1, f2;
                    Reserva c = new Reserva(
                            concur[0],
                            f1 = new Fecha(Integer.parseInt(concur[3]), Integer.parseInt(concur[2]), Integer.parseInt(concur[1])),
                            f2 = new Fecha(Integer.parseInt(concur[6]), Integer.parseInt(concur[5]), Integer.parseInt(concur[4])),
                            concur[7],
                            Double.parseDouble(concur[8]),
                            concur[9]);

                    modeloConcurso.addRow(new Object[]{
                        concur[0],
                        concur[6]+"/"+concur[5]+"/"+concur[4],
                        concur[3]+"/"+concur[2]+"/"+concur[1],
                        concur[8],
                        concur[9]
                    });
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo...");
        }
    }
    
    public ArrayList<Reserva> concur(){
        ArrayList<Reserva> a = new ArrayList<>();
        try {
            File f = new File("concurso.cvs");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    String[] concur = Linea.split(";");
                    Fecha f1, f2;
                    a.add(new Reserva(
                            concur[0],
                            f1 = new Fecha(Integer.parseInt(concur[3]), Integer.parseInt(concur[2]), Integer.parseInt(concur[1])),
                            f2 = new Fecha(Integer.parseInt(concur[6]), Integer.parseInt(concur[5]), Integer.parseInt(concur[4])),
                            concur[7],
                            Double.parseDouble(concur[8]),
                            concur[9]));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo...");
        }
        return a;
    }
    
}
