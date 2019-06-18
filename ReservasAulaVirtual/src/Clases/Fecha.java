package Clases;

/***********************************************************************
 * Module:  Fecha.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Fecha
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;

/** @pdOid 8b370bcb-aef6-499f-a864-5148be90f1a0 */
public class Fecha implements Serializable{
   /** @pdOid c4605254-b659-4c35-9235-aeb7a59dea02 */
   private int dia;
   /** @pdOid 7136443f-498f-4efa-8147-65608890eae1 */
   private int mes;
   /** @pdOid 8692f08d-b59c-40c0-b31f-9efe3f6704ca */
   private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
   public Fecha() {
         Calendar fecha=Calendar.getInstance();
         ano=fecha.get(Calendar.YEAR);
         mes=(fecha.get(Calendar.MONTH)+1);
         dia=fecha.get(Calendar.DAY_OF_MONTH);
    }
   /** @pdOid ff51c172-4534-48c1-b74c-72fb3db3d557 */
   public int getDia() {
      return dia;
   }
   
   /** @param newDia
    * @pdOid ab2cf24b-3b91-4ba5-ae98-a3b20cd10f0a */
   public void setDia(int newDia) {
      dia = newDia;
   }
   
   /** @pdOid dad1df53-45db-4ac7-938b-d39ae8900de4 */
   public int getMes() {
      return mes;
   }
   
   /** @param newMes
    * @pdOid 46db03ff-449e-472b-933e-72b9305b6227 */
   public void setMes(int newMes) {
      mes = newMes;
   }
   
   /** @pdOid 92c32429-9a54-47f1-9eb0-1f19c7483afd */
   public int getAno() {
      return ano;
   }
   
   /** @param newAno
    * @pdOid 99c33bd6-2db7-4680-93d5-1bf6b047bb43 */
   public void setAno(int newAno) {
      ano = newAno;
   }

    

}