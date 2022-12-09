/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CaseVolunteer;

import buisness.Organization.CaseVolunteerOrganization;
import buisness.Organization.Organization;
import javax.swing.JPanel; 
import business.EcoSystem;
import business.Network.Network;
//import business.Organization.CaseVolunteerOrganization;
//import business.Organization.Organization;
import business.UserAccount.UserAccount;
//import business.WorkQueue.CaseReporterWorkRequest;
//import business.WorkQueue.CounsellorWorkRequest;
//import business.WorkQueue.DrWorkRequest;
//import business.WorkQueue.LawyerWorkRequest;
//import business.WorkQueue.CaretakerWorkRequest;
//import business.WorkQueue.PsychiatristWorkRequest;
//import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishwa
 */
public class CaseRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseRequestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization organization; 
    UserAccount userAccount;
    Network network; 
    
    public CaseRequestJPanel(JPanel userProcessContainer, EcoSystem system, Organization organization,UserAccount userAccount,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=(CaseVolunteerOrganization)organization;
        this.userAccount=userAccount;
        this.network = network;
        
        popTable();
        lblReceiver.setVisible(false);
        lblStatus.setVisible(false);
        lblDate.setVisible(false);
        lblDoctor.setVisible(false);
        lblCounsellar.setVisible(false);
        lblLawyer.setVisible(false);
        lblCaretaker.setVisible(false);
        lblPsychiatrist.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCaseReq = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaseRequest = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnViewCaseReport = new javax.swing.JButton();
        btnCheckStatus = new javax.swing.JButton();
        txtPsyhDate = new javax.swing.JLabel();
        txtLawyerReceiver = new javax.swing.JLabel();
        txtLawyerDate = new javax.swing.JLabel();
        txtCousellarStatus = new javax.swing.JLabel();
        txtCounsellarReceiver = new javax.swing.JLabel();
        txtCounsellarDate = new javax.swing.JLabel();
        lblPsychiatrist = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblLawyer = new javax.swing.JLabel();
        txtPsychStatus = new javax.swing.JLabel();
        txtLawyerStatus = new javax.swing.JLabel();
        lblCounsellar = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblReceiver = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPsychReceiver = new javax.swing.JLabel();
        txtDocStatus = new javax.swing.JLabel();
        txtDocReceiver = new javax.swing.JLabel();
        txtDoctorDate = new javax.swing.JLabel();
        lblCaretaker = new javax.swing.JLabel();
        txtCaretakerDate = new javax.swing.JLabel();
        txtCaretakerReceiver = new javax.swing.JLabel();
        txtCaretakerStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(244, 241, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCaseReq.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        lblCaseReq.setForeground(new java.awt.Color(61, 64, 91));
        lblCaseReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaseReq.setText("Case Requests");
        lblCaseReq.setToolTipText("");
        lblCaseReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 28, 879, -1));

        tblCaseRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name ", "Location", "Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCaseRequest);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 490, 130));

        btnAssignRequest.setBackground(new java.awt.Color(129, 178, 154));
        btnAssignRequest.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnAssignRequest.setForeground(new java.awt.Color(61, 64, 91));
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.setBorderPainted(false);
        btnAssignRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });
        jPanel1.add(btnAssignRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 170, 42));

        btnViewCaseReport.setBackground(new java.awt.Color(129, 178, 154));
        btnViewCaseReport.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnViewCaseReport.setForeground(new java.awt.Color(61, 64, 91));
        btnViewCaseReport.setText("View Case Report");
        btnViewCaseReport.setBorderPainted(false);
        btnViewCaseReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewCaseReportMouseExited(evt);
            }
        });
        btnViewCaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCaseReportActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewCaseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 38));

        btnCheckStatus.setBackground(new java.awt.Color(129, 178, 154));
        btnCheckStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnCheckStatus.setForeground(new java.awt.Color(61, 64, 91));
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.setBorderPainted(false);
        btnCheckStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckStatusMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckStatusMouseEntered(evt);
            }
        });
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 143, 42));
        jPanel1.add(txtPsyhDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 93, 26));
        jPanel1.add(txtLawyerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 24));
        jPanel1.add(txtLawyerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 94, 27));
        jPanel1.add(txtCousellarStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 126, 32));
        jPanel1.add(txtCounsellarReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 126, 29));
        jPanel1.add(txtCounsellarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 118, 27));

        lblPsychiatrist.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblPsychiatrist.setForeground(new java.awt.Color(224, 122, 95));
        lblPsychiatrist.setText("Psychiatrist");
        jPanel1.add(lblPsychiatrist, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        lblDoctor.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDoctor.setForeground(new java.awt.Color(224, 122, 95));
        lblDoctor.setText("Doctor");
        jPanel1.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 103, -1));

        lblLawyer.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblLawyer.setForeground(new java.awt.Color(224, 122, 95));
        lblLawyer.setText("Lawyer");
        jPanel1.add(lblLawyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 102, -1));
        jPanel1.add(txtPsychStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 92, 32));
        jPanel1.add(txtLawyerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 100, 30));

        lblCounsellar.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblCounsellar.setForeground(new java.awt.Color(224, 122, 95));
        lblCounsellar.setText("Counsellar");
        jPanel1.add(lblCounsellar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 93, -1));

        lblStatus.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(61, 64, 91));
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 100, 32));

        lblReceiver.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblReceiver.setForeground(new java.awt.Color(61, 64, 91));
        lblReceiver.setText("Receiver:");
        jPanel1.add(lblReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 104, 28));

        lblDate.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(61, 64, 91));
        lblDate.setText("Date:");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 104, 20));
        jPanel1.add(txtPsychReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 93, 28));
        jPanel1.add(txtDocStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 117, 32));
        jPanel1.add(txtDocReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 117, 29));
        jPanel1.add(txtDoctorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 122, 20));

        lblCaretaker.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        lblCaretaker.setForeground(new java.awt.Color(224, 122, 95));
        lblCaretaker.setText("Caretaker");
        jPanel1.add(lblCaretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 102, -1));
        jPanel1.add(txtCaretakerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 94, 27));
        jPanel1.add(txtCaretakerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 100, 24));
        jPanel1.add(txtCaretakerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        
        int i=1;
        if(i<5)
        {
            int selectedRow = tblCaseRequest.getSelectedRow();

            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);
            request.setReceiver(userAccount);
            request.setStatus("Accepted");

            popTable();
            i++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Only 4 cases can be handled");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewCaseReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseEntered
        btnViewCaseReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseEntered

    private void btnViewCaseReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCaseReportMouseExited
        btnViewCaseReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCaseReportMouseExited

    private void btnViewCaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCaseReportActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        CaseReporterWorkRequest request = (CaseReporterWorkRequest)tblCaseRequest.getValueAt(selectedRow, 2);

        if (request.getReceiver()!=userAccount){
            JOptionPane.showMessageDialog(this, "You cannot view the report of the case. Access Denied.");
        }else{

            CaseReportJPanel caseReportJPanel = new CaseReportJPanel(userProcessContainer,system,request,userAccount,network);
            userProcessContainer.add("caseReportJPanel", caseReportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
            casereportJPanel.setVisible(true);*/
        }
    }//GEN-LAST:event_btnViewCaseReportActionPerformed

    private void btnCheckStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckStatusMouseEntered

    private void btnCheckStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckStatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckStatusMouseExited

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblCaseRequest.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        if (selectedRow >= 0) {
            lblReceiver.setVisible(true);
            lblStatus.setVisible(true);
            lblDate.setVisible(true);
            lblDoctor.setVisible(true);
            lblCounsellar.setVisible(true);
            lblLawyer.setVisible(true);
            lblCaretaker.setVisible(true);
            lblPsychiatrist.setVisible(true);
            CaseReporterWorkRequest  CRWorkReq  = (CaseReporterWorkRequest) tblCaseRequest.getValueAt(selectedRow, 2);
            
            if(CRWorkReq.getDoctorWorkRequest()!=null){
                DrWorkRequest D = CRWorkReq.getDoctorWorkRequest();
                txtDoctorDate.setText(D.getRequestDate().toString());
                if(D.getReceiver()==null){
                    txtDocReceiver.setText("Not Assigned");
                }else{
                    txtDocReceiver.setText(D.getReceiver().toString());
                }
                txtDocStatus.setText(D.getStatus());
            }else{
                txtDoctorDate.setText("-");
                txtDocReceiver.setText("-");
                txtDocStatus.setText("-");
            }

            if(CRWorkReq.getCounsellorWorkRequest()!=null){
                CounsellorWorkRequest C = CRWorkReq.getCounsellorWorkRequest();
                txtCounsellarDate.setText(C.getRequestDate().toString());
                if(C.getReceiver()==null){
                    txtCounsellarReceiver.setText("Not Assigned");
                }else{
                    txtCounsellarReceiver.setText(C.getReceiver().toString());
                }
                txtCousellarStatus.setText(C.getStatus());
            }else{
                txtCounsellarDate.setText("-");
                txtCounsellarReceiver.setText("-");
                txtCousellarStatus.setText("-");
            }

            if(CRWorkReq.getHpWorkRequest()!=null){
                PsychiatristWorkRequest P = CRWorkReq.getHpWorkRequest();
                txtPsyhDate.setText(P.getRequestDate().toString());
                if(P.getReceiver()==null){
                    txtPsychReceiver.setText("Not Assigned");
                }else{
                    txtPsychReceiver.setText(P.getReceiver().toString());
                }
                txtPsychStatus.setText(P.getStatus());
            }else{
                txtPsychStatus.setText("-");
                txtPsyhDate.setText("-");
                txtPsychReceiver.setText("-");
            }

            if(CRWorkReq.getLawyerWorkRequest()!=null){
                LawyerWorkRequest L = CRWorkReq.getLawyerWorkRequest();
                txtLawyerDate.setText(L.getRequestDate().toString());
                if(L.getReceiver()==null){
                    txtLawyerReceiver.setText("Not Assigned");
                }else{
                    txtLawyerReceiver.setText(L.getReceiver().toString());
                }
                txtLawyerStatus.setText(L.getStatus());
            }else{
                txtLawyerDate.setText("-");
                txtLawyerReceiver.setText("-");
                txtLawyerStatus.setText("-");
            }
            
            if(CRWorkReq.getCaretakerWorkRequest()!=null){
                CaretakerWorkRequest L = CRWorkReq.getCaretakerWorkRequest();
                txtCaretakerDate.setText(L.getRequestDate().toString());
                if(L.getReceiver()==null){
                    txtCaretakerReceiver.setText("Not Assigned");
                }else{
                    txtCaretakerReceiver.setText(L.getReceiver().toString());
                }
                txtCaretakerStatus.setText(L.getStatus());
            }else{
                txtCaretakerDate.setText("-");
                txtCaretakerReceiver.setText("-");
                txtCaretakerStatus.setText("-");
            }

       
        }
    }//GEN-LAST:event_btnCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnViewCaseReport;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaretaker;
    private javax.swing.JLabel lblCaseReq;
    private javax.swing.JLabel lblCounsellar;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblLawyer;
    private javax.swing.JLabel lblPsychiatrist;
    private javax.swing.JLabel lblReceiver;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblCaseRequest;
    private javax.swing.JLabel txtCaretakerDate;
    private javax.swing.JLabel txtCaretakerReceiver;
    private javax.swing.JLabel txtCaretakerStatus;
    private javax.swing.JLabel txtCounsellarDate;
    private javax.swing.JLabel txtCounsellarReceiver;
    private javax.swing.JLabel txtCousellarStatus;
    private javax.swing.JLabel txtDocReceiver;
    private javax.swing.JLabel txtDocStatus;
    private javax.swing.JLabel txtDoctorDate;
    private javax.swing.JLabel txtLawyerDate;
    private javax.swing.JLabel txtLawyerReceiver;
    private javax.swing.JLabel txtLawyerStatus;
    private javax.swing.JLabel txtPsychReceiver;
    private javax.swing.JLabel txtPsychStatus;
    private javax.swing.JLabel txtPsyhDate;
    // End of variables declaration//GEN-END:variables

        private void popTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblCaseRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(CaseReporterWorkRequest request : organization.getWorkQueue().getCaseReporterWorkRequestList())
         {
         
            row[0] = request.getChildName();
            row[1] = request.getLocation();
            row[2] = request;
            if (request.getReceiver()==null){
                row[3] = "Not Assigned";
            }else{
                row[3] = request.getReceiver();
            }
         
            
            model.addRow(row);
        }
    }
}
