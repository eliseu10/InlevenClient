/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inleven;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliseu
 */
public class ClassifyWork extends javax.swing.JFrame {
    private static ObjectOutputStream out = null;
    private static ObjectInputStream in = null;
    ActualState hr = null;
    int classification = 0;
    /**
     * Creates new form ClassifyWork
     */
    public ClassifyWork(ObjectOutputStream out, ObjectInputStream in, ActualState hr) {
        initComponents();
        ClassifyWork.out = out;
        ClassifyWork.in = in;
        this.hr = hr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jIDrequest = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCleaning = new javax.swing.JCheckBox();
        jCleaning1 = new javax.swing.JCheckBox();
        jCleaning2 = new javax.swing.JCheckBox();
        jCleaning3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCleaning4 = new javax.swing.JCheckBox();
        jCleaning5 = new javax.swing.JCheckBox();
        jBlogin = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(362, 338));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("CLASSIFY WORK");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setText("Request number:");

        jScrollPane1.setViewportView(jIDrequest);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("Puntuality:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Quality off work: ");

        jCleaning.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning.setText("Good");
        jCleaning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaningActionPerformed(evt);
            }
        });

        jCleaning1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning1.setText("Bad");
        jCleaning1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaning1ActionPerformed(evt);
            }
        });

        jCleaning2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning2.setText("Good");
        jCleaning2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaning2ActionPerformed(evt);
            }
        });

        jCleaning3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning3.setText("Bad");
        jCleaning3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaning3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel5.setText("Empathy:");

        jCleaning4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning4.setText("Good");
        jCleaning4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaning4ActionPerformed(evt);
            }
        });

        jCleaning5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCleaning5.setText("Bad");
        jCleaning5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCleaning5ActionPerformed(evt);
            }
        });

        jBlogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBlogin.setText("Confirm");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });

        jExit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jExit.setText("Back");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
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
                        .addComponent(jBlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCleaning4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCleaning5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCleaning2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCleaning3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCleaning)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCleaning1))))
                            .addComponent(jLabel3))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCleaning)
                    .addComponent(jCleaning1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCleaning2)
                    .addComponent(jCleaning3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCleaning4)
                    .addComponent(jCleaning5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlogin)
                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCleaningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaningActionPerformed
        // TODO add your handling code here:
        classification++;
    }//GEN-LAST:event_jCleaningActionPerformed

    private void jCleaning1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaning1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCleaning1ActionPerformed

    private void jCleaning2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaning2ActionPerformed
        // TODO add your handling code here:
        classification++;
    }//GEN-LAST:event_jCleaning2ActionPerformed

    private void jCleaning3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaning3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCleaning3ActionPerformed

    private void jCleaning4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaning4ActionPerformed
        // TODO add your handling code here:
        classification++;
    }//GEN-LAST:event_jCleaning4ActionPerformed

    private void jCleaning5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCleaning5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCleaning5ActionPerformed

    private void jBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloginActionPerformed
        // TODO add your handling code here:
        try {
            hr.typeRequest = "classifywork";
            hr.IDreq = jIDrequest.getText();
            hr.Classification = Integer.toString(classification);
            out.writeObject(hr);
            out.flush();
            hr = (ActualState) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(MenuVolunteer.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        MenuPatient patientMenu = new MenuPatient(out, in, hr);
        patientMenu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jBloginActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuPatient patientMenu = new MenuPatient(out, in, hr);
        patientMenu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassifyWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassifyWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassifyWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassifyWork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlogin;
    private javax.swing.JCheckBox jCleaning;
    private javax.swing.JCheckBox jCleaning1;
    private javax.swing.JCheckBox jCleaning2;
    private javax.swing.JCheckBox jCleaning3;
    private javax.swing.JCheckBox jCleaning4;
    private javax.swing.JCheckBox jCleaning5;
    private javax.swing.JButton jExit;
    private javax.swing.JTextPane jIDrequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
