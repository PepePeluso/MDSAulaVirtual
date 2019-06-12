/***********************************************************************
 * Module:  Login.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Login
 ***********************************************************************/

import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid c0c73f58-2c2e-4f40-9f50-0991c2b14720 */
public class Login implements Validaciones{
   /** @pdOid cf8b2209-35fa-4001-853f-daaab0ed8ba5 */
   private String usuario;
   /** @pdOid 95aee69d-178a-4fc8-8377-aaf5362e854a */
   private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
   
   /** @param usuario 
    * @param contrasena
    * @pdOid c29cdd5b-8850-40d8-8a1b-23ace1b9e768 */
   public boolean comparar(String usuario, String contrasena) {
     if(this.usuario.equals(usuario)){
     if(this.contrasena.equals(contrasena)){
     return true;
     }else{
     JOptionPane.showMessageDialog(null, "Contraseña incorrecto");
     return false;
     }
     }else{
         JOptionPane.showMessageDialog(null, " Usuario incorrecto");
     return false;
     }
    
     }

    @Override
    public boolean validar() {
        if(!(contrasena.length()>=8)){
            JOptionPane.showMessageDialog(null, "La contraseña debe ser mayor a 8 ");
            return false;
        }
            return true;
    }

}