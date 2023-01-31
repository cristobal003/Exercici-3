/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 * 
 */
public class DQuadratMagic extends javax.swing.JDialog {

    /**
     * Crea el nuevo formulario DQuadratMagic
     * @param parent es el formulario padre
     * @param modal es un booleano modal
     */
    public DQuadratMagic(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el formulario.
     */
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eQuadratMagic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        eQuadratMagic.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        eQuadratMagic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eQuadratMagic.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eQuadratMagic, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eQuadratMagic, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Crea y muestra el dialogo */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DQuadratMagic dialog = new DQuadratMagic(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eQuadratMagic;
    // End of variables declaration//GEN-END:variables
    /**
     * Este metodo printea el cuadrado magico en eQuadratMagic
     * @param creaQuadratMagic es el texto que coge del metodo creaQuadratMagic localizado en FQuadratMagic.java
     */
    void setQuadrat(String creaQuadratMagic) {
        eQuadratMagic.setText(creaQuadratMagic);
    }
}
