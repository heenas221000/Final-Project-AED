/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CaseVolunteer;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CounsellingOrganization;
import business.Organization.PsychiatricOrganization;
import business.Organization.HospitalOrganization;
import business.Organization.LegalOrganization;
import business.Organization.Organization;
import business.Organization.RehabOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CounsellorWorkRequest;
import business.WorkQueue.DrWorkRequest;
import business.WorkQueue.PsychiatristWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaretakerWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author hetal
 */
public class CaseReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseReportJPanel
     */
        JPanel userProcessContainer;
    EcoSystem system;
    CaseReporterWorkRequest request;
    UserAccount userAccount;
    Network network;
    public CaseReportJPanel(JPanel userProcessContainer, EcoSystem system, CaseReporterWorkRequest request,UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        PopulateInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReqRehab = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblDate = new javax.swing.JPanel();
        lblVictimName = new javax.swing.JLabel();
        lblRelation = new javax.swing.JLabel();
        lblTypeofAssault = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        lblMoreDetail = new javax.swing.JLabel();
        lblSuspect = new javax.swing.JLabel();
        lblNameSuspect = new javax.swing.JLabel();
        txtVictimName = new javax.swing.JTextField();
        txtNameofSuspect = new javax.swing.JTextField();
        txtMoreDetails = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtVolunteerName = new javax.swing.JTextField();
        txtTypeofAssault = new javax.swing.JTextField();
        txtDateofIncident = new javax.swing.JTextField();
        txtSuspect = new javax.swing.JTextField();
        bt_Back = new javax.swing.JButton();
        lblVictimInfo = new javax.swing.JLabel();
        bt_ReqLawyer = new javax.swing.JButton();
        bt_ReqCounsellar = new javax.swing.JButton();
        bt_ReqDoc = new javax.swing.JButton();
        bt_ReqPsych = new javax.swing.JButton();
        bt_ReqCaretaker = new javax.swing.JButton();

        btnReqRehab.setBackground(new java.awt.Color(129, 178, 154));
        btnReqRehab.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        btnReqRehab.setForeground(new java.awt.Color(61, 64, 91));
        btnReqRehab.setText("Request Rehabilitation");
        btnReqRehab.setBorderPainted(false);
        btnReqRehab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReqRehabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReqRehabMouseExited(evt);
            }
        });
        btnReqRehab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqRehabActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDate.setBackground(new java.awt.Color(153, 204, 255));

        lblVictimName.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblVictimName.setForeground(new java.awt.Color(0, 0, 204));
        lblVictimName.setText("VICTIM NAME");

        lblRelation.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblRelation.setForeground(new java.awt.Color(0, 0, 204));
        lblRelation.setText("RELATION / VOLUNTEER NAME");

        lblTypeofAssault.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblTypeofAssault.setForeground(new java.awt.Color(0, 0, 204));
        lblTypeofAssault.setText("TYPE OF ASSAULT");

        lblLocation.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(0, 0, 204));
        lblLocation.setText("LOCATION OF INCIDENT");

        timejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        timejLabel.setForeground(new java.awt.Color(0, 0, 204));
        timejLabel.setText("DATE OF INCIDENT");

        lblMoreDetail.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblMoreDetail.setForeground(new java.awt.Color(0, 0, 204));
        lblMoreDetail.setText("MORE DETAILS");

        lblSuspect.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblSuspect.setForeground(new java.awt.Color(0, 0, 204));
        lblSuspect.setText("SUSPECT");

        lblNameSuspect.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblNameSuspect.setForeground(new java.awt.Color(0, 0, 204));
        lblNameSuspect.setText("NAME OF SUSPECT");

        txtVictimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVictimNameActionPerformed(evt);
            }
        });

        txtNameofSuspect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameofSuspectActionPerformed(evt);
            }
        });

        txtVolunteerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolunteerNameActionPerformed(evt);
            }
        });

        txtTypeofAssault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeofAssaultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblDateLayout = new javax.swing.GroupLayout(lblDate);
        lblDate.setLayout(lblDateLayout);
        lblDateLayout.setHorizontalGroup(
            lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblDateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTypeofAssault, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMoreDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSuspect, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameSuspect, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNameofSuspect)
                    .addComponent(txtTypeofAssault, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDateofIncident, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSuspect, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtVolunteerName)
                    .addComponent(txtVictimName)
                    .addComponent(txtMoreDetails, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(84, 84, 84))
        );
        lblDateLayout.setVerticalGroup(
            lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblDateLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVictimName)
                    .addComponent(txtVictimName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRelation)
                    .addComponent(txtVolunteerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeofAssault)
                    .addComponent(txtTypeofAssault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateofIncident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoreDetail)
                    .addComponent(txtMoreDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuspect)
                    .addComponent(txtSuspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameSuspect)
                    .addComponent(txtNameofSuspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 62, -1, -1));

        bt_Back.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_Back.setForeground(new java.awt.Color(0, 0, 204));
        bt_Back.setText("BACK");
        bt_Back.setBorderPainted(false);
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
        jPanel1.add(bt_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 82, 30));

        lblVictimInfo.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblVictimInfo.setForeground(new java.awt.Color(0, 0, 204));
        lblVictimInfo.setText("VICTIM INFORMATION ");
        jPanel1.add(lblVictimInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 342, 42));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 770, 500));

        bt_ReqLawyer.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_ReqLawyer.setForeground(new java.awt.Color(0, 0, 204));
        bt_ReqLawyer.setText("REQUEST LAWYER");
        bt_ReqLawyer.setBorderPainted(false);
        bt_ReqLawyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ReqLawyerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ReqLawyerMouseExited(evt);
            }
        });
        bt_ReqLawyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReqLawyerActionPerformed(evt);
            }
        });
        add(bt_ReqLawyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 200, 40));

        bt_ReqCounsellar.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_ReqCounsellar.setForeground(new java.awt.Color(0, 0, 204));
        bt_ReqCounsellar.setText("REQUEST COUNSELLOR");
        bt_ReqCounsellar.setBorderPainted(false);
        bt_ReqCounsellar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ReqCounsellarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ReqCounsellarMouseExited(evt);
            }
        });
        bt_ReqCounsellar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReqCounsellarActionPerformed(evt);
            }
        });
        add(bt_ReqCounsellar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 200, 40));

        bt_ReqDoc.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_ReqDoc.setForeground(new java.awt.Color(0, 0, 204));
        bt_ReqDoc.setText("REQUEST DOCTOR");
        bt_ReqDoc.setBorderPainted(false);
        bt_ReqDoc.setPreferredSize(new java.awt.Dimension(190, 25));
        bt_ReqDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ReqDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ReqDocMouseExited(evt);
            }
        });
        bt_ReqDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReqDocActionPerformed(evt);
            }
        });
        add(bt_ReqDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 200, 40));

        bt_ReqPsych.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_ReqPsych.setForeground(new java.awt.Color(0, 0, 204));
        bt_ReqPsych.setText("REQUEST PSYCHIATRIST");
        bt_ReqPsych.setBorderPainted(false);
        bt_ReqPsych.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ReqPsychMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ReqPsychMouseExited(evt);
            }
        });
        bt_ReqPsych.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReqPsychActionPerformed(evt);
            }
        });
        add(bt_ReqPsych, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 200, 38));

        bt_ReqCaretaker.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_ReqCaretaker.setForeground(new java.awt.Color(0, 0, 204));
        bt_ReqCaretaker.setText("REQUEST CARETAKER");
        bt_ReqCaretaker.setBorderPainted(false);
        bt_ReqCaretaker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ReqCaretakerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_ReqCaretakerMouseExited(evt);
            }
        });
        bt_ReqCaretaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReqCaretakerActionPerformed(evt);
            }
        });
        add(bt_ReqCaretaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 478, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVictimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVictimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVictimNameActionPerformed

    private void txtNameofSuspectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameofSuspectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameofSuspectActionPerformed

    private void txtVolunteerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolunteerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolunteerNameActionPerformed

    private void txtTypeofAssaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeofAssaultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeofAssaultActionPerformed

    private void bt_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BackMouseEntered
        bt_Back.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_BackMouseEntered

    private void bt_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BackMouseExited
        bt_Back.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_BackMouseExited

    private void bt_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //CaseVolunteerPJPanel sysAdminwjp = (CaseVolunteerPJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);         // TODO add your handling code here:
    }//GEN-LAST:event_bt_BackActionPerformed

    private void bt_ReqLawyerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqLawyerMouseEntered
        bt_ReqLawyer.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqLawyerMouseEntered

    private void bt_ReqLawyerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqLawyerMouseExited
        bt_ReqLawyer.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqLawyerMouseExited

    private void bt_ReqLawyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReqLawyerActionPerformed
        LawyerWorkRequest legalawyerequest = new LawyerWorkRequest();
        legalawyerequest.setStatus("Waiting");
        legalawyerequest.setSender(userAccount);
        legalawyerequest.setCaseReporterWorkRequest(request);
        legalawyerequest.getCaseReporterWorkRequest().setLawyerWorkRequest(legalawyerequest);
        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.Justice);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LegalOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getLawyerworkRequestList().add(legalawyerequest);
            //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            userAccount.getWrkQue().getLawyerworkRequestList().add(legalawyerequest);
        }

        JOptionPane.showMessageDialog(null, "Request submitted to Lawyer.");
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqLawyerActionPerformed

    private void bt_ReqCounsellarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqCounsellarMouseEntered
        bt_ReqCounsellar.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqCounsellarMouseEntered

    private void bt_ReqCounsellarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqCounsellarMouseExited
        bt_ReqCounsellar.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqCounsellarMouseExited

    private void bt_ReqCounsellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReqCounsellarActionPerformed
        CounsellorWorkRequest counsellarreq = new CounsellorWorkRequest();
        counsellarreq.setStatus("Waiting");
        counsellarreq.setSender(userAccount);
        counsellarreq.setHswr(request);
        counsellarreq.getHswr().setCounsellorWorkRequest(counsellarreq);

        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof CounsellingOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getCounsellarworkRequestList().add(counsellarreq);
            //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            userAccount.getWrkQue().getCounsellarworkRequestList().add(counsellarreq);
        }

        JOptionPane.showMessageDialog(null, "Request submitted to Counsellar");
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_ReqCounsellarActionPerformed

    private void bt_ReqDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqDocMouseEntered
        bt_ReqDoc.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqDocMouseEntered

    private void bt_ReqDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqDocMouseExited
        bt_ReqDoc.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqDocMouseExited

    private void bt_ReqDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReqDocActionPerformed
        DrWorkRequest docrequest = new DrWorkRequest();
        docrequest.setStatus("Waiting");
        docrequest.setSender(userAccount);
        docrequest.setCaseReporterWorkRequest(request);
        docrequest.getCaseReporterWorkRequest().setDoctorWorkRequest(docrequest);

        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.Wellness);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof HospitalOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getDoctorworkRequestList().add(docrequest);
            //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            userAccount.getWrkQue().getDoctorworkRequestList().add(docrequest);
        }

        JOptionPane.showMessageDialog(null, "Request submitted to Hosptital.");
    }//GEN-LAST:event_bt_ReqDocActionPerformed

    private void bt_ReqPsychMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqPsychMouseEntered
        bt_ReqPsych.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqPsychMouseEntered

    private void bt_ReqPsychMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqPsychMouseExited
        bt_ReqPsych.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReqPsychMouseExited

    private void bt_ReqPsychActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReqPsychActionPerformed
        PsychiatristWorkRequest psychrequest = new PsychiatristWorkRequest();
        psychrequest.setStatus("Waiting");
        psychrequest.setSender(userAccount);
        psychrequest.setCaseReporterWorkRequest(request);
        psychrequest.getCaseReporterWorkRequest().setHpWorkRequest(psychrequest);

        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.Wellness);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            System.out.println("ex"+organization.getName());
            if (organization instanceof PsychiatricOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getPsychiatristWorkRequestList().add(psychrequest);
            //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            userAccount.getWrkQue().getPsychiatristWorkRequestList().add(psychrequest);
        }

        JOptionPane.showMessageDialog(null, "Request submitted to Psychiatrist");
    }//GEN-LAST:event_bt_ReqPsychActionPerformed

    private void btnReqRehabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReqRehabMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReqRehabMouseEntered

    private void btnReqRehabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReqRehabMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReqRehabMouseExited

    private void btnReqRehabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqRehabActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnReqRehabActionPerformed

    private void bt_ReqCaretakerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqCaretakerMouseEntered
        // TODO add your handling code here:

        bt_ReqCaretaker.setForeground(new Color(0,128,128));
    }//GEN-LAST:event_bt_ReqCaretakerMouseEntered

    private void bt_ReqCaretakerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ReqCaretakerMouseExited
        // TODO add your handling code here:

        bt_ReqCaretaker.setForeground(Color.black);

    }//GEN-LAST:event_bt_ReqCaretakerMouseExited

    private void bt_ReqCaretakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReqCaretakerActionPerformed
        // TODO add your handling code here:

        CaretakerWorkRequest rehabcaretakerrequest = new CaretakerWorkRequest();
        rehabcaretakerrequest.setStatus("Waiting");
        rehabcaretakerrequest.setSender(userAccount);
        rehabcaretakerrequest.setCaseReporterWorkRequest(request);
        rehabcaretakerrequest.getCaseReporterWorkRequest().setCaretakerWorkRequest(rehabcaretakerrequest);
        Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.Rehabilitation);
        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RehabOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getCaretakerworkRequestList().add(rehabcaretakerrequest);
            //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            userAccount.getWrkQue().getCaretakerworkRequestList().add(rehabcaretakerrequest);
        }

        JOptionPane.showMessageDialog(null, "Request submitted to Caretaker.");
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_ReqCaretakerActionPerformed
private void PopulateInfo() {
        txtVictimName.setText(request.getUserName());
        txtVolunteerName.setText(request.getRelation());
        txtTypeofAssault.setText(request.getAssaultType());
        txtLocation.setText(request.getLocation());
        txtDateofIncident.setText(request.getDoi().toString());
        txtMoreDetails.setText(request.getMoredetails());
        txtSuspect.setText(request.getSuspecttype());
        txtNameofSuspect.setText(request.getNameofsuspect());
        
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Back;
    private javax.swing.JButton bt_ReqCaretaker;
    private javax.swing.JButton bt_ReqCounsellar;
    private javax.swing.JButton bt_ReqDoc;
    private javax.swing.JButton bt_ReqLawyer;
    private javax.swing.JButton bt_ReqPsych;
    private javax.swing.JButton btnReqRehab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lblDate;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMoreDetail;
    private javax.swing.JLabel lblNameSuspect;
    private javax.swing.JLabel lblRelation;
    private javax.swing.JLabel lblSuspect;
    private javax.swing.JLabel lblTypeofAssault;
    private javax.swing.JLabel lblVictimInfo;
    private javax.swing.JLabel lblVictimName;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JTextField txtDateofIncident;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMoreDetails;
    private javax.swing.JTextField txtNameofSuspect;
    private javax.swing.JTextField txtSuspect;
    private javax.swing.JTextField txtTypeofAssault;
    private javax.swing.JTextField txtVictimName;
    private javax.swing.JTextField txtVolunteerName;
    // End of variables declaration//GEN-END:variables
}
