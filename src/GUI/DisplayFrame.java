/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MainAndSys.VideogameSys;

/**
 *
 * @author ahmet
 */
public class DisplayFrame extends javax.swing.JFrame {

    /**
     * Creates new form DisplayFrame
     */
    public DisplayFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayD = new javax.swing.JButton();
        DisplayC = new javax.swing.JButton();
        DisplayT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayD.setText("DISPLAY");
        DisplayD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayDActionPerformed(evt);
            }
        });

        DisplayC.setText("CLOSE");
        DisplayC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(DisplayD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(DisplayC)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DisplayT)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DisplayD)
                    .addComponent(DisplayC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisplayT, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayDActionPerformed
        // TODO add your handling code here:
        DisplayT.setText(VideogameSys.displayClients());
    }//GEN-LAST:event_DisplayDActionPerformed

    private void DisplayCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayCActionPerformed
        // TODO add your handling code here:
        DisplayT.setText("");
        dispose();
    }//GEN-LAST:event_DisplayCActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayC;
    private javax.swing.JButton DisplayD;
    private javax.swing.JTextField DisplayT;
    // End of variables declaration//GEN-END:variables
}
