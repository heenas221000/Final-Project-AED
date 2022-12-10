/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Caretaker;

/**
 *
 * @author hetal
 */


import business.EcoSystem;
import business.Encounter.EncounterCaretaker;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaretakerWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.Caretaker.CaretakerJPanel;


public class CaretakerEncounterJPanel extends javax.swing.JPanel {

       JPanel userProcessContainer;
    EcoSystem system;
    CaretakerWorkRequest request;
    UserAccount userAccount;
    Network network;
    Organization organization;
    public CaretakerEncounterJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Network network, Organization organization, CaretakerWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        this.organization=organization;
        this.request=request;
        populateName();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_EncounterNo = new javax.swing.JTextField();
        lbl_Minutes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaMinutes = new javax.swing.JTextArea();
        bt_Back = new javax.swing.JButton();
        txt_Name = new javax.swing.JTextField();
        lbl_Header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounterDetails = new javax.swing.JTable();
        bt_Update = new javax.swing.JButton();
        lbl_Name = new javax.swing.JLabel();
        lbl_EncounterNo = new javax.swing.JLabel();

        lbl_Minutes.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lbl_Minutes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_Minutes.setText("Minutes of Encounter");

        txtAreaMinutes.setColumns(20);
        txtAreaMinutes.setRows(5);
        jScrollPane2.setViewportView(txtAreaMinutes);

        bt_Back.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_Back.setText("Back");
        bt_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_BackMouseExited(evt);
            }
        });
        bt_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BackActionPerformed(evt);
            }
        });

        txt_Name.setEnabled(false);

        lbl_Header.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lbl_Header.setForeground(new java.awt.Color(51, 102, 255));
        lbl_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Header.setText("Encounters");

        tblEncounterDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Encounter No.", "Minutes of Encounter"
            }
        ));
        jScrollPane1.setViewportView(tblEncounterDetails);

        bt_Update.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_Update.setText("Update");
        bt_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_UpdateMouseExited(evt);
            }
        });
        bt_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_UpdateActionPerformed(evt);
            }
        });

        lbl_Name.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lbl_Name.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_Name.setText("Name");

        lbl_EncounterNo.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lbl_EncounterNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_EncounterNo.setText("Encounter no");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_EncounterNo))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_EncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bt_Back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(bt_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(bt_Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(61, 61, 61)
                        .addComponent(bt_Update)
                        .addGap(206, 206, 206))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_EncounterNo)
                            .addComponent(txt_EncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(281, 281, 281))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BackMouseEntered
        // TODO add your handling code here:

        bt_Back.setForeground(new Color(0,128,128));
    }//GEN-LAST:event_bt_BackMouseEntered

    private void bt_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BackMouseExited
        // TODO add your handling code here:

        bt_Back.setForeground(Color.black);

    }//GEN-LAST:event_bt_BackMouseExited

    private void bt_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CaretakerJPanel sysAdminwjp = (CaretakerJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_bt_BackActionPerformed

    private void bt_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_UpdateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_UpdateMouseEntered

    private void bt_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_UpdateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_UpdateMouseExited

    private void bt_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UpdateActionPerformed
        // TODO add your handling code here:
        if(txt_EncounterNo.getText().equalsIgnoreCase("") && txtAreaMinutes.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill the necessary fields");
        }
        else{
            EncounterCaretaker encounterCaretaker =new EncounterCaretaker();
            encounterCaretaker.setEncounter(txt_EncounterNo.getText());
            encounterCaretaker.setMinutes(txtAreaMinutes.getText());

            request.getCaretakerEncounter().add(encounterCaretaker);
            populateName();
            txt_EncounterNo.setText("");
            txtAreaMinutes.setText("");
        }
    }//GEN-LAST:event_bt_UpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Back;
    private javax.swing.JButton bt_Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_EncounterNo;
    private javax.swing.JLabel lbl_Header;
    private javax.swing.JLabel lbl_Minutes;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JTable tblEncounterDetails;
    private javax.swing.JTextArea txtAreaMinutes;
    private javax.swing.JTextField txt_EncounterNo;
    private javax.swing.JTextField txt_Name;
    // End of variables declaration//GEN-END:variables

 private void populateName() {

        txt_Name.setText(request.getCaseReporterWorkRequest().getUserName());


        DefaultTableModel model= (DefaultTableModel) tblEncounterDetails.getModel();
        Object[] row=new Object[2];
        model.setRowCount(0);

        for (EncounterCaretaker l: request.getCaretakerEncounter()){
            row[0] = l.getEncounter();
            row[1] = l.getMinutes();
            model.addRow(row);
        }
    }








}
