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
            bw.write(nuevo.getDia() + ";"
                    + nuevo.getInicio() + ";"
                    + nuevo.getFin() + ";"
                    + nuevo.getNombre() + ";"
                    + nuevo.getCedula() + ";"
                    + nuevo.getDescripcion());
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
    }

    public void Mostrar(DefaultTableModel modeloReserva) {
        while (modeloReserva.getRowCount() > 0) {
            modeloReserva.removeRow(0);
        }
        try {
            File f = new File("reserva.cvs");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    String[] concur = Linea.split(";");
                    Reserva c = new Reserva(
                            concur[0],
                            Integer.parseInt(concur[1]),
                            Integer.parseInt(concur[2]),
                            concur[3],
                            concur[4],
                            concur[5]);

                    modeloReserva.addRow(new Object[]{
                        concur[0],
                        concur[3]
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
            File f = new File("reserva.cvs");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String Linea;
                while ((Linea = br.readLine()) != null) {
                    String[] concur = Linea.split(";");
                    a.add(new Reserva(
                            concur[0],
                            Integer.parseInt(concur[1]),
                            Integer.parseInt(concur[2]),
                            concur[3],
                            concur[4],
                            concur[5]));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo...");
        }
        return a;
    }
    
}
