/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Lawyer;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.HospitalOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.LawyerWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hetal
 */
public class CaseReportLJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CaseReportLJPanel
     */
     JPanel userProcessContainer;
    EcoSystem system;
    CaseReporterWorkRequest request;
    UserAccount userAccount;
    Network network;
    public CaseReportLJPanel(JPanel userProcessContainer, EcoSystem system, CaseReporterWorkRequest request,UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        PopulateReport();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblRelationwithSurvivor = new javax.swing.JLabel();
        lblTypeofAssault = new javax.swing.JLabel();
        lbllocation = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSuspectType = new javax.swing.JLabel();
        lblSuspectName = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        txt_SusName = new javax.swing.JTextField();
        txt_location = new javax.swing.JTextField();
        txt_relation = new javax.swing.JTextField();
        txt_AssaultType = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        txt_SuspectType = new javax.swing.JTextField();
        bt_SendInvite = new javax.swing.JButton();
        bt_Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblName.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 204));
        lblName.setText("NAME OF SURVIVOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lblName, gridBagConstraints);

        lblRelationwithSurvivor.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblRelationwithSurvivor.setForeground(new java.awt.Color(0, 0, 204));
        lblRelationwithSurvivor.setText("RELATION WITH SURVIVOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 42, 0, 0);
        jPanel1.add(lblRelationwithSurvivor, gridBagConstraints);

        lblTypeofAssault.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblTypeofAssault.setForeground(new java.awt.Color(0, 0, 204));
        lblTypeofAssault.setText("TYPE OF ASSAULT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lblTypeofAssault, gridBagConstraints);

        lbllocation.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lbllocation.setForeground(new java.awt.Color(0, 0, 204));
        lbllocation.setText("LOCATION OF INCIDENT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(37, 42, 0, 0);
        jPanel1.add(lbllocation, gridBagConstraints);

        lblDate.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 204));
        lblDate.setText("DATE OF INCIDENT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 42, 0, 0);
        jPanel1.add(lblDate, gridBagConstraints);

        lblSuspectType.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblSuspectType.setForeground(new java.awt.Color(0, 0, 204));
        lblSuspectType.setText("SUSPECT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 42, 0, 0);
        jPanel1.add(lblSuspectType, gridBagConstraints);

        lblSuspectName.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        lblSuspectName.setForeground(new java.awt.Color(0, 0, 204));
        lblSuspectName.setText("SUSPECT NAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 42, 0, 0);
        jPanel1.add(lblSuspectName, gridBagConstraints);

        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txt_Name, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 82);
        jPanel1.add(txt_SusName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txt_location, gridBagConstraints);

        txt_relation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_relationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 2, 0, 0);
        jPanel1.add(txt_relation, gridBagConstraints);

        txt_AssaultType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AssaultTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 0, 0);
        jPanel1.add(txt_AssaultType, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanel1.add(txt_date, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 82);
        jPanel1.add(txt_SuspectType, gridBagConstraints);

        bt_SendInvite.setBackground(new java.awt.Color(153, 204, 255));
        bt_SendInvite.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_SendInvite.setForeground(new java.awt.Color(153, 204, 255));
        bt_SendInvite.setText("SEND INVITE");
        bt_SendInvite.setBorder(null);
        bt_SendInvite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_SendInviteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_SendInviteMouseExited(evt);
            }
        });
        bt_SendInvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SendInviteActionPerformed(evt);
            }
        });

        bt_Back.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Back.setForeground(new java.awt.Color(0, 0, 204));
        bt_Back.setText("BACK");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Back))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_SendInvite)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bt_Back)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_SendInvite)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void txt_relationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_relationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_relationActionPerformed

    private void txt_AssaultTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AssaultTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AssaultTypeActionPerformed

    private void bt_SendInviteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SendInviteMouseEntered
        bt_SendInvite.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SendInviteMouseEntered

    private void bt_SendInviteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SendInviteMouseExited
        bt_SendInvite.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SendInviteMouseExited

    private void bt_SendInviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SendInviteActionPerformed

        String FromEmail="sexualawareness.help@gmail.com";
        String FromEmailPass="Fin@lProject21";
        String Subject = "Sign up successful";
        String ema=request.getEmail();
        String nv=request.getUserName();
        Properties properties=new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(FromEmail,FromEmailPass);
            }
        });

        try
        {
            Message msg=new MimeMessage(session);
            msg.setFrom(new InternetAddress(FromEmail));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(ema));
            msg.setSubject("A Lawyer has been assigned.");
            msg.setText("Dear "+nv +"\n"+"I am here to help you. Please schedule an appointment through the following link."+"\n"+"calendly.link"+"\n"+"Best,"+"\n"+userAccount.getEmp().getName());
            Transport.send(msg);
            JOptionPane.showMessageDialog(this, "Invitation has been sent successfully.");

        }catch(Exception e)
        {
            System.out.println(""+e);
            JOptionPane.showMessageDialog(this, "Incorrect E-mail id.Invitation cannot be been sent.");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SendInviteActionPerformed

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
        LawyerJPanel sysAdminwjp = (LawyerJPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Back;
    private javax.swing.JButton bt_SendInvite;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRelationwithSurvivor;
    private javax.swing.JLabel lblSuspectName;
    private javax.swing.JLabel lblSuspectType;
    private javax.swing.JLabel lblTypeofAssault;
    private javax.swing.JLabel lbllocation;
    private javax.swing.JTextField txt_AssaultType;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_SusName;
    private javax.swing.JTextField txt_SuspectType;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_relation;
    // End of variables declaration//GEN-END:variables

private void PopulateReport() {
        txt_Name.setText(request.getUserName());
        txt_relation.setText(request.getRelation());
        txt_AssaultType.setText(request.getAssaultType());
        txt_location.setText(request.getLocation());
        txt_date.setText(request.getDoi().toString());
        txt_SuspectType.setText(request.getSuspecttype());
        txt_SusName.setText(request.getNameofsuspect());
        
        
    }





}
