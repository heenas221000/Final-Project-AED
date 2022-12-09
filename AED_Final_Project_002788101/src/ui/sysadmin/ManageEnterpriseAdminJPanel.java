/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sysadmin;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Role.NGOAdminRole;
import business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heenashah
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseAdminJPanel() {
        
        initComponents();
        
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb_EnterpriseAdmin.getModel();

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
        comboBoxSelectNetwork.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            comboBoxSelectNetwork.addItem(network);
        }
    }
    
    @SuppressWarnings("unchecked")
    
    private void populateEnterpriseComboBox(Network network){
        cb_enterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cb_enterprise.addItem(enterprise);
        }
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxSelectNetwork = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cb_network = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cb_enterprise = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_AdminName = new javax.swing.JTextField();
        txt_Username = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_EnterpriseAdmin = new javax.swing.JTable();
        bt_submit = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();

        comboBoxSelectNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxSelectNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSelectNetworkActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        jLabel1.setText("MANAGE ENTERPRISE ADMINISTRATOR");

        cb_network.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_networkActionPerformed(evt);
            }
        });

        jLabel2.setText("NETWORK");

        cb_enterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("ENTERPRISE");

        jLabel4.setText("ADMIN NAME");

        jLabel5.setText("USERNAME");

        jLabel6.setText("PASSWORD");

        tb_EnterpriseAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_EnterpriseAdmin);

        bt_submit.setBackground(new java.awt.Color(51, 102, 255));
        bt_submit.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_submit.setForeground(new java.awt.Color(255, 255, 255));
        bt_submit.setText("SUBMIT");
        bt_submit.setBorderPainted(false);
        bt_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_submitActionPerformed(evt);
            }
        });

        bt_delete.setBackground(new java.awt.Color(51, 102, 255));
        bt_delete.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete.setText("DELETE");
        bt_delete.setBorderPainted(false);
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(bt_submit))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_enterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_network, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(bt_delete)))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_network, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_enterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_AdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_submit)
                    .addComponent(bt_delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSelectNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSelectNetworkActionPerformed

        Network network = (Network) comboBoxSelectNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_comboBoxSelectNetworkActionPerformed

    private void cb_networkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_networkActionPerformed

        Network network = (Network) comboBoxSelectNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_cb_networkActionPerformed

    private void bt_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_submitActionPerformed
        // TODO add your handling code here:

        if( txt_Username.getText().isEmpty()||String.valueOf(txt_Password.getPassword()).isEmpty()|| txt_AdminName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        Enterprise enterprise = (Enterprise) cb_enterprise.getSelectedItem();

        String username = txt_Username.getText();
        String password = String.valueOf(txt_Password.getPassword());

        String name = txt_AdminName.getText();

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
            //UserAccount account = enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new LegalAdminRole());
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
                UserAccount userAccount=enterprise.getUserAccountDirectory().createUserAccnt(username, password, employee, new RehabilitationCaretaker());
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
        txt_AdminName.setText("");
    }//GEN-LAST:event_bt_submitActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb_EnterpriseAdmin.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            UserAccount p = (UserAccount) tb_EnterpriseAdmin.getValueAt(selectedRow, 2);

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
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_submit;
    private javax.swing.JComboBox cb_enterprise;
    private javax.swing.JComboBox cb_network;
    private javax.swing.JComboBox comboBoxSelectNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_EnterpriseAdmin;
    private javax.swing.JTextField txt_AdminName;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}