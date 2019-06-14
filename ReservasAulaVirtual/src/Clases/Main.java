/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Frames.frmAulaVirtul;
import rojerusan.RSAnimation;

/**
 *
 * @author Pepe Peluso
 */
public class Main {
    public static void main(String[] LoQueTocaHacerPorlosEfectos){
        frmAulaVirtul fav = new frmAulaVirtul();
        Animacion.Fade.JFrameFadeIn(0, 1, 0.05f, 1, fav);
        fav.setOpacity(0);
        fav.setVisible(true);
    }
    
}
