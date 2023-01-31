/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Gonzalez Pallares
 * @version 1.0, 29/01/2023
 * 
 */
public class FManejaMat extends javax.swing.JFrame {

    private int[][] matriu;

    /**
     * Crea el formulario FManejaMat
     */
    public FManejaMat() {
        initComponents();
        matriu = new int[2][2];
        setLocationRelativeTo(this);
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        bCreaMatriu = new javax.swing.JButton();
        bCreaUnitaria = new javax.swing.JButton();
        bCreaSimetrica = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bMostraMatriu = new javax.swing.JButton();
        bMostraMaxMin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bCanviaValor = new javax.swing.JButton();
        bTransposa = new javax.swing.JButton();
        bTanca = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        bCreaMatriu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCreaMatriu.setText("matriu");
        bCreaMatriu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaMatriuActionPerformed(evt);
            }
        });

        bCreaUnitaria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCreaUnitaria.setText("unitaria");
        bCreaUnitaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaUnitariaActionPerformed(evt);
            }
        });

        bCreaSimetrica.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCreaSimetrica.setText("simètrica");
        bCreaSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaSimetricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCreaSimetrica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCreaUnitaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCreaMatriu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bCreaMatriu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCreaUnitaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCreaSimetrica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOSTRA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        bMostraMatriu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bMostraMatriu.setText("matriu");
        bMostraMatriu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostraMatriuActionPerformed(evt);
            }
        });

        bMostraMaxMin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bMostraMaxMin.setText("max/min");
        bMostraMaxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostraMaxMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bMostraMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bMostraMatriu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bMostraMatriu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMostraMaxMin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        bCanviaValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCanviaValor.setText("canvia valor");
        bCanviaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCanviaValorActionPerformed(evt);
            }
        });

        bTransposa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bTransposa.setText("transposa");
        bTransposa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransposaActionPerformed(evt);
            }
        });

        bTanca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bTanca.setText("tanca");
        bTanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTancaActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCanviaValor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bTransposa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bTanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCanviaValor, bTanca, bTransposa});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCanviaValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTransposa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTanca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Pide el tamaño de la matriz a crear, si no es nulo, y si algun dato no es menor que dos, crea la matriz unitaria
     * @param evt es el evento
     */
    private void bCreaUnitariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaUnitariaActionPerformed

        String grandaria = JOptionPane.showInputDialog(this, "Entra la grandària");
        if (grandaria != null) {
            int files = Integer.parseInt(grandaria);
            files = files < 2 ? 2 : files;
            matriu = new int[files][files];
            taPantalla.append("\ncrea una matriu unitària de " + files + "x" + files + "\n");
            for (int fila = 0; fila < matriu.length; fila++) {
                matriu[fila][fila] = 1;
            }
        }

    }//GEN-LAST:event_bCreaUnitariaActionPerformed
    /**
     * Pide el tamaño de la matriz a crear, si no es nulo, y si algun dato no es menor que dos, crea la matriz
     * con el tamaño proporcionado y la rellena con enteros entre -99 y 99
     * @param evt es el evento
     */
    private void bCreaMatriuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaMatriuActionPerformed

        String filesColumnes = JOptionPane.showInputDialog(this, "Entra 'files/columnes'");
        if (filesColumnes != null) {
            String[] dades = filesColumnes.split("/");
            if (dades.length == 2) {
                int files = Integer.parseInt(dades[0]);
                files = files < 2 ? 2 : files;
                int columnes = Integer.parseInt(dades[1]);
                columnes = columnes < 2 ? 2 : columnes;
                matriu = new int[files][columnes];
                taPantalla.append("\ncrea una matriu de " + files + "x" + columnes + "\n");
                for (int fila = 0; fila < matriu.length; fila++) {
                    for (int columna = 0; columna < matriu[0].length; columna++) {
                        matriu[fila][columna] = -99 + (int) (Math.random() * 199);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "has d'introduir 'files/columnes'");
            }
        }


    }//GEN-LAST:event_bCreaMatriuActionPerformed
    /**
     * Pide el tamaño de la matriz a crear, si no es nulo, y si algun dato no es menor que dos, crea la matriz
     * con el tamaño proporcionado y crea la matriz simetrica con enteros entre -99 y 99
     * @param evt es el evento
     */
    private void bCreaSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaSimetricaActionPerformed

        String grandaria = JOptionPane.showInputDialog(this, "Entra la grandària");
        if (grandaria != null) {
            int files = Integer.parseInt(grandaria);
            files = files < 2 ? 2 : files;
            matriu = new int[files][files];
            taPantalla.append("\ncrea una matriu unitària de " + files + "x" + files + "\n");
            for (int fila = 0; fila < matriu.length; fila++) {
                for (int columna = fila; columna < matriu[fila].length; columna++) {
                    int numa = -99 + (int) (Math.random() * 199);
                    matriu[fila][columna] = numa;
                    matriu[columna][fila] = numa;
                }

            }
        }

    }//GEN-LAST:event_bCreaSimetricaActionPerformed
    /**
     * Crea una cadena formateada con la matriz creada anteriormente y la muestra en taPantalla
     * @param evt es el evento
     */
    private void bMostraMatriuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostraMatriuActionPerformed

        String cad = "\nels elements de la matriu son\n";
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[0].length; columna++) {
                cad += String.format("%5d", matriu[fila][columna]);
            }
            cad += "\n";
        }
        taPantalla.append(cad);

    }//GEN-LAST:event_bMostraMatriuActionPerformed
    /**
     * Coge una matriz de enteros y averigua cual es el número mayor y el menor
     * crea una cadena de texto y lo muestra en taPantalla
     * @param evt es el evento
     */
    private void bMostraMaxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostraMaxMinActionPerformed
        int max = matriu[0][0];
        int min = matriu[0][0];
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[0].length; columna++) {
                if (matriu[fila][columna] > max) {
                    max = matriu[fila][columna];
                }
                if (matriu[fila][columna] < min) {
                    min = matriu[fila][columna];
                }
            }
        }
        taPantalla.append("\nel màxim és " + max + " i el mínim és " + min + "\n");

    }//GEN-LAST:event_bMostraMaxMinActionPerformed
    /**
     * Pide la fila que quieres modificar, si el número introducido no es nulo ni negativo y está en el tamaño de filas de la
     * matriz, pide la columna, comprueba que el dato introducido no está vacio y que está en el tamaño de las columnas de la 
     * matriz y por último pide el nuevo valor y lo sustituye
     * @param evt es el evento
     */
    private void bCanviaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCanviaValorActionPerformed
        String cadFila = JOptionPane.showInputDialog(this, "Fila =");
        if (cadFila != null) {
            int fila = Integer.parseInt(cadFila);
            if (fila < 0 || fila >= matriu.length) {
                JOptionPane.showMessageDialog(rootPane, "la fila va de 0 a " + (matriu.length - 1));
            } else {
                String cadCol = JOptionPane.showInputDialog(this, "Columna =");
                if (cadCol != null) {
                    int columna = Integer.parseInt(cadCol);
                    if (columna < 0 || columna >= matriu[fila].length) {
                        JOptionPane.showMessageDialog(rootPane, "la columna va de 0 a " + (matriu[fila].length - 1));
                    } else {
                        String cadValor = JOptionPane.showInputDialog(this, "Valor =");
                        if (cadValor != null) {
                            int valor = Integer.parseInt(cadValor);
                            if (valor < -99 || valor > 99) {
                                JOptionPane.showMessageDialog(rootPane, "el valor va de -99 a 99");
                            } else {
                                matriu[fila][columna] = valor;
                            }
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_bCanviaValorActionPerformed
    /**
     * Coge una matriz y cambia sus filas por sus columnas 
     * @param evt es el evento
     */
    private void bTransposaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransposaActionPerformed
        
        int[][] nova = new int[matriu[0].length][matriu.length];
        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[0].length; columna++) {
                nova[columna][fila] = matriu[fila][columna];
            }
        }
        matriu = nova;
        
    }//GEN-LAST:event_bTransposaActionPerformed
    /**
     * Cierra el formulario
     * @param evt es el evento
     */
    private void bTancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTancaActionPerformed

        System.exit(0);

    }//GEN-LAST:event_bTancaActionPerformed
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
                new FManejaMat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCanviaValor;
    private javax.swing.JButton bCreaMatriu;
    private javax.swing.JButton bCreaSimetrica;
    private javax.swing.JButton bCreaUnitaria;
    private javax.swing.JButton bMostraMatriu;
    private javax.swing.JButton bMostraMaxMin;
    private javax.swing.JButton bTanca;
    private javax.swing.JButton bTransposa;
    private javax.swing.JButton bVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taPantalla;
    // End of variables declaration//GEN-END:variables

}
