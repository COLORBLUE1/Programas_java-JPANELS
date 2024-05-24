package PKCASM;

import java.awt.Color;

public class VentanaPRINCASM extends javax.swing.JFrame {

   int xMouse, yMouse;
    public VentanaPRINCASM() {
        initComponents();
    rsscalelabel.RSScaleLabel.setScaleLabel(FOTO, "src/IMG_PERFIL/icono.png");
    this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FOTO = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Bfacil3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bfacil = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Bfacil1 = new javax.swing.JLabel();
        perfil = new javax.swing.JLabel();
        Iniciales = new javax.swing.JLabel();
        fondodere = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ExitBotom = new javax.swing.JLabel();
        BGprin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(FOTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 460, 420));

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("Camilo Sol");
        Nombre.setToolTipText("");
        Nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreMouseClicked(evt);
            }
        });
        jPanel3.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 100, 30));

        jPanel6.setBackground(new java.awt.Color(7, 51, 102));

        Bfacil3.setBackground(new java.awt.Color(7, 51, 102));
        Bfacil3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Bfacil3.setForeground(new java.awt.Color(255, 255, 255));
        Bfacil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bfacil3.setText("Complejos");
        Bfacil3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bfacil3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bfacil3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bfacil3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bfacil3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 140, 40));

        jPanel2.setBackground(new java.awt.Color(7, 51, 102));

        Bfacil.setBackground(new java.awt.Color(7, 51, 102));
        Bfacil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Bfacil.setForeground(new java.awt.Color(255, 255, 255));
        Bfacil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bfacil.setText("Medios");
        Bfacil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bfacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BfacilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BfacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BfacilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 140, 40));

        jPanel5.setBackground(new java.awt.Color(7, 51, 102));

        Bfacil1.setBackground(new java.awt.Color(7, 51, 102));
        Bfacil1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Bfacil1.setForeground(new java.awt.Color(255, 255, 255));
        Bfacil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bfacil1.setText("Faciles");
        Bfacil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bfacil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bfacil1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bfacil1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bfacil1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bfacil1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 140, 40));
        jPanel3.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 320, 230));

        Iniciales.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        Iniciales.setForeground(new java.awt.Color(204, 204, 204));
        Iniciales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Iniciales.setText("CASM");
        Iniciales.setToolTipText("");
        jPanel3.add(Iniciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 80, 30));

        fondodere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 42.png"))); // NOI18N
        jPanel3.add(fondodere, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 259, 623));

        jPanel1.setBackground(new java.awt.Color(92, 80, 94));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitBotom.setBackground(new java.awt.Color(255, 255, 255));
        ExitBotom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitBotom.setText("X");
        ExitBotom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBotom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBotomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBotomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBotomMouseExited(evt);
            }
        });
        jPanel1.add(ExitBotom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 33, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        BGprin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FONDOS/FONDO 4.jpg"))); // NOI18N
        jPanel3.add(BGprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        BG.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       xMouse= evt.getX();
       yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
      int x = evt.getXOnScreen();
      int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void ExitBotomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotomMouseClicked
      System.exit(0);
    }//GEN-LAST:event_ExitBotomMouseClicked

    private void ExitBotomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotomMouseEntered
        ExitBotom.setBackground(Color.blue);
        ExitBotom.setForeground(Color.white);
       
    }//GEN-LAST:event_ExitBotomMouseEntered

    private void ExitBotomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBotomMouseExited
        ExitBotom.setBackground(Color.red);
         ExitBotom.setForeground(Color.black);
    }//GEN-LAST:event_ExitBotomMouseExited

    private void BfacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BfacilMouseEntered
      Bfacil.setBackground(new Color(16,115,224));
    }//GEN-LAST:event_BfacilMouseEntered

    private void BfacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BfacilMouseExited
          Bfacil.setBackground(new Color(7,51,102));
    }//GEN-LAST:event_BfacilMouseExited

    private void Bfacil1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bfacil1MouseEntered

    private void Bfacil1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bfacil1MouseExited

    private void Bfacil3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bfacil3MouseEntered

    private void Bfacil3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bfacil3MouseExited

    private void NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseClicked
       Informacion AB = new Informacion ();
       AB.setVisible(true);
       dispose();
    }//GEN-LAST:event_NombreMouseClicked

    private void Bfacil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil1MouseClicked
       Faciles XX = new  Faciles ();
       XX.setVisible(true);
       dispose();
    }//GEN-LAST:event_Bfacil1MouseClicked

    private void BfacilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BfacilMouseClicked
       Medios BB = new  Medios ();
       BB.setVisible(true);
       dispose();
    }//GEN-LAST:event_BfacilMouseClicked

    private void Bfacil3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bfacil3MouseClicked
    Complejos AA = new  Complejos ();
       AA.setVisible(true);
       dispose();
    }//GEN-LAST:event_Bfacil3MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPRINCASM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPRINCASM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPRINCASM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPRINCASM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPRINCASM().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel BGprin;
    private javax.swing.JLabel Bfacil;
    private javax.swing.JLabel Bfacil1;
    private javax.swing.JLabel Bfacil3;
    private javax.swing.JLabel ExitBotom;
    private javax.swing.JLabel FOTO;
    private javax.swing.JLabel Iniciales;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel fondodere;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel perfil;
    // End of variables declaration//GEN-END:variables
}
