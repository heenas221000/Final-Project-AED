    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CaseReporter;

import ui.Hospital.*;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.CaseReporterOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import business.WorkQueue.CaseReporterWorkRequest;

/**
 *
 * @author shah0
 */
public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    CaseReporterOrganization organization;
    Network network;
    public ReportJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount userAccount,Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = (CaseReporterOrganization) organization;
        this.network = network;
        
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
        namesurvivorjLabel = new javax.swing.JLabel();
        relationjLabel = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblSuspect = new javax.swing.JLabel();
        lblNameofSuspect = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        friendRadioButton = new javax.swing.JRadioButton();
        parentRadioButton = new javax.swing.JRadioButton();
        txtSuspectName = new javax.swing.JTextField();
        knownRadioButton = new javax.swing.JRadioButton();
        unknownRadioButton = new javax.swing.JRadioButton();
        txtMoreDetails = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        Selfradiobutton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        dateOfIncident = new com.toedter.calendar.JDateChooser();
        ReportjButton = new javax.swing.JButton();
        comboBoxIncident = new javax.swing.JComboBox<>();
        txtAgeofUser = new javax.swing.JTextField();
        lblAgeofChild = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        namesurvivorjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        namesurvivorjLabel.setForeground(new java.awt.Color(0, 51, 204));
        namesurvivorjLabel.setText("Name of Victim : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 200, 0, 0);
        jPanel1.add(namesurvivorjLabel, gridBagConstraints);

        relationjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        relationjLabel.setForeground(new java.awt.Color(0, 51, 204));
        relationjLabel.setText("Relation with Survivor : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 130, 0, 0);
        jPanel1.add(relationjLabel, gridBagConstraints);

        lblType.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblType.setForeground(new java.awt.Color(0, 51, 204));
        lblType.setText("Type of Incident:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 190, 0, 0);
        jPanel1.add(lblType, gridBagConstraints);

        lblLocation.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblLocation.setForeground(new java.awt.Color(0, 51, 204));
        lblLocation.setText("Location of Incident :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 150, 0, 0);
        jPanel1.add(lblLocation, gridBagConstraints);

        lblDate.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 51, 204));
        lblDate.setText("Date of Incident :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 180, 0, 0);
        jPanel1.add(lblDate, gridBagConstraints);

        lblDetails.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblDetails.setForeground(new java.awt.Color(0, 51, 204));
        lblDetails.setText("More Details : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 210, 0, 0);
        jPanel1.add(lblDetails, gridBagConstraints);

        lblSuspect.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblSuspect.setForeground(new java.awt.Color(0, 51, 204));
        lblSuspect.setText("Suspect :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 250, 0, 0);
        jPanel1.add(lblSuspect, gridBagConstraints);

        lblNameofSuspect.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblNameofSuspect.setForeground(new java.awt.Color(0, 51, 204));
        lblNameofSuspect.setText("Name of Suspect : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 190, 0, 0);
        jPanel1.add(lblNameofSuspect, gridBagConstraints);

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 23, 0, 0);
        jPanel1.add(txtUserName, gridBagConstraints);

        friendRadioButton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        friendRadioButton.setForeground(new java.awt.Color(0, 51, 204));
        friendRadioButton.setText("Friend");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 13, 0, 0);
        jPanel1.add(friendRadioButton, gridBagConstraints);

        parentRadioButton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        parentRadioButton.setForeground(new java.awt.Color(0, 51, 204));
        parentRadioButton.setText("Parent");
        parentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 32;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 18, 0, 0);
        jPanel1.add(parentRadioButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 31;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 161;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 0);
        jPanel1.add(txtSuspectName, gridBagConstraints);

        knownRadioButton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        knownRadioButton.setForeground(new java.awt.Color(0, 51, 204));
        knownRadioButton.setText("Known");
        knownRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knownRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 23, 0, 0);
        jPanel1.add(knownRadioButton, gridBagConstraints);

        unknownRadioButton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        unknownRadioButton.setForeground(new java.awt.Color(0, 51, 204));
        unknownRadioButton.setText("Unknown");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 49;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 38, 0, 0);
        jPanel1.add(unknownRadioButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 23, 0, 0);
        jPanel1.add(txtMoreDetails, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 23, 0, 0);
        jPanel1.add(txtLocation, gridBagConstraints);

        Selfradiobutton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        Selfradiobutton.setForeground(new java.awt.Color(0, 51, 204));
        Selfradiobutton.setText("Self");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 69;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 50;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 3, 0, 0);
        jPanel1.add(Selfradiobutton, gridBagConstraints);

        otherRadioButton.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        otherRadioButton.setForeground(new java.awt.Color(0, 51, 204));
        otherRadioButton.setText("Other");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 119;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 115;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 0, 122);
        jPanel1.add(otherRadioButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 114;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 23, 0, 0);
        jPanel1.add(dateOfIncident, gridBagConstraints);

        ReportjButton.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        ReportjButton.setForeground(new java.awt.Color(0, 0, 204));
        ReportjButton.setText("Report");
        ReportjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 310, 254, 0);
        jPanel1.add(ReportjButton, gridBagConstraints);

        comboBoxIncident.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Labor", "Physical Abuse", "Sexual Abuse", "Harrassment" }));
        comboBoxIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIncidentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 0);
        jPanel1.add(comboBoxIncident, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 155;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 23, 0, 0);
        jPanel1.add(txtAgeofUser, gridBagConstraints);

        lblAgeofChild.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblAgeofChild.setForeground(new java.awt.Color(0, 51, 204));
        lblAgeofChild.setText("Age :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 280, 0, 0);
        jPanel1.add(lblAgeofChild, gridBagConstraints);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 844, 633));
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void parentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentRadioButtonActionPerformed

    private void knownRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knownRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_knownRadioButtonActionPerformed

    private void ReportjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportjButtonActionPerformed

        CaseReporterWorkRequest request = new CaseReporterWorkRequest();
        request.setStatus("Waiting");
        request.setSender(userAccount);

        request.setUserName(txtUserName.getText());
        request.setEmail(txtAgeofUser.getText());
        //for choosing relations
        if(friendRadioButton.isSelected())
        {
            request.setRelation("Friend");
        }
        else if(parentRadioButton.isSelected())
        {
            request.setRelation("Parent");
        }
        else if(Selfradiobutton.isSelected())
        {
            request.setRelation("Self");

        }
        else if(otherRadioButton.isSelected())
        {
            request.setRelation("Other");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a relation");

        }
        //for choosing type
        if(comboBoxIncident.getSelectedItem().toString().equalsIgnoreCase("Select one"))
        {
            JOptionPane.showMessageDialog(null, "Please select a type");
        }
        else{
            request.setAssaultType(comboBoxIncident.getSelectedItem().toString());
        }
        //location
        request.setLocation(txtLocation.getText());
        //date
        if(dateOfIncident.getDate()==null)
        {
            JOptionPane.showMessageDialog(null, "Please select a date");
        }else{
            request.setDoi(dateOfIncident.getDate());
        }
        //more detaisl
        if(txtMoreDetails.getText()==null)
        {
            JOptionPane.showMessageDialog(null, "Please fill more details");
            return;
        }
        request.setMoredetails(txtMoreDetails.getText());
        //suspect
        if(knownRadioButton.isSelected())
        {
            request.setSuspecttype("Known");
        }
        else if(unknownRadioButton.isSelected())
        {
            request.setSuspecttype("Unknown");
        }else{JOptionPane.showMessageDialog(null, "Please select a suspect type");}

        //name of suspect
        request.setNameofsuspect(txtSuspectName.getText());

        if(request.getDoi()!=null && request.getLocation()!=null && request.getRelation()!=null && request.getSuspecttype()!=null
            && request.getUserName()!=null && request.getAssaultType()!=null)
        {
            Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            Organization org = null;
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof CaseVolunteerOrganization){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkQueue().getCaseReporterWorkRequestList().add(request);
                //userAccount.getWorkQueue().CaseReporterWorkRequestList().add(request);
            }

            
            txtUserName.setText("");
            txtSuspectName.setText("");
            txtMoreDetails.setText("");
            txtLocation.setText("");
            txtAgeofUser.setText("");
            friendRadioButton.setSelected(false);
            parentRadioButton.setSelected(false);
            Selfradiobutton.setSelected(false);
            otherRadioButton.setSelected(false);
            knownRadioButton.setSelected(false);
            unknownRadioButton.setSelected(false);
            comboBoxIncident.setSelectedIndex(0);
           // dateOfIncident.setDate(null);
            userAccount.getWrkQue().getCaseReporterWorkRequestList().add(request);
            
            
            JOptionPane.showMessageDialog(null, "Incident is reported successfully.");

        }
    }//GEN-LAST:event_ReportjButtonActionPerformed

    private void comboBoxIncidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIncidentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxIncidentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReportjButton;
    private javax.swing.JRadioButton Selfradiobutton;
    private javax.swing.JComboBox<String> comboBoxIncident;
    private com.toedter.calendar.JDateChooser dateOfIncident;
    private javax.swing.JRadioButton friendRadioButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton knownRadioButton;
    private javax.swing.JLabel lblAgeofChild;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblNameofSuspect;
    private javax.swing.JLabel lblSuspect;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel namesurvivorjLabel;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JRadioButton parentRadioButton;
    private javax.swing.JLabel relationjLabel;
    private javax.swing.JTextField txtAgeofUser;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMoreDetails;
    private javax.swing.JTextField txtSuspectName;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JRadioButton unknownRadioButton;
    // End of variables declaration//GEN-END:variables
}
