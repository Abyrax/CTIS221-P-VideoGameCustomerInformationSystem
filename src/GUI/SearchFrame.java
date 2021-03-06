/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MainAndSys.VideogameSys;
import javax.swing.JComboBox;

/**
 *
 * @author ahmet
 */
public class SearchFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchFrame
     */
    public SearchFrame() {
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

        selectVG = new javax.swing.JLabel();
        titleCMB = new javax.swing.JComboBox<>();
        searchT = new javax.swing.JTextField();
        searchClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectVG.setText("Select Video Game :");

        titleCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleCMBActionPerformed(evt);
            }
        });

        searchClose.setText("CLOSE");
        searchClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchT)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectVG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleCMB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(searchClose)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectVG)
                    .addComponent(titleCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchT, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchClose)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCloseActionPerformed
        // TODO add your handling code here:
        searchT.setText("");
        dispose();
    }//GEN-LAST:event_searchCloseActionPerformed

    private void titleCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleCMBActionPerformed
        // TODO add your handling code here:
        searchT.setText(VideogameSys.searchVideoGame((String) titleCMB.getSelectedItem()).toString());
    }//GEN-LAST:event_titleCMBActionPerformed

                                     
      
    public JComboBox getTitleCMB() {
        return titleCMB;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchClose;
    private javax.swing.JTextField searchT;
    private javax.swing.JLabel selectVG;
    private javax.swing.JComboBox<String> titleCMB;
    // End of variables declaration//GEN-END:variables
}
