/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CaseVolunteer;
import javax.swing.JPanel; 
import business.EcoSystem;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.CounsellorWorkRequest;
import business.WorkQueue.DrWorkRequest;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaretakerWorkRequest;
import business.WorkQueue.PsychiatristWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hetal
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
        bt_AssignRequest = new javax.swing.JButton();
        bt_ViewCaseReport = new javax.swing.JButton();
        bt_CheckStatus = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCaseReq.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblCaseReq.setForeground(new java.awt.Color(0, 0, 204));
        lblCaseReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaseReq.setText("CASE REQUESTS");
        lblCaseReq.setToolTipText("");
        lblCaseReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblCaseReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 879, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 490, 130));

        bt_AssignRequest.setBackground(new java.awt.Color(0, 0, 204));
        bt_AssignRequest.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_AssignRequest.setForeground(new java.awt.Color(255, 255, 255));
        bt_AssignRequest.setText("ASSIGN REQUEST");
        bt_AssignRequest.setBorderPainted(false);
        bt_AssignRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        jPanel1.add(bt_AssignRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 89, 170, 40));

        bt_ViewCaseReport.setBackground(new java.awt.Color(0, 0, 204));
        bt_ViewCaseReport.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_ViewCaseReport.setForeground(new java.awt.Color(255, 255, 255));
        bt_ViewCaseReport.setText("VIEW CASE REPORT");
        bt_ViewCaseReport.setBorderPainted(false);
        bt_ViewCaseReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_ViewCaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ViewCaseReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ViewCaseReportMouseExited(evt);
            }
        });
        bt_ViewCaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ViewCaseReportActionPerformed(evt);
            }
        });
        jPanel1.add(bt_ViewCaseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, 40));

        bt_CheckStatus.setBackground(new java.awt.Color(0, 0, 204));
        bt_CheckStatus.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_CheckStatus.setForeground(new java.awt.Color(255, 255, 255));
        bt_CheckStatus.setText("CHECK STATUS");
        bt_CheckStatus.setBorderPainted(false);
        bt_CheckStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_CheckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_CheckStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_CheckStatusMouseExited(evt);
            }
        });
        bt_CheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CheckStatusActionPerformed(evt);
            }
        });
        jPanel1.add(bt_CheckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 170, 40));
        jPanel1.add(txtPsyhDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 93, 26));
        jPanel1.add(txtLawyerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 24));
        jPanel1.add(txtLawyerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 94, 27));
        jPanel1.add(txtCousellarStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 126, 32));
        jPanel1.add(txtCounsellarReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 126, 29));
        jPanel1.add(txtCounsellarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 118, 27));

        lblPsychiatrist.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblPsychiatrist.setForeground(new java.awt.Color(0, 0, 204));
        lblPsychiatrist.setText("PSYCHIATRIST");
        jPanel1.add(lblPsychiatrist, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        lblDoctor.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblDoctor.setForeground(new java.awt.Color(0, 0, 204));
        lblDoctor.setText("DOCTOR");
        jPanel1.add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 103, -1));

        lblLawyer.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblLawyer.setForeground(new java.awt.Color(0, 0, 204));
        lblLawyer.setText("LAWYER");
        jPanel1.add(lblLawyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 102, -1));
        jPanel1.add(txtPsychStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 92, 32));
        jPanel1.add(txtLawyerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 100, 30));

        lblCounsellar.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblCounsellar.setForeground(new java.awt.Color(0, 0, 204));
        lblCounsellar.setText("COUNSELLOR");
        jPanel1.add(lblCounsellar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 120, -1));

        lblStatus.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 0, 204));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 32));

        lblReceiver.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblReceiver.setForeground(new java.awt.Color(0, 0, 204));
        lblReceiver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblReceiver.setText("Receiver:");
        jPanel1.add(lblReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 104, 28));

        lblDate.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 204));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDate.setText("Date:");
        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 104, 20));
        jPanel1.add(txtPsychReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 93, 28));
        jPanel1.add(txtDocStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 117, 32));
        jPanel1.add(txtDocReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 117, 29));
        jPanel1.add(txtDoctorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 122, 20));

        lblCaretaker.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblCaretaker.setForeground(new java.awt.Color(0, 0, 204));
        lblCaretaker.setText("CARETAKER");
        jPanel1.add(lblCaretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 110, -1));
        jPanel1.add(txtCaretakerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 94, 27));
        jPanel1.add(txtCaretakerReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 100, 24));
        jPanel1.add(txtCaretakerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AssignRequestMouseEntered
        bt_AssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_AssignRequestMouseEntered

    private void bt_AssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AssignRequestMouseExited
        bt_AssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_AssignRequestMouseExited

    private void bt_AssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AssignRequestActionPerformed

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
    }//GEN-LAST:event_bt_AssignRequestActionPerformed

    private void bt_ViewCaseReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ViewCaseReportMouseEntered
        bt_ViewCaseReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCaseReportMouseEntered

    private void bt_ViewCaseReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ViewCaseReportMouseExited
        bt_ViewCaseReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCaseReportMouseExited

    private void bt_ViewCaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ViewCaseReportActionPerformed
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
    }//GEN-LAST:event_bt_ViewCaseReportActionPerformed

    private void bt_CheckStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CheckStatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CheckStatusMouseExited

    private void bt_CheckStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CheckStatusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CheckStatusMouseEntered

    private void bt_CheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CheckStatusActionPerformed
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
        
        
    }//GEN-LAST:event_bt_CheckStatusActionPerformed
    private void popTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblCaseRequest.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(CaseReporterWorkRequest request : organization.getWorkQueue().getCaseReporterWorkRequestList())
         {
         
            row[0] = request.getUserName();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AssignRequest;
    private javax.swing.JButton bt_CheckStatus;
    private javax.swing.JButton bt_ViewCaseReport;
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
}
