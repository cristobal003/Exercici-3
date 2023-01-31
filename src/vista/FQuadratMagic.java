/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 *
 */
public class FQuadratMagic extends javax.swing.JFrame {

    /**
     * Crea el nuevo formulario FQuadratMagic
     */
    public FQuadratMagic() {
        setContentPane(new PFons());
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

        jLabel1 = new javax.swing.JLabel();
        tfGrandaria = new javax.swing.JTextField();
        bCreaQuadratMagic = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Entra la grandària del quadrat màgic");

        tfGrandaria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfGrandaria.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfGrandaria.setText("3");

        bCreaQuadratMagic.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCreaQuadratMagic.setText("Crea Quadrat màgic");
        bCreaQuadratMagic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaQuadratMagicActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfGrandaria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCreaQuadratMagic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGrandaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCreaQuadratMagic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(193, 193, 193))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * ejecuta una vez se presiona el botón bCreaQuadratMagic, coge el cuadrado
     * mágico y lo printea en DQuadratMagic
     *
     * @param evt es el evento
     */
    private void bCreaQuadratMagicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaQuadratMagicActionPerformed

        int grandaria = Integer.parseInt(tfGrandaria.getText());
        if (grandaria % 2 != 0) {
            DQuadratMagic dialeg = new DQuadratMagic(this, true);
            dialeg.setQuadrat(creaQuadratMagic(grandaria));
            dialeg.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "la grandària ha de ser un enter imparell");
        }


    }//GEN-LAST:event_bCreaQuadratMagicActionPerformed
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
                new FQuadratMagic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreaQuadratMagic;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfGrandaria;
    // End of variables declaration//GEN-END:variables
    /**
     * Crea una matriz de enteros con el tamaño entregado por el usuario y crea
     * el cuadrado mágico
     * <p>
     * Crea una cadena de texto con <code>html</code> para poder printear el
     * cuadrado mágico</p>
     *
     * @param grandaria es el número introducido por el usuario
     * @return una cadena de texto con el cuadrado mágico formateado
     */
    private String creaQuadratMagic(int grandaria) {

        int[][] matriu = new int[grandaria][grandaria];
        int fila = (int) (Math.random() * grandaria);
        int columna = grandaria / 2;
        int limit = grandaria * grandaria;
        int n = 1;
        while (n <= limit) {
            matriu[fila][columna] = n;
            if (n % grandaria == 0) {
                fila++;
            } else {
                fila--;
                columna++;
            }
            if (fila < 0 && columna == grandaria) {
                fila = grandaria - 1;
                columna = 0;
            } else if (fila < 0) {
                fila = grandaria - 1;
            } else if (fila == grandaria) {
                fila = 0;
            } else if (columna == grandaria) {
                columna = 0;
            }
            n++;
        }
        int nCarMin = (limit + "").length() + 1;

        String cad = "<html>";
        for (fila = 0; fila < grandaria; fila++) {
            cad += "<p>";
            for (columna = 0; columna < grandaria; columna++) {
                cad += getEspais(nCarMin, matriu[fila][columna]);
            }
            cad += "</p>";
        }
        return cad + "</html>";
    }

    /**
     * añade los espacios y el valor de matriu[fila][columna]
     *
     * @param nCar es el número de carácteres mínimos
     * @param valor es el entero de matriu[fila][columna]
     * @return una cadena de texto con los espacios y el valor
     */
    private String getEspais(int nCar, int valor) {
        int nCarVal = (valor + "").length();
        String cad = "";
        for (int i = nCarVal; i < nCar; i++) {
            cad += "\u00a0";
        }
        return cad + valor;
    }
}
