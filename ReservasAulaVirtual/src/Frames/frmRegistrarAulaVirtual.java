/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.AulaVirtual;
import Clases.Reserva;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe Peluso
 */
public class frmRegistrarAulaVirtual extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form frmAulaVirtul
     */
    int x, y;
    Point ubicacionVentana;
    DefaultTableModel modeloHorario;
    AulaVirtual av;
    int u;
    public frmRegistrarAulaVirtual() {
        initComponents();
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        modelo();
        av = null;
    }
    
    private void modelo(){
        modeloHorario = (DefaultTableModel) tblHorario.getModel();
    }
    
    public void setAulaVirtual (AulaVirtual aula){
        av = aula;
        aula.tablaReservas(modeloHorario);
    }
    public void setUsuario (int num){
        u =num ;
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHFin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        btnAgregarHorario = new rojerusan.RSButtonRound();
        jLabel6 = new javax.swing.JLabel();
        txtHInicio = new javax.swing.JTextField();
        cbnDia = new javax.swing.JComboBox<>();

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservas de Aula Virtual");
        rSPanelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 750, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"07H00 - 08H00", null, null, null, null, null},
                {"08H00 - 09H00", null, null, null, null, null},
                {"09H00 - 10H00", null, null, null, null, null},
                {"10H00 - 11H00", null, null, null, null, null},
                {"11H00 - 12H00", null, null, null, null, null},
                {"12H00 - 13H00", null, null, null, null, null},
                {"13H00 - 14H00", null, null, null, null, null},
                {"14H00 - 15H00", null, null, null, null, null},
                {"15H00 - 16H00", null, null, null, null, null},
                {"16H00 - 17H00", null, null, null, null, null},
                {"17H00 - 18H00", null, null, null, null, null},
                {"18H00 - 19H00", null, null, null, null, null},
                {"19H00 - 20H00", null, null, null, null, null},
                {"20H00 - 21H00", null, null, null, null, null}
            },
            new String [] {
                "", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHorario);
        if (tblHorario.getColumnModel().getColumnCount() > 0) {
            tblHorario.getColumnModel().getColumn(0).setResizable(false);
            tblHorario.getColumnModel().getColumn(1).setResizable(false);
            tblHorario.getColumnModel().getColumn(2).setResizable(false);
            tblHorario.getColumnModel().getColumn(3).setResizable(false);
            tblHorario.getColumnModel().getColumn(4).setResizable(false);
            tblHorario.getColumnModel().getColumn(5).setResizable(false);
        }

        rSPanelGradiente1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 760, 250));
        rSPanelGradiente1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 760, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descripción: ");
        rSPanelGradiente1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hora de Fin: ");
        rSPanelGradiente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 100, -1));

        txtHFin.setBorder(null);
        txtHFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHFinKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtHFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Dia:");
        rSPanelGradiente1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 40, -1));

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        rSPanelGradiente1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 500, 110));

        btnAgregarHorario.setText("Agregar Horario");
        btnAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHorarioActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btnAgregarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hora de Inicio: ");
        rSPanelGradiente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 110, -1));

        txtHInicio.setBorder(null);
        txtHInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHInicioKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtHInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 120, 20));

        cbnDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        cbnDia.setBorder(null);
        cbnDia.setFocusable(false);
        cbnDia.setOpaque(false);
        rSPanelGradiente1.add(cbnDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, -1));

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
            fav.setAulaVirtual(av);
            fav.setVisible(true);
           
            this.dispose();
        }
        
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHorarioActionPerformed
        try {
            Reserva r = new Reserva(cbnDia.getSelectedItem().toString(),
                Integer.parseInt(txtHInicio.getText()), 
              Integer.parseInt(txtHFin.getText()),av.getProfesores().get(u).getNombre(), av.getProfesores().get(u).getCedula(),txaDescripcion.getText());
        if(r.validar()){
        av.agregarReserva(r);
        av.tablaReservas(modeloHorario);
        }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnAgregarHorarioActionPerformed

    private void txtHInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHInicioKeyTyped
        char validar=evt.getKeyChar();
        if(!Character.isDigit(validar))evt.consume();
    }//GEN-LAST:event_txtHInicioKeyTyped

    private void txtHFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHFinKeyTyped
        char validar=evt.getKeyChar();
        if(!Character.isDigit(validar))evt.consume();
    }//GEN-LAST:event_txtHFinKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarAulaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnAgregarHorario;
    private javax.swing.JLabel btnAtras;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JComboBox<String> cbnDia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JTable tblHorario;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JTextField txtHFin;
    private javax.swing.JTextField txtHInicio;
    // End of variables declaration//GEN-END:variables
}
