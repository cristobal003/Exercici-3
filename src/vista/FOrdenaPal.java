/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.Arrays;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 *
 */
public class FOrdenaPal extends javax.swing.JFrame {

    /**
     * Crea en nuevo formulario FOrdenaPal
     */
    public FOrdenaPal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el
     * formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfText = new javax.swing.JTextField();
        eParaulesOrdenades = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Entra el text");

        tfText.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTextActionPerformed(evt);
            }
        });

        eParaulesOrdenades.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eParaulesOrdenades.setText("Entra el text");

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfText)
                    .addComponent(eParaulesOrdenades, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eParaulesOrdenades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * ejecuta una vez se presiona la entrada de texto tfText, ordena el texto
     * introducido y lo printea en eParaulesOrdenades
     *
     * @param evt es el evento
     */
    private void tfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTextActionPerformed

        String[] paraules = tfText.getText().split(" ");
        String cad = "";
        for (int i = 0; i < paraules.length; i++) {
            String paraula = paraules[i];
            cad = cad + ordenaLletresDe(paraula);
            cad += tfText.getText().charAt(cad.length());
        }
        eParaulesOrdenades.setText(cad);
    }//GEN-LAST:event_tfTextActionPerformed
    /**
     * Ejecuta una vez se presiona el botón bVolver y cierra este formulario y
     * regresa a FPrincipal
     *
     * @param evt es el evento
     */
    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        FPrincipal principal = new FPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Crea y muestra este formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOrdenaPal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel eParaulesOrdenades;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfText;
    // End of variables declaration//GEN-END:variables
    /**
     * Coge una palabra la convierte en una matriz de caracteres y la ordena
     *
     * @param paraula es la palabra que coge de la matriz de <code>String</code>
     * @return una cadena de texto con la palabra ordenada
     */
    private String ordenaLletresDe(String paraula) {
        char[] lletres = paraula.toCharArray();
        Arrays.sort(lletres);
        return new String(lletres);
    }

}
