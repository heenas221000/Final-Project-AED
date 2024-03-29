/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Counsellor;

import business.EcoSystem;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author dax98
 */
public class CounsellorPrescribeMedicinesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellorPrescribeMedicinesJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public CounsellorPrescribeMedicinesJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrescriptionDetails = new javax.swing.JTable();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblDoctorSign = new javax.swing.JLabel();
        txtDoctorSign = new javax.swing.JTextField();
        bt_RequestPharmacist = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(61, 64, 91));
        lblHeader.setText("Prescription");

        tblPrescriptionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Particulars", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblPrescriptionDetails);

        lblDoctorName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDoctorName.setText("Doctor's Name:");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Date:");

        lblDoctorSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDoctorSign.setText("Doctor's Sign:");

        txtDoctorSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorSignActionPerformed(evt);
            }
        });

        bt_RequestPharmacist.setBackground(new java.awt.Color(0, 0, 204));
        bt_RequestPharmacist.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_RequestPharmacist.setForeground(new java.awt.Color(255, 255, 255));
        bt_RequestPharmacist.setText("REQUEST PHARMACIST");
        bt_RequestPharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_RequestPharmacistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_RequestPharmacistMouseExited(evt);
            }
        });
        bt_RequestPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RequestPharmacistActionPerformed(evt);
            }
        });

        bt_back.setBackground(new java.awt.Color(0, 0, 204));
        bt_back.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(255, 255, 255));
        bt_back.setText("Back");
        bt_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(lblHeader))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lblDoctorName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblDoctorSign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDoctorSign, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(bt_RequestPharmacist)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bt_back)
                .addGap(7, 7, 7)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorName)
                    .addComponent(lblDate))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorSign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(bt_RequestPharmacist)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_RequestPharmacistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RequestPharmacistMouseEntered
        bt_RequestPharmacist.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_RequestPharmacistMouseEntered

    private void bt_RequestPharmacistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RequestPharmacistMouseExited
        bt_RequestPharmacist.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_RequestPharmacistMouseExited

    private void bt_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_backMouseEntered
        bt_back.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backMouseEntered

    private void bt_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_backMouseExited
        bt_back.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_backMouseExited

    private void txtDoctorSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorSignActionPerformed

    private void bt_RequestPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RequestPharmacistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_RequestPharmacistActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_RequestPharmacist;
    private javax.swing.JButton bt_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorSign;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblPrescriptionDetails;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorSign;
    // End of variables declaration//GEN-END:variables
}
