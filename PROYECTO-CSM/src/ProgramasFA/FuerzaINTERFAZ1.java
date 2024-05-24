/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramasFA;

import PKCASM.ES;
import PKCASM.Faciles;
import ProgramasFA.Fuerza;
import java.awt.Color;

/**
 *
 * @author Camilo Sol
 */
public class FuerzaINTERFAZ1 extends javax.swing.JFrame {

  Fuerza PO;
    private int xMouse;
    private int yMouse;
    public FuerzaINTERFAZ1() {
        initComponents();
         this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ExitBotom1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MASA = new javax.swing.JTextField();
        ACELERACION = new javax.swing.JTextField();
        RESULTADO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        INICIALES1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        PERFIL1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CALCULAR");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitBotom1.setBackground(new java.awt.Color(0, 0, 0));
        ExitBotom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBotom1.setText("X");
        ExitBotom1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBotom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBotom1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBotom1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBotom1MouseExited(evt);
            }
        });
        jPanel5.add(ExitBotom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASA");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACELERACION");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESULTADO");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));
        getContentPane().add(MASA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 110, 30));
        getContentPane().add(ACELERACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 110, 30));
        getContentPane().add(RESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 120, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CALCULAR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 140, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BORAR");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 130, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Volver");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 550, 60, 20));

        INICIALES1.setBackground(new java.awt.Color(240, 240, 245));
        INICIALES1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        INICIALES1.setForeground(new java.awt.Color(255, 255, 255));
        INICIALES1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INICIALES1.setText("CASM");
        INICIALES1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(INICIALES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 90, 30));

        titulo.setBackground(new java.awt.Color(240, 240, 245));
        titulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Camilo Abel Sol Mosquera");
        titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 15.jpg")))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 210, 30));

        PERFIL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PERFIL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG_PERFIL/perfil2.png"))); // NOI18N
        getContentPane().add(PERFIL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 120, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 23.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try{
            String sm=MASA.getText();
            String sa=ACELERACION.getText();

            double m=Double.parseDouble(sm);
            double a=Double.parseDouble(sa);

            PO=new Fuerza(m,a);
            double r=PO.calcularFuerza();
            RESULTADO.setText(r+"");

        }catch(Exception g){
            ES.mostrarMensajeV("no_sea_asi_digite_un_numero");
        }
        finally{}
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Faciles CA = new Faciles ();
        CA.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try{
            String sm=MASA.getText();
            String sa=ACELERACION.getText();

            double m=Double.parseDouble(sm);
            double a=Double.parseDouble(sa);

            PO=new Fuerza(m,a);
            double r=PO.calcularFuerza();
            RESULTADO.setText(r+"");

        }catch(Exception g){
            ES.mostrarMensajeV("no_sea_asi_digite_un_numero");
        }
        finally{}
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          Borrar();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void ExitBotom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBotom1MouseClicked

    private void ExitBotom1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom1MouseEntered
        ExitBotom1.setBackground(Color.red);
        ExitBotom1.setForeground(Color.white);
    }//GEN-LAST:event_ExitBotom1MouseEntered

    private void ExitBotom1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom1MouseExited
        ExitBotom1.setBackground(Color.white);
        ExitBotom1.setForeground(Color.black);
    }//GEN-LAST:event_ExitBotom1MouseExited

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed

        xMouse= evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed
private void Borrar() {
        MASA.setText("");
        ACELERACION.setText("");
        RESULTADO.setText("");
}
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
            java.util.logging.Logger.getLogger(FuerzaINTERFAZ1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuerzaINTERFAZ1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuerzaINTERFAZ1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuerzaINTERFAZ1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuerzaINTERFAZ1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACELERACION;
    private javax.swing.JLabel ExitBotom1;
    private javax.swing.JLabel INICIALES1;
    private javax.swing.JTextField MASA;
    private javax.swing.JLabel PERFIL1;
    private javax.swing.JTextField RESULTADO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}