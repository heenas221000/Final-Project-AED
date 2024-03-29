/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sysadmin;

import java.awt.Color;

/**
 *
 * @author heenashah
 */
import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Role.HealthAdminRole;
import business.Role.LegalAdminRole;
import business.Role.RehabAdminRole;
import business.Role.NGOAdminRole;
import business.Role.PharmacyAdminRole;
import business.Role.PsychiatristRole;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }
    
    
    
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb_EnterpriseAdmins.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccntList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getNameOfNetwork();
                    row[2] = userAccount;
                    row[3] =userAccount.getPwd();
                    System.out.println(userAccount.getUsername());
                       System.out.println(userAccount.getPwd());
                    model.addRow(row);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void populateNetworkComboBox(){
        cb_SelectNetwork.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            cb_SelectNetwork.addItem(network);
        }
    }
    
    @SuppressWarnings("unchecked")
    private void populateEnterpriseComboBox(Network network){
        cb_SelectEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cb_SelectEnterprise.addItem(enterprise);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageEnterpriseAdmins = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_EnterpriseAdmins = new javax.swing.JTable();
        lblSelectEnterprise = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Admin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bt_Submit = new javax.swing.JButton();
        txt_Password = new javax.swing.JPasswordField();
        cb_SelectNetwork = new javax.swing.JComboBox();
        cb_SelectEnterprise = new javax.swing.JComboBox();
        bt_Delete = new javax.swing.JButton();
        lblNetwork = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageEnterpriseAdmins.setBackground(new java.awt.Color(255, 255, 255));
        lblManageEnterpriseAdmins.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblManageEnterpriseAdmins.setForeground(new java.awt.Color(0, 0, 204));
        lblManageEnterpriseAdmins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageEnterpriseAdmins.setText("MANAGE ENTERPRISE ADMINSTRATORS");
        add(lblManageEnterpriseAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 687, 40));

        tb_EnterpriseAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ENTERPRISE", "NETWORK", "USERNAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_EnterpriseAdmins);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 490, 170));

        lblSelectEnterprise.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblSelectEnterprise.setForeground(new java.awt.Color(0, 51, 204));
        lblSelectEnterprise.setText("ENTERPRISE");
        add(lblSelectEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("NAME");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 71, -1));
        add(txt_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 130, -1));

        jLabel5.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("USERNAME");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, 26));
        add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 130, -1));

        jLabel6.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("PASSWORD");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, -1));

        bt_Submit.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Submit.setForeground(new java.awt.Color(0, 0, 204));
        bt_Submit.setText("SUBMIT");
        bt_Submit.setBorderPainted(false);
        bt_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SubmitActionPerformed(evt);
            }
        });
        add(bt_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, 30));
        add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, -1));

        cb_SelectNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_SelectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SelectNetworkActionPerformed(evt);
            }
        });
        add(cb_SelectNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 130, -1));

        cb_SelectEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_SelectEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, -1));

        bt_Delete.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Delete.setForeground(new java.awt.Color(0, 0, 204));
        bt_Delete.setText("DELETE");
        bt_Delete.setBorderPainted(false);
        bt_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DeleteActionPerformed(evt);
            }
        });
        add(bt_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 30));

        lblNetwork.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(0, 51, 204));
        lblNetwork.setText("NETWORK");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SubmitActionPerformed
        // TODO add your handling code here:
        
        if( txt_Username.getText().isEmpty()||String.valueOf(txt_Password.getPassword()).isEmpty()|| txt_Admin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        
        Enterprise enterprise = (Enterprise) cb_SelectEnterprise.getSelectedItem();
        
        String username = txt_Username.getText();
        String password = String.valueOf(txt_Password.getPassword());
        
        String name = txt_Admin.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Wellness")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new HealthAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txt_Password.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new HealthAdminRole());
        } else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Justice")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new LegalAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txt_Password.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new RehabAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("NGO")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new NGOAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txt_Password.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new NGOAdminRole());
        }else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmaceutical")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txt_Password.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
        }
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Rehabilitation")){
            if(enterprise.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new RehabAdminRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        txt_Password.setText("");
                        return;
                    }
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new PharmacyAdminRole());
        }
        //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new AdminRole());
        populateTable();
        txt_Username.setText("");
        txt_Password.setText("");
        txt_Admin.setText("");
    }//GEN-LAST:event_bt_SubmitActionPerformed

    private void cb_SelectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SelectNetworkActionPerformed

        Network network = (Network) cb_SelectNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_cb_SelectNetworkActionPerformed

    private void bt_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb_EnterpriseAdmins.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
            UserAccount p = (UserAccount) tb_EnterpriseAdmins.getValueAt(selectedRow, 2);
            
            for (Network network : system.getNetworkList()) 
            {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
                {
                    for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccntList())
                    {
                        if (p == userAccount) {
                            enterprise.getUserAccountDirectory().getUserAccntList().remove(p);
                            break;
                        }

                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Account successfully deleted!");
            populateTable();
            
        }

    }//GEN-LAST:event_bt_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Delete;
    private javax.swing.JButton bt_Submit;
    private javax.swing.JComboBox cb_SelectEnterprise;
    private javax.swing.JComboBox cb_SelectNetwork;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageEnterpriseAdmins;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblSelectEnterprise;
    private javax.swing.JTable tb_EnterpriseAdmins;
    private javax.swing.JTextField txt_Admin;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
