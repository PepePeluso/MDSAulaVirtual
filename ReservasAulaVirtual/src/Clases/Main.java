/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Frames.frmAulaVirtul;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Pepe Peluso
 */
public class Main {
    public static void main(String[] LoQueTocaHacerPorlosEfectos){
        try {
            NimbusLookAndFeel nb = new NimbusLookAndFeel();
            UIManager.setLookAndFeel(nb);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("La falla mi pana :c");
        }
        
        frmAulaVirtul fav = new frmAulaVirtul();
        rsutilities.RSUtilities.setCentrarVentana(fav);
        Animacion.Fade.JFrameFadeIn(0, 1, 0.1f, 1, fav);
        fav.setOpacity(0);
        fav.setVisible(true);
    }
    
}