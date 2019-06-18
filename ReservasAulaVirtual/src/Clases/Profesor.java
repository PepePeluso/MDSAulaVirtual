package Clases;

/***********************************************************************
 * Module:  Profesor.java
 * Author:  Diego Castillo
 * Purpose: Defines the Class Profesor
 ***********************************************************************/

import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid 9cbfc43a-edb7-47a5-9d87-1fe7bde27c0e */
public class Profesor implements Validaciones, Serializable {
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

    public Profesor(String nombre, String cedula, Fecha fechaNacimiento, String facultad, String titulo, Login login) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.facultad = facultad;
        this.titulo = titulo;
        this.login = login;
    }
   
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
        if(!verificarCedula(cedula)){     
            return false;
        }
        if(!(calcularEdad()>=24)){
        JOptionPane.showMessageDialog(null, "Su edad debe ser mayor o igual a 24");
        return false;
        }
        if(!login.validar()){
        return false;
        }
        return true;
        }
    public boolean verificarCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                   // Coeficientes de validación cédula
                   // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null,"Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            JOptionPane.showMessageDialog(null,"La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
        
    }

    /**
     * @pdOid 0436374d-6a7a-40de-8a80-7d1858d0ea24
     */
    public int calcularEdad() {
       Calendar c = new GregorianCalendar();
        if (((c.get(Calendar.DATE) <= fechaNacimiento.getDia() && c.get(Calendar.MONTH) <= fechaNacimiento.getMes()))) {
            return c.get(Calendar.YEAR) - fechaNacimiento.getAno();
        } else {
            return (c.get(Calendar.YEAR) - fechaNacimiento.getAno()) - 1;
        }
    }

}