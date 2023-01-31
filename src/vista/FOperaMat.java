/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JLabel;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 *
 */
public class FOperaMat extends javax.swing.JFrame {

    private int[][] matriu1;
    private int[][] matriu2;

    /**
     * Crea el nuevo formulario FOperaMat
     * <p>
     * Crea las matrices, las rellena, hace la operación y visualiza las tres
     * matrices</p>
     */
    public FOperaMat() {
        initComponents();
        setLocationRelativeTo(this);
        matriu1 = new int[5][5];
        canviaValors(matriu1);
        mostraMatriu(eMatriu1, matriu1);
        matriu2 = new int[5][5];
        canviaValors(matriu2);
        mostraMatriu(eMatriu2, matriu2);
        ferOperacio();
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el
     * formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eMatriu1 = new javax.swing.JLabel();
        tbOperacio = new javax.swing.JToggleButton();
        eResultat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eMatriu2 = new javax.swing.JLabel();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eMatriu1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        eMatriu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMatriu1.setText("mat1");
        eMatriu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eMatriu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMatriu1MouseClicked(evt);
            }
        });

        tbOperacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mes50.png"))); // NOI18N
        tbOperacio.setBorderPainted(false);
        tbOperacio.setContentAreaFilled(false);
        tbOperacio.setFocusPainted(false);
        tbOperacio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/per50.png"))); // NOI18N
        tbOperacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbOperacioActionPerformed(evt);
            }
        });

        eResultat.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        eResultat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eResultat.setText("mat3");
        eResultat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual50.png"))); // NOI18N

        eMatriu2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        eMatriu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eMatriu2.setText("mat2");
        eMatriu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eMatriu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMatriu2MouseClicked(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eMatriu1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbOperacio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eMatriu2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(eResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eMatriu2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(tbOperacio))
                            .addComponent(eMatriu1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eResultat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * ejecuta una vez se hace click en eMatriu1, cambia los valores de matriu1,
     * muestra la matriz en eMatriu1 y vuelve a hacer la operación
     *
     * @param evt es el evento
     */
    private void eMatriu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMatriu1MouseClicked

        canviaValors(matriu1);
        mostraMatriu(eMatriu1, matriu1);
        ferOperacio();

        /**
         * ejecuta una vez se hace click en eMatriu2, cambia los valores de
         * matriu2, muestra la matriz en eMatriu2 y vuelve a hacer la operación
         *
         * @param evt es el evento
         */
    }//GEN-LAST:event_eMatriu1MouseClicked

    private void eMatriu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMatriu2MouseClicked

        canviaValors(matriu2);
        mostraMatriu(eMatriu2, matriu2);
        ferOperacio();

    }//GEN-LAST:event_eMatriu2MouseClicked

    private void tbOperacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbOperacioActionPerformed

        ferOperacio();


    }//GEN-LAST:event_tbOperacioActionPerformed
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


        /* Crea y muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOperaMat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel eMatriu1;
    private javax.swing.JLabel eMatriu2;
    private javax.swing.JLabel eResultat;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton tbOperacio;
    // End of variables declaration//GEN-END:variables
    /**
     * coge una matriz y la rellena de números aleatorios entre -9 y 9
     *
     * @param matriu es la matriz a rellenar
     */
    private void canviaValors(int[][] matriu) {
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                matriu[fila][columna] = getAleatori(-9, 9);
            }
        }
    }

    /**
     * Coge dos números y crea un número aleatorio entre esos dos
     *
     * @param inf es el número inferior
     * @param sup es el número superior
     * @return un número aleatorio entre inferior y superior
     */
    private int getAleatori(int inf, int sup) {
        if (inf > sup) {
            return getAleatori(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }

    /**
     * Coge una matriz y una etiqueta, coge la matriz, la transforma a una
     * cadena de texto en html y la printea en la etiqueta
     *
     * @param etiqueta es el <code>jLabel</code> donde printea la matriz
     * @param matriu es la matriz que va a printear
     */
    private void mostraMatriu(JLabel etiqueta, int[][] matriu) {
        String codiHtml = "<html>";
        for (int fila = 0; fila < matriu.length; fila++) {
            codiHtml += "<p>";
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                codiHtml += "<span style='color:red;'>"
                        + getTxt(matriu[fila][columna])
                        + "</span>";
            }
            codiHtml += "</p>";
        }
        codiHtml += "</html>";
        etiqueta.setText(codiHtml);
    }

    /**
     * Crea una matriz nueva para guardar el resultado de las dos matrices y
     * dependiendo del estado de tbOperacio suma o multiplica estas y la printea
     * en la etiqueta eResultat
     */
    private void ferOperacio() {
        int[][] resultat;
        if (tbOperacio.isSelected()) {
            resultat = producte();
        } else {
            resultat = suma();
        }
        mostraMatriu(eResultat, resultat);
    }

    /**
     * coge un número, crea una cadena de texto con este número y le añade
     * espacios hasta que la longitud sea 5
     *
     * @param num es el número que quiere convertir a cadena de texto formateada
     * @return una cadena de texto con el número + los espacis necesarios
     */
    private String getTxt(int num) {
        String txtNum = num + "";
        while (txtNum.length() <= 5) {
            txtNum = "\u00a0" + txtNum;
        }
        return txtNum;
    }

    /**
     * coge dos matrices, las multiplica y rellena una nueva matriz con el
     * resultado
     *
     * @return el resultado de la multiplicación de las dos matrices
     */
    private int[][] producte() {
        int[][] producte = new int[5][5];
        for (int fila = 0; fila < matriu1.length; fila++) {
            for (int columna = 0; columna < matriu2[0].length; columna++) {
                for (int m = 0; m < matriu2.length; m++) {
                    producte[fila][columna] += matriu1[fila][m] * matriu2[m][columna];
                }
            }
        }

        return producte;
    }

    /**
     * coge dos matrices, las suma y rellena una nueva matriz con el resultado
     *
     * @return el resultado de la suma de las dos matrices
     */
    private int[][] suma() {
        int[][] suma = new int[5][5];
        for (int fila = 0; fila < suma.length; fila++) {
            for (int columna = 0; columna < suma[fila].length; columna++) {
                suma[fila][columna] = matriu1[fila][columna] + matriu2[fila][columna];
            }
        }
        return suma;
    }
}
