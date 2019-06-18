/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.AulaVirtual;
import Clases.Fecha;
import Clases.Login;
import Clases.Profesor;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Pepe Peluso
 */
public class frmRegistrarProfesor extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form frmAulaVirtul
     */
    int x, y;
    Point ubicacionVentana;
    AulaVirtual av;
    public frmRegistrarProfesor() {
        initComponents();
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        ((JTextField)dchFechaNacimiento.getDateEditor()).setEditable(false);
        av = null;
    }
    
    public void setAulaVirtual (AulaVirtual aula){
        av = aula;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        btnAtras = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pswVerificarContrasena = new javax.swing.JPasswordField();
        rSMaterialButtonRound1 = new rojerusan.RSMaterialButtonRound();
        chkMostrarContra = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswRegistrarContrasena = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        dchFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 255));
        rSPanelGradiente1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        rSPanelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtras.setText("←");
        btnAtras.setToolTipText("");
        btnAtras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        rSPanelGradiente1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("X");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        rSPanelGradiente1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 20, 20));

        btnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setText("-");
        btnMinimizar.setToolTipText("");
        btnMinimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        rSPanelGradiente1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 20, 20));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_SEO-09_2588770.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        rSPanelGradiente1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 80, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Verificar Contraseña");
        rSPanelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 400, -1));

        txtNombre.setBorder(null);
        rSPanelGradiente1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 400, 20));

        pswVerificarContrasena.setBorder(null);
        rSPanelGradiente1.add(pswVerificarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 400, 20));

        rSMaterialButtonRound1.setText("Registrar Profesor");
        rSMaterialButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRound1ActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(rSMaterialButtonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 410, 40));

        chkMostrarContra.setBackground(new java.awt.Color(255, 255, 255));
        chkMostrarContra.setText("Mostrar Contraseñas");
        chkMostrarContra.setBorder(null);
        chkMostrarContra.setFocusable(false);
        chkMostrarContra.setOpaque(false);
        chkMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(chkMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nombre");
        rSPanelGradiente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 400, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cédula");
        rSPanelGradiente1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 400, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");
        rSPanelGradiente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 400, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Facultad");
        rSPanelGradiente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 400, -1));

        txtCedula.setBorder(null);
        rSPanelGradiente1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 400, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Título");
        rSPanelGradiente1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 400, -1));

        txtTitulo1.setBorder(null);
        rSPanelGradiente1.add(txtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 400, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 400, -1));

        pswRegistrarContrasena.setBorder(null);
        rSPanelGradiente1.add(pswRegistrarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 400, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FICA", "FICAYA", "FACAE", "FECYT", "FCCSS" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.setOpaque(false);
        rSPanelGradiente1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 400, -1));

        dchFechaNacimiento.setFocusable(false);
        dchFechaNacimiento.setOpaque(false);
        rSPanelGradiente1.add(dchFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(null, "Está seguro de cerrar el programa",
                "Opción", JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
             try {
            ObjectOutputStream Guardar = new ObjectOutputStream(new FileOutputStream("archivo.conc"));
            Guardar.writeObject(av);
            Guardar.close();
        } catch (Exception e) {
        }
            System.exit(0);
           
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        // TODO add your handling code here:
        int conf = JOptionPane.showConfirmDialog(null, "Está seguro de volver a "
                + "la pantalla principal", "Opción", JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            ubicacionVentana = this.getLocationOnScreen();
            frmAulaVirtul fav = new frmAulaVirtul();
            fav.setLocation(ubicacionVentana);
            fav.setVisible(true);
            fav.setAulaVirtual(av);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void rSMaterialButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRound1ActionPerformed
        try {
           if(pswRegistrarContrasena.getText().equals(pswVerificarContrasena.getText())){
      Profesor profesor=new Profesor(txtNombre.getText(), txtCedula.getText(), new Fecha(dchFechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH), dchFechaNacimiento.getCalendar().get(Calendar.MONTH)+1, dchFechaNacimiento.getCalendar().get(Calendar.YEAR)), jComboBox1.getSelectedItem().toString(), txtTitulo1.getText(),new Login(txtCedula.getText(), pswRegistrarContrasena.getText()));
      if(profesor.validar()){
      av.AgregarProfesor(profesor);
      }
           }else{
      JOptionPane.showMessageDialog(null, "La contraseña no coinsiden");
      } 
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Datos incompletos");
        }
        
        
    }//GEN-LAST:event_rSMaterialButtonRound1ActionPerformed

    private void chkMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraActionPerformed
        // TODO add your handling code here:
        if (chkMostrarContra.isSelected()){
            pswVerificarContrasena.setEchoChar((char)0);
            pswRegistrarContrasena.setEchoChar((char)0);
        } else {
            pswVerificarContrasena.setEchoChar('*');
            pswRegistrarContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarContraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAtras;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JCheckBox chkMostrarContra;
    private com.toedter.calendar.JDateChooser dchFechaNacimiento;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pswRegistrarContrasena;
    private javax.swing.JPasswordField pswVerificarContrasena;
    private rojerusan.RSMaterialButtonRound rSMaterialButtonRound1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
