/***********************************************************************
 * Module:  Profesor.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Profesor
 ***********************************************************************/

import java.util.*;

/** @pdOid 9cbfc43a-edb7-47a5-9d87-1fe7bde27c0e */
public class Profesor implements Validaciones {
   /** @pdOid e2f96d6b-1172-413f-96b2-f868dc773c22 */
   private String nombre;
   /** @pdOid 69037daa-57fd-455b-ba69-d16ac02253d3 */
   private String cedula;
   /** @pdOid 01660c3d-4925-4f1a-b30c-1e7752f629ef */
   private Fecha fechaNacimiento;
   /** @pdOid df68625a-e36b-45ac-9fa2-109dd2c66b77 */
   private String facultad;
   /** @pdOid b9ace0d5-2b5f-426a-a90d-57dd0360372a */
   private String titulo;
   /** @pdOid 0ce211e7-fe81-4669-9f04-6aee2de4da5d */
   private Login login;
   
   /** @pdOid 5119b705-49c7-43a4-8fe2-1957fd6e1625 */
   public String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 2787fba7-b688-47d9-82bd-dd04dfc56de8 */
   public void setNombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 1a4c3234-ed45-4855-a19b-521f57daee27 */
   public String getCedula() {
      return cedula;
   }
   
   /** @param newCedula
    * @pdOid 0821bfb9-dcbd-4ca3-9df6-75ddf3f1a99a */
   public void setCedula(String newCedula) {
      cedula = newCedula;
   }
   
   /** @pdOid a7b04f54-05bc-479a-9972-e06c18734bba */
   public Fecha getFechaNacimiento() {
      return fechaNacimiento;
   }
   
   /** @param newFechaNacimiento
    * @pdOid 84a4d9ff-95b6-4777-b0e4-69c7ff18cbd6 */
   public void setFechaNacimiento(Fecha newFechaNacimiento) {
      fechaNacimiento = newFechaNacimiento;
   }
   
   /** @pdOid cc9b1055-a875-4bd3-8571-7983f376d2be */
   public String getFacultad() {
      return facultad;
   }
   
   /** @param newFacultad
    * @pdOid 7d9bc128-ad87-46bf-8599-c31e173c5bf2 */
   public void setFacultad(String newFacultad) {
      facultad = newFacultad;
   }
   
   /** @pdOid fb6a9851-0a69-4f09-a875-0451e9fe4772 */
   public String getTitulo() {
      return titulo;
   }
   
   /** @param newTitulo
    * @pdOid ba23b0bd-4148-41d1-ba2c-7e5fcb9e575a */
   public void setTitulo(String newTitulo) {
      titulo = newTitulo;
   }
   
   /** @pdOid c1d9031d-de9b-432f-aa36-2cda5674ee15 */
   public Login getLogin() {
      return login;
   }
   
   /** @param newLogin
    * @pdOid 6d4e9057-67f7-44a6-a59f-94b8cbc0bc9d */
   public void setLogin(Login newLogin) {
      login = newLogin;
   }

    @Override
    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}