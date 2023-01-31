/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Cristobal Gonzalez Pallare
 * @version 1.0, 29/01/2023
 */
public class PFons extends javax.swing.JPanel {

    /**
     * Creates new form PFons
     */
    public PFons() {
        initComponents();
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar el
     * formulario.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este metodo coge una un grafico y le inserta una imagen
     *
     * @param g es el gráfico que sobreescribe
     */
    @Override
    public void paint(Graphics g) {
        Image img = new javax.swing.ImageIcon(getClass().getResource("/img/borla.jpg")).getImage();
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
