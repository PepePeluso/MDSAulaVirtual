
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author Pepe Peluso
 */
public class Main {
    public static void main(String[] args) {
        AulaVirtual aulaVirtual=new AulaVirtual();
        aulaVirtual.agregarReserva(new Reserva("Lunes", 7, 8, "Fausto", "1004291447", "Tomar un tragito"));
        JOptionPane.showMessageDialog(null, "Hola");
    }
    
}
