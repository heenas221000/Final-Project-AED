/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Lawyer;

import business.EcoSystem;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetal
 */
public class LawyerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LawyerRequestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    LawyerWorkRequest request;
    
    Network network;
    public LawyerRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount,Organization organization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=organization;
        this.userAccount = userAccount;
      
        populateTable();
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
        tb_LawyerManageRequest = new javax.swing.JTable();
        bt_AssignRequest = new javax.swing.JButton();
        bt_ViewCase = new javax.swing.JButton();
        bt_Encounter = new javax.swing.JButton();
        bt_CaseComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        lblHeader.setBackground(new java.awt.Color(153, 204, 255));
        lblHeader.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 0, 204));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("MANAGE REQUESTS");

        tb_LawyerManageRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "TIME OF ASSAULT", "STATUS", "ASSIGNED TO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_LawyerManageRequest);

        bt_AssignRequest.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_AssignRequest.setForeground(new java.awt.Color(0, 0, 204));
        bt_AssignRequest.setText("ASSIGN REQUEST");
        bt_AssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_AssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_AssignRequestMouseExited(evt);
            }
        });
        bt_AssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AssignRequestActionPerformed(evt);
            }
        });

        bt_ViewCase.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_ViewCase.setForeground(new java.awt.Color(0, 0, 204));
        bt_ViewCase.setText("VIEW CASE REPORT");
        bt_ViewCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ViewCaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ViewCaseMouseExited(evt);
            }
        });
        bt_ViewCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ViewCaseActionPerformed(evt);
            }
        });

        bt_Encounter.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Encounter.setForeground(new java.awt.Color(0, 0, 204));
        bt_Encounter.setText("ENCOUNTER");
        bt_Encounter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_EncounterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_EncounterMouseExited(evt);
            }
        });
        bt_Encounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EncounterActionPerformed(evt);
            }
        });

        bt_CaseComplete.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_CaseComplete.setForeground(new java.awt.Color(0, 0, 204));
        bt_CaseComplete.setText("CASE COMPLETE");
        bt_CaseComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_CaseCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_CaseCompleteMouseExited(evt);
            }
        });
        bt_CaseComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CaseCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_ViewCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_AssignRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_CaseComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Encounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(149, 149, 149))
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_CaseComplete)
                    .addComponent(bt_AssignRequest))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ViewCase)
                    .addComponent(bt_Encounter))
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AssignRequestMouseEntered
        bt_AssignRequest.setForeground(new Color(0,128,128));         // TODO add your handling code here:
    }//GEN-LAST:event_bt_AssignRequestMouseEntered

    private void bt_AssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AssignRequestMouseExited
        bt_AssignRequest.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_bt_AssignRequestMouseExited

    private void bt_AssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AssignRequestActionPerformed

        int selectedRow = tb_LawyerManageRequest.getSelectedRow();
        WorkRequest request = (LawyerWorkRequest)tb_LawyerManageRequest.getValueAt(selectedRow, 2);
        if (CheckOpenCases(userAccount) == 0){
            request.setReceiver(userAccount);
            request.setStatus("Accepted");
            populateTable();
        }else
        {
            JOptionPane.showMessageDialog(null, "Only one case can be accepted at a time");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_AssignRequestActionPerformed

    private void bt_ViewCaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ViewCaseMouseEntered
        bt_ViewCase.setForeground(new Color(0,128,128));         // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCaseMouseEntered

    private void bt_ViewCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ViewCaseMouseExited
        bt_ViewCase.setForeground(Color.black);         // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCaseMouseExited

    private void bt_ViewCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ViewCaseActionPerformed

        int selectedRow = tb_LawyerManageRequest.getSelectedRow();
        String sta=tb_LawyerManageRequest.getValueAt(selectedRow, 2).toString();
        String status="Waiting";
        //        if(sta.equalsIgnoreCase(status))
        //        {
            //            JOptionPane.showMessageDialog(null, "Access Denied");
            //        }
        //        else{
            if (selectedRow < 0){
                return;
            }

            LawyerWorkRequest request = (LawyerWorkRequest)tb_LawyerManageRequest.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{

                CaseReportLJPanel caseReportJPanel = new CaseReportLJPanel(userProcessContainer,system,request.getCaseReporterWorkRequest(),userAccount,network);
                userProcessContainer.add("caseReportJPanel", caseReportJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
                casereportJPanel.setVisible(true);*/
                // }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCaseActionPerformed

    private void bt_EncounterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EncounterMouseEntered
        bt_Encounter.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_EncounterMouseEntered

    private void bt_EncounterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_EncounterMouseExited
        bt_Encounter.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_EncounterMouseExited

    private void bt_EncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EncounterActionPerformed

        int selectedRow = tb_LawyerManageRequest.getSelectedRow();

        String sta=tb_LawyerManageRequest.getValueAt(selectedRow, 2).toString();
        String status="Waiting";
        //        if(sta.equalsIgnoreCase(status))
        //        {
            //            JOptionPane.showMessageDialog(null, "Access Denied");
            //        }
        //        else{
            if (selectedRow < 0){
                return;
            }
            LawyerWorkRequest request = (LawyerWorkRequest)tb_LawyerManageRequest.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }
            else{
                LawyerEncounterJPanel lencounterJPanel = new LawyerEncounterJPanel(userProcessContainer,system,userAccount,network,organization,request);
                userProcessContainer.add("caseReportJPanel", lencounterJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            // }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_EncounterActionPerformed

    private void bt_CaseCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CaseCompleteMouseEntered
        bt_CaseComplete.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CaseCompleteMouseEntered

    private void bt_CaseCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CaseCompleteMouseExited
        bt_CaseComplete.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CaseCompleteMouseExited

    private void bt_CaseCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CaseCompleteActionPerformed
        int selectedRow = tb_LawyerManageRequest.getSelectedRow();

        String sts="Waiting";
        String sta=tb_LawyerManageRequest.getValueAt(selectedRow, 2).toString();
        if(sts.equalsIgnoreCase(sta))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else{
            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (LawyerWorkRequest)tb_LawyerManageRequest.getValueAt(selectedRow, 2);
            request.setReceiver(userAccount);
            request.setStatus("Case Completed");
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CaseCompleteActionPerformed
private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tb_LawyerManageRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(LawyerWorkRequest request : organization.getWorkQueue().getLawyerworkRequestList())
         {
         
            row[0]=request.getCaseReporterWorkRequest().getUserName();
            row[1] = request.getCaseReporterWorkRequest().getDoi();
            row[2] = request;
            if (request.getReceiver()==null){
              row[3] = "Not Assigned";
            }else{
              row[3] = request.getReceiver();
            }
            
            model.addRow(row);
        }
        
    }
    
    private int CheckOpenCases(UserAccount userAccount) {
        int a = 0;
        for(LawyerWorkRequest request : organization.getWorkQueue().getLawyerworkRequestList())
        {
        
          if (request.getReceiver()==userAccount){
              if (request.getStatus().equalsIgnoreCase("Accepted")){
                  a = a + 1;
              }
          } 
        }
        return a; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AssignRequest;
    private javax.swing.JButton bt_CaseComplete;
    private javax.swing.JButton bt_Encounter;
    private javax.swing.JButton bt_ViewCase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tb_LawyerManageRequest;
    // End of variables declaration//GEN-END:variables
}
