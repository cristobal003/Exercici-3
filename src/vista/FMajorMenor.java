/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 *
 */
public class FMajorMenor extends javax.swing.JFrame {

    /**
     * Crea el nuevo formulario FMajorMeror
     */
    public FMajorMenor() {
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

        bCrea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tfNombreEnters = new javax.swing.JTextField();
        bVolver = new javax.swing.JButton();
        bVolver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCrea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCrea.setText("Crea");
        bCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaActionPerformed(evt);
            }
        });

        taPantalla.setEditable(false);
        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("nombre d'enters a crear");

        tfNombreEnters.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfNombreEnters.setText("0");

        bVolver.setText("Volver");

        bVolver1.setText("Volver");
        bVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombreEnters, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCrea))
                            .addComponent(bVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(136, 136, 136)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrea)
                    .addComponent(jLabel1)
                    .addComponent(tfNombreEnters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bVolver1)
                .addGap(11, 11, 11))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addGap(151, 151, 151)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * coge una matriz la rellena, la muestra y muestra el número más bajo y el
     * más alto
     *
     * @param evt es el evento
     */
    private void bCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaActionPerformed

        int nEnters = Integer.parseInt(tfNombreEnters.getText());
        int[] mat = omplirAmbAleatoris(nEnters, 100, 150);
        mostra(mat);
        mostraMaxMin(mat);

    }//GEN-LAST:event_bCreaActionPerformed

    /**
     * Ejecuta una vez se presiona el botón bVolver y cierra este formulario y
     * regresa a FPrincipal
     *
     * @param evt es el evento
     */

    private void bVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolver1ActionPerformed
        FPrincipal principal = new FPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bVolver1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMajorMenor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrea;
    private javax.swing.JButton bVolver;
    private javax.swing.JButton bVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taPantalla;
    private javax.swing.JTextField tfNombreEnters;
    // End of variables declaration//GEN-END:variables

    /**
     * Rellena una matriz de números aleatorios entre dos números
     *
     * @param nElements es el número de elementos
     * @param inf es el número inferior
     * @param sup es el número superior
     * @return la matriz rellena
     */
    private int[] omplirAmbAleatoris(int nElements, int inf, int sup) {
        if (inf > sup) {
            omplirAmbAleatoris(nElements, sup, inf);
        }
        nElements = Math.abs(nElements);
        if (nElements < 2) {
            nElements = 2;
        }
        int[] mat = new int[nElements];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = inf + (int) (Math.random() * (sup - inf + 1));
        }
        return mat;
    }

    /**
     * Crea una cadena de texto formateada con la matriz y la muestra en
     * taPantalla
     *
     * @param mat es la matriz a mostrar
     */
    private void mostra(int[] mat) {
        taPantalla.setText("");
        for (int i = 0; i < mat.length; i++) {
            taPantalla.append(mat[i] + ((i + 1) % 10 == 0 ? "\n" : ", "));
        }
        taPantalla.append("\n");
    }

    /**
     * Averigua cuál es el número más pequeño, cuál es el más grande y los
     * muestra en taPantalla
     *
     * @param mat es la matriz de enteros
     */
    private void mostraMaxMin(int[] mat) {
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i] > mat[iMax]) {
                iMax = i;
            }
            if (mat[i] < mat[iMin]) {
                iMin = i;
            }
        }
        taPantalla.append("El menor és " + mat[iMin] + " i està en l'índex " + iMin + "\n");
        taPantalla.append("El major és " + mat[iMax] + " i està en l'índex " + iMax + "\n");
    }

}
