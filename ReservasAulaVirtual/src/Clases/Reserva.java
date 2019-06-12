/***********************************************************************
 * Module:  Reserva.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Reserva
 ***********************************************************************/

import java.util.*;

/** @pdOid 8e87daa4-f348-42ec-b75f-cc487f0d58d2 */
public class Reserva implements Validaciones {
   /** @pdOid bb87a828-0ba1-4dce-94e8-e7a6fadd3e3e */
   private String dia;
   /** @pdOid 2dd079be-2f53-45df-844c-894c975c732c */
   private int inicio;
   /** @pdOid 1e584ab0-6187-4fad-aa24-48b324a3e7ce */
   private int fin;
   /** @pdOid 74d93b95-cd3e-454e-93e1-eaff625a29cb */
   private String nombre;
   /** @pdOid 9fc924f0-f007-4109-aabe-54f827b09245 */
   private String cedula;
   /** @pdOid b25ef9eb-df46-470d-8a4e-249fadc8b8c1 */
   private String descripcion;
   
   /** @pdOid c21e685c-3c3c-4b86-9f8f-0f5ce53dc4ee */
   public boolean validar() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 317a0b2a-0df2-4548-8b82-06b95949bed0 */
   public String getDia() {
      return dia;
   }
   
   /** @param newDia
    * @pdOid 15c91ce3-cb15-4744-bd7e-542e0cb0a69b */
   public void setDia(String newDia) {
      dia = newDia;
   }
   
   /** @pdOid 0ceddc97-2df0-4841-89f2-6458de91aaf4 */
   public int getInicio() {
      return inicio;
   }
   
   /** @param newInicio
    * @pdOid 87da8582-1ea9-4b88-abfb-d7eb68baf196 */
   public void setInicio(int newInicio) {
      inicio = newInicio;
   }
   
   /** @pdOid d5013295-f0d7-4497-a38c-d6eeee38f741 */
   public int getFin() {
      return fin;
   }
   
   /** @param newFin
    * @pdOid af4efc35-9831-4629-87a7-307b95ef1bb5 */
   public void setFin(int newFin) {
      fin = newFin;
   }
   
   /** @pdOid 6e40353a-6edd-4147-b71f-22a4f13f1886 */
   public String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 700b74b9-40c5-4163-a1a8-15e4a1f50243 */
   public void setNombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid f2155582-a09e-409f-ba44-91f2b4c5012a */
   public String getCedula() {
      return cedula;
   }
   
   /** @param newCedula
    * @pdOid 1e8f2780-e0af-4c17-930f-5bdadf8e2f6d */
   public void setCedula(String newCedula) {
      cedula = newCedula;
   }
   
   /** @pdOid 8cfa9b01-cab9-4b0d-93df-ec18b78bba19 */
   public String getDescripcion() {
      return descripcion;
   }
   
   /** @param newDescripcion
    * @pdOid 00f3d1b1-6a17-4a92-820e-7478a722be04 */
   public void setDescripcion(String newDescripcion) {
      descripcion = newDescripcion;
   }

}