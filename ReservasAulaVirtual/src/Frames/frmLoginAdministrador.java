/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author Pepe Peluso
 */
public class frmLoginAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form frmAulaVirtul
     */
    int x, y;
    Point ubicacionVentana;

    public frmLoginAdministrador() {
        initComponents();
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
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
        txtUsuarioAdmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswContrasena = new javax.swing.JPasswordField();
        rSMaterialButtonRound1 = new rojerusan.RSMaterialButtonRound();
        chkMostrarContra = new javax.swing.JCheckBox();

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

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_log-in_2561252 (1).png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        rSPanelGradiente1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Contraseña");
        rSPanelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 400, -1));
        rSPanelGradiente1.add(txtUsuarioAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 400, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Usuario");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 400, -1));
        rSPanelGradiente1.add(pswContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 400, -1));

        rSMaterialButtonRound1.setText("Log in");
        rSMaterialButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRound1ActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(rSMaterialButtonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 410, 40));

        chkMostrarContra.setBackground(new java.awt.Color(255, 255, 255));
        chkMostrarContra.setText("Mostrar Contraseña");
        chkMostrarContra.setBorder(null);
        chkMostrarContra.setFocusable(false);
        chkMostrarContra.setOpaque(false);
        chkMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(chkMostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        // TODO add your handling code here:
        ubicacionVentana = this.getLocationOnScreen();
        frmAulaVirtul fav = new frmAulaVirtul();
        fav.setLocation(ubicacionVentana);
        fav.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void rSMaterialButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRound1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRound1ActionPerformed

    private void chkMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraActionPerformed
        // TODO add your handling code here:
        if (chkMostrarContra.isSelected()){
            pswContrasena.setEchoChar((char)0);
        } else {
            pswContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarContraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAtras;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JCheckBox chkMostrarContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswContrasena;
    private rojerusan.RSMaterialButtonRound rSMaterialButtonRound1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private javax.swing.JTextField txtUsuarioAdmin;
    // End of variables declaration//GEN-END:variables
}
