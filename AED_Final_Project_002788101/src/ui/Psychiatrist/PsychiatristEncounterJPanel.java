/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Psychiatrist;
import business.EcoSystem;
import business.Encounter.EncounterPsychiatrist;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.PsychiatristWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;
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
public class PsychiatristEncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PsychiatristEncounterJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    PsychiatristWorkRequest request;
    UserAccount userAccount;
    Network network;
    Organization organization;
    public PsychiatristEncounterJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Network network, Organization organization,PsychiatristWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
      
        this.userAccount = userAccount;
        this.network = network;
        this.organization=organization;
        this.request=request;
        populate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblAdvice = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtEncounterNo = new javax.swing.JTextField();
        lblEncounterNo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAdvice = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPsychiatristEncounter = new javax.swing.JTable();
        lblProgress = new javax.swing.JLabel();
        txtProgress = new javax.swing.JTextField();
        lblMoreDetails = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMoreDetails = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));

        btnUpdate.setBackground(new java.awt.Color(204, 255, 51));
        btnUpdate.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 102, 255));
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 51));
        btnBack.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 102, 255));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblAdvice.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblAdvice.setForeground(new java.awt.Color(102, 102, 255));
        lblAdvice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAdvice.setText("                 Advice:");

        lblName.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        lblEncounterNo.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblEncounterNo.setForeground(new java.awt.Color(102, 102, 255));
        lblEncounterNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEncounterNo.setText("     Encounter no:");

        txtAreaAdvice.setColumns(20);
        txtAreaAdvice.setRows(5);
        jScrollPane2.setViewportView(txtAreaAdvice);

        tblPsychiatristEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Encounter no.", "Advice", "Progress"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPsychiatristEncounter);

        lblProgress.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(102, 102, 255));
        lblProgress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProgress.setText("            Progress:");

        lblMoreDetails.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblMoreDetails.setForeground(new java.awt.Color(102, 102, 255));
        lblMoreDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoreDetails.setText("     More Details:");

        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAreaMoreDetails.setColumns(20);
        txtAreaMoreDetails.setRows(5);
        txtAreaMoreDetails.setEnabled(false);
        jScrollPane3.setViewportView(txtAreaMoreDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMoreDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMoreDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEncounterNo)
                            .addComponent(txtEncounterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblAdvice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProgress))
                                .addGap(32, 32, 32)))))
                .addComponent(btnUpdate)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setForeground(new Color(0,128,128));  // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setForeground(Color.black);       // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtEncounterNo.getText().equalsIgnoreCase("") && txtAreaAdvice.getText().equalsIgnoreCase("")
            && txtProgress.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill out the necessary fields");
        }
        else{
            EncounterPsychiatrist hpe=new EncounterPsychiatrist();
            hpe.setEncounter(txtEncounterNo.getText());
            hpe.setGuidance(txtAreaAdvice.getText());
            hpe.setProgress(txtProgress.getText());
            request.getHPEncounter().add(hpe);
            //organization.getHPencounterdir().getHPEncounters().add(hpe);
            //organization.getHPencounterdir().getHPEncounterDirectory().put(request.CaseReporterWorkRequest().getNameofvictim(), organization.getHPencounterdir().getHPEncounters());
            populate();
            txtEncounterNo.setText("");
            txtProgress.setText("");
            txtAreaAdvice.setText("");

       
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PsychiatristRequestJPanel hreqJPanel = new PsychiatristRequestJPanel(userProcessContainer,system,userAccount,organization,network);
        userProcessContainer.add("caseReportJPanel", hreqJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

private void populate() {
    
<<<<<<< Updated upstream
        txtName.setText(request.getCaseReporterWorkRequest().getChildName());
        txtAreaMoreDetails.setText(request.getCaseReporterWorkRequest().getMoredetails());
=======
        txt_Name.setText(request.getCaseReporterWorkRequest().getUserName());
        txt_MoreDetails.setText(request.getCaseReporterWorkRequest().getMoredetails());
>>>>>>> Stashed changes
        
        DefaultTableModel model= (DefaultTableModel) tblPsychiatristEncounter.getModel();
        Object[] row=new Object[3];
        model.setRowCount(0);
        for (EncounterPsychiatrist HPE: request.getHPEncounter()){
            row[0] = HPE.getEncounter();
            row[1]=HPE.getGuidance();
            row[2]=HPE.getProgress();
            model.addRow(row);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAdvice;
    private javax.swing.JLabel lblEncounterNo;
    private javax.swing.JLabel lblMoreDetails;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JTable tblPsychiatristEncounter;
    private javax.swing.JTextArea txtAreaAdvice;
    private javax.swing.JTextArea txtAreaMoreDetails;
    private javax.swing.JTextField txtEncounterNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProgress;
    // End of variables declaration//GEN-END:variables
}
