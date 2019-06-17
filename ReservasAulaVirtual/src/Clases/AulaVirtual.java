/***********************************************************************
 * Module:  AulaVirtual.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class AulaVirtual
 ***********************************************************************/

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** @pdOid 020888c3-71dd-41eb-8ce2-c13dc4ad9836 */
public class AulaVirtual {
   /** @pdOid ccc4311f-7a96-47de-a0ac-d9c98ed8878e */
   private ArrayList<Reserva> reserva;
   /** @pdOid eb9fc35a-ce22-4488-85cc-a31ae12a1388 */
   private ArrayList<Profesor> profesores;

    public AulaVirtual() {
        this.reserva = new ArrayList<Reserva>(70);
        this.profesores = new ArrayList<Profesor>();
    }
   
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
       int con1=0;
       int c=0;
       int l=1;
       for (int i = 0; i < this.reserva.size(); i++) {
           if(this.reserva.get(i)!=null){
           if(this.reserva.get(i).getCedula().equals(reserva.getCedula())){
               con1++;
              i=Dia(Diaau(l));
              c=0;
              l++;        
            }
           }
           if(con1==3){
           JOptionPane.showMessageDialog(null,"Solo se puede hacer 3 Reservas a la semana");
           return false;
            }
           c++;
           if(c==13){
           l++;
           c=0;
           }
       }
       int con2=0;
       for (int i = Dia(reserva.getDia()); i < (Dia(reserva.getDia())+14); i++) {
           if(this.reserva.get(i)!=null){
           if(this.reserva.get(i).getCedula().equals(reserva.getCedula())){
           con2++;
           }
           }
           if(con2==1){
           JOptionPane.showMessageDialog(null,"Solo una reserva por dia");
           return false;
            }
       }
       
       
       if((this.reserva.get(Dia(reserva.getDia())+(reserva.getInicio()-7))==null)&&(this.reserva.get(Dia(reserva.getDia())+(reserva.getFin()-8))==null)){
       this.reserva.add(Dia(reserva.getDia())+(reserva.getInicio()-7), reserva);
       this.reserva.add(Dia(reserva.getDia())+(reserva.getFin()-8), reserva);
       JOptionPane.showMessageDialog(null, "Agregado correctamente");
       return true;
       }else{
        JOptionPane.showMessageDialog(null, "Esta ocupado");
       return false;
       }
      
      
   }
   public int Dia(String dia){
   if(dia.equals("Lunes")){
   return 0;
   }
   if(dia.equals("Martes ")){
   return 14;
   }
   if(dia.equals("Miercoles")){
   return 28;
   }
   if(dia.equals("Jueves")){
   return 42;
   }
   if(dia.equals("Viernes")){
   return 56;
   }
   return -1;
   }
    public String Diaau(int l){
   if(l==1){
   return "Lunes";
   }
   if(l==2){
   return "Martes";
   }
   if(l==3){
   return "Miercoles";
   }
   if(l==4){
   return "Jueves";
   }
   if(l==5){
   return "Viernes";
   }
   return "";
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
   public boolean AgregarProfesor(Profesor profesor) {
       for (int i = 0; i < profesores.size(); i++) {
          if(profesores.get(i).getCedula().equals(profesor.getCedula())){
              JOptionPane.showMessageDialog(null,"El Profesor ya existe");
              return false;
                    } 
       }
       profesores.add(profesor);
       JOptionPane.showMessageDialog(null,"Registro correcto");
      return true;
   }

}