package JFrame;

import java.util.HashSet;
import javax.swing.JOptionPane;
import trabajopracticon4.Colegio;
import trabajopracticon4.Materia;

public class InterMateria extends javax.swing.JInternalFrame {

    public InterMateria() {
        initComponents();
        this.setSize(400, 300);
        this.setTitle("Materia");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jTAnioMate = new javax.swing.JTextField();
        jTNombreMate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCodigoMate = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Formulario de Materias");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

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
        getContentPane().add(jTAnioMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, -1));
        getContentPane().add(jTNombreMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, -1));

        jLabel3.setText("Año al que pertenece:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Nombre de la materia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setText("Código de la materia:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(jTCodigoMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTAnioMate.setText(null);
        jTCodigoMate.setText(null);
        jTNombreMate.setText(null);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            int codMat = Integer.parseInt(jTCodigoMate.getText());
            String nomMat = jTNombreMate.getText();
            int anio = Integer.parseInt(jTAnioMate.getText());

            Materia mat = new Materia(codMat, nomMat, anio);
            
            if(Colegio.getListaMaterias().contains(mat)){
                JOptionPane.showMessageDialog(this, "La materia ya existe");
            }else{
               Colegio.getListaMaterias().add(mat);//Se guarda
                JOptionPane.showMessageDialog(this, "Materia agregada");
                
            }
            
        } catch (NumberFormatException ex) {
            // Capturar la excepción y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error: Debes ingresar un número entero válido");
            // Limpiar el JTextField para que el usuario vuelva a intentar
            jTAnioMate.setText(null);
            jTCodigoMate.setText(null);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTAnioMate;
    private javax.swing.JTextField jTCodigoMate;
    private javax.swing.JTextField jTNombreMate;
    // End of variables declaration//GEN-END:variables

}
