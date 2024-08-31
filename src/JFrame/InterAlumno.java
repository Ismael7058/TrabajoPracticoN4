package JFrame;

import java.util.HashSet;
import javax.swing.JOptionPane;
import trabajopracticon4.Alumno;
import trabajopracticon4.Colegio;

public class InterAlumno extends javax.swing.JInternalFrame {

    HashSet<Alumno> listaAlumnoInter = new HashSet<>();//almacenamiento propio de interAlumnos

    public InterAlumno(HashSet<Alumno> listaAlumnosMenu) {
        initComponents();
        this.setSize(400, 300);
        this.setTitle("Alumno");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTApellidoAlum = new javax.swing.JTextField();
        jTLegajoAlum = new javax.swing.JTextField();
        jTNombreAlum = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Alumnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setText("Legajo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setText("Nombre: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(jTApellidoAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 270, -1));
        getContentPane().add(jTLegajoAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 270, -1));
        getContentPane().add(jTNombreAlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 270, -1));

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 220, -1, -1));

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTApellidoAlum.setText(null);
        jTLegajoAlum.setText(null);
        jTNombreAlum.setText(null);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String nom = jTNombreAlum.getText();
            String ape = jTApellidoAlum.getText();
            int leg = Integer.parseInt(jTLegajoAlum.getText());

            Alumno alum = new Alumno(leg, nom, ape);
            Colegio.setAlumno(alum);//Se guarda 
        } catch (NumberFormatException ex) {
            // Capturar la excepción y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error: Debes ingresar un número entero válido");
            // Limpiar el JTextField para que el usuario vuelva a intentar
            jTLegajoAlum.setText("");
        }
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTApellidoAlum;
    private javax.swing.JTextField jTLegajoAlum;
    private javax.swing.JTextField jTNombreAlum;
    // End of variables declaration//GEN-END:variables
}
