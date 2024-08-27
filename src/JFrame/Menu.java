package JFrame;

import java.util.Locale;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMateria = new javax.swing.JButton();
        jButtonAlumno = new javax.swing.JButton();
        jDesktopPaneMenu = new javax.swing.JDesktopPane();
        jButtonColegio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMateria.setText("Materia");
        jButtonMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMateriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 110, 50));

        jButtonAlumno.setText("Alumno");
        jButtonAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 50));

        javax.swing.GroupLayout jDesktopPaneMenuLayout = new javax.swing.GroupLayout(jDesktopPaneMenu);
        jDesktopPaneMenu.setLayout(jDesktopPaneMenuLayout);
        jDesktopPaneMenuLayout.setHorizontalGroup(
            jDesktopPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jDesktopPaneMenuLayout.setVerticalGroup(
            jDesktopPaneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPaneMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 560, 340));

        jButtonColegio.setText("Colegio");
        jButtonColegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColegioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonColegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 110, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlumnoActionPerformed
        InterAlumno interAlumno = new InterAlumno();
        jDesktopPaneMenu.add(interAlumno);
        interAlumno.setVisible(true);
    }//GEN-LAST:event_jButtonAlumnoActionPerformed

    private void jButtonMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMateriaActionPerformed
        InterMateria interMateria = new InterMateria();
        jDesktopPaneMenu.add(interMateria);
        interMateria.setVisible(true);
    }//GEN-LAST:event_jButtonMateriaActionPerformed

    private void jButtonColegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColegioActionPerformed
        InterColegio interColegio = new InterColegio();
        jDesktopPaneMenu.add(interColegio);
        interColegio.setVisible(true);
    }//GEN-LAST:event_jButtonColegioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlumno;
    private javax.swing.JButton jButtonColegio;
    private javax.swing.JButton jButtonMateria;
    private javax.swing.JDesktopPane jDesktopPaneMenu;
    // End of variables declaration//GEN-END:variables
}
