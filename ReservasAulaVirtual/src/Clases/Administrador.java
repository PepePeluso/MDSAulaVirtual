package Clases;

/***********************************************************************
 * Module:  Administrador.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Administrador
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid 5af5ff75-e825-4a03-ba72-ccd794218e7b */
public class Administrador implements Serializable {
   /** @pdOid ee40a540-ea60-4e87-83f2-426978780b5c */
   private Login longiAdministrador;

    public Administrador(Login longiAdministrador) {
        this.longiAdministrador = longiAdministrador;
    }

    public Login getLongiAdministrador() {
        return longiAdministrador;
    }

    public void setLongiAdministrador(Login longiAdministrador) {
        this.longiAdministrador = longiAdministrador;
    }

}