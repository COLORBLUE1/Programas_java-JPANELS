/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKCASM;
import java.awt.Color;
/**
 *
 * @author Camilo Sol
 */
public class Informacion extends javax.swing.JFrame {

    /**
     * Creates new form Informacion
     */
     int xMouse, yMouse;
    public Informacion() {
        initComponents();
         this.setLocationRelativeTo(this);
      rsscalelabel.RSScaleLabel.setScaleLabel(PERFIL2, "src/IMG_PERFIL/PERFIL 3.JPG");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PERFIL3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ExitBotom2 = new javax.swing.JLabel();
        PERFIL2 = new javax.swing.JLabel();
        VOLVER = new javax.swing.JLabel();
        INICIALES = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PERFIL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PERFIL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitBotom2.setBackground(new java.awt.Color(0, 0, 0));
        ExitBotom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBotom2.setText("X");
        ExitBotom2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBotom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBotom2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBotom2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBotom2MouseExited(evt);
            }
        });
        jPanel4.add(ExitBotom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        PERFIL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PERFIL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        VOLVER.setForeground(new java.awt.Color(255, 255, 255));
        VOLVER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOLVER.setText("Volver");
        VOLVER.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 37.jpg")))); // NOI18N
        VOLVER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOLVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVERMouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 60, 20));

        INICIALES.setBackground(new java.awt.Color(240, 240, 245));
        INICIALES.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        INICIALES.setForeground(new java.awt.Color(255, 255, 255));
        INICIALES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INICIALES.setText("CASM");
        getContentPane().add(INICIALES, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 60, 30));

        titulo.setBackground(new java.awt.Color(240, 240, 245));
        titulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Camilo Abel Sol Mosquera");
        titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 15.jpg")))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 210, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(50);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("Mi nombre es camilo Abel sol Mosquera, nací un 7 de marzo de 2003 en Tumaco Nariño y \nestudiado \nen la institución educativa Tumac, desde \npequeño he tenido un gran gusto interés por las \npartes tecnológicas del mundo, desde pequeño\nabría los controles de los televisores y \notros aparatos \npara tratar de comprender sus\n sistemas y el cómo de su funcionalidad \nla carrera de ingeniería de sistemas es la \ncarrera \nla cual tuve en la mira desde muchos \naños y ahora la estoy ejerciendo con mucha \nfelicidad, \nla programación es algo que me gusta mucho, \naunque sea algo complicada a veces me gusta mucho \nel hecho de crear programas que pueden \nser de ayuda para alguien.  \n");
        jTextArea1.setBorder(null);
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 330, 480));

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 26.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VOLVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVERMouseClicked
       VentanaPRINCASM CA = new VentanaPRINCASM ();
       CA.setVisible(true);
       dispose();
    }//GEN-LAST:event_VOLVERMouseClicked

    private void ExitBotom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBotom2MouseClicked

    private void ExitBotom2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom2MouseEntered
        ExitBotom2.setBackground(Color.red);
        ExitBotom2.setForeground(Color.white);
    }//GEN-LAST:event_ExitBotom2MouseEntered

    private void ExitBotom2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotom2MouseExited
        ExitBotom2.setBackground(Color.white);
        ExitBotom2.setForeground(Color.black);
    }//GEN-LAST:event_ExitBotom2MouseExited

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse= evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel ExitBotom2;
    private javax.swing.JLabel INICIALES;
    private javax.swing.JLabel PERFIL2;
    private javax.swing.JLabel PERFIL3;
    private javax.swing.JLabel VOLVER;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
