/***********************************************************************
 * Module:  AulaVirtual.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class AulaVirtual
 ***********************************************************************/

import java.util.*;
import javax.swing.table.DefaultTableModel;

/** @pdOid 020888c3-71dd-41eb-8ce2-c13dc4ad9836 */
public class AulaVirtual {
   /** @pdOid ccc4311f-7a96-47de-a0ac-d9c98ed8878e */
   private ArrayList<Reserva> reserva;
   /** @pdOid eb9fc35a-ce22-4488-85cc-a31ae12a1388 */
   private ArrayList<Profesor> profesores;
   
   /** @pdOid f000ec14-357d-438e-b333-9c2fcb1e1c44 */
   public ArrayList<Reserva> getReserva() {
      return reserva;
   }
   
   /** @param newReserva
    * @pdOid f95d4fa0-24e5-4533-b463-21763b6d0822 */
   public void setReserva(ArrayList<Reserva> newReserva) {
      reserva = newReserva;
   }
   
   /** @param reserva
    * @pdOid e1134e06-c691-4028-876c-cec18ca6b053 */
   public boolean agregarReserva(Reserva reserva) {
      // TODO: implement
      return false;
   }
   
   /** @param tabla 
    * @param dia
    * @pdOid 260ef10d-72e3-4380-b203-e108d535efd4 */
   public void tablaReservas(DefaultTableModel tabla, String dia) {
      // TODO: implement
   }
   
   /** @pdOid ae09298e-530a-42da-8a2c-cd2835c3e83e */
   public ArrayList<Profesor> getProfesores() {
      return profesores;
   }
   
   /** @param newProfesores
    * @pdOid 77da8d77-3ddb-4c7e-bac9-7b89165964e4 */
   public void setProfesores(ArrayList<Profesor> newProfesores) {
      profesores = newProfesores;
   }
   
   /** @param profesor
    * @pdOid 4ad1fa61-f24c-4860-9d80-e6a759477ed5 */
   public boolean registroProfesor(Profesor profesor) {
      // TODO: implement
      return false;
   }

}