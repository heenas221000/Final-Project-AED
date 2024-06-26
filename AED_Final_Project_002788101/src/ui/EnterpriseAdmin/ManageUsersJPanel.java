/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EnterpriseAdmin;

import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccount;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hetal
 */
public class ManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
       JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    public ManageUsersJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        
        popOrganizationComboBox();
        //employeeJComboBox.removeAllItems();
        popData();
        this.setSize(1080, 680);
    }
    
    public void popOrganizationComboBox() {
        cb_org.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            cb_org.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        cb_employee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            cb_employee.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        cb_role.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            cb_role.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tb_users.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccntList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tb_users.getModel()).addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_users = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bt_Create = new javax.swing.JButton();
        cb_org = new javax.swing.JComboBox();
        cb_employee = new javax.swing.JComboBox();
        cb_role = new javax.swing.JComboBox();
        txt_Password = new javax.swing.JPasswordField();
        bt_delete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE USER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 650, 39));

        tb_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_users);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 240, 170));

        jLabel2.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ORGANIZATION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("EMPLOYEE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, -1));

        jLabel4.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ROLE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));

        jLabel5.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("USERNAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, -1));
        jPanel2.add(txt_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, -1));

        jLabel6.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("PASSWORD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, -1));

        bt_Create.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Create.setForeground(new java.awt.Color(0, 0, 204));
        bt_Create.setText("CREATE");
        bt_Create.setBorderPainted(false);
        bt_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CreateActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        cb_org.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        cb_org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_orgActionPerformed(evt);
            }
        });
        jPanel2.add(cb_org, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 26));

        cb_employee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jPanel2.add(cb_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 140, 26));

        cb_role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" }));
        jPanel2.add(cb_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, 30));
        jPanel2.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, -1));

        bt_delete.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(0, 0, 204));
        bt_delete.setText("DELETE");
        bt_delete.setBorderPainted(false);
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(bt_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 370));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CreateActionPerformed
        // TODO add your handling code here:

        if( txt_UserName.getText().isEmpty()|| String.valueOf(txt_Password.getPassword()).isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        String userName = txt_UserName.getText();
        String password = String.valueOf(txt_Password.getPassword());
        Organization organization = (Organization) cb_org.getSelectedItem();
        Employee employee = (Employee) cb_employee.getSelectedItem();
        Role role = (Role) cb_role.getSelectedItem();
        if(organization.getUserAccountDirectory().CheckIsValidInput(password)){
            UserAccount userAccount=organization.getUserAccountDirectory().createUserAccnt(userName, password, employee, role);
        }
        else{
            JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
            txt_Password.setText("");
            return;
        }
        //organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        popData();
        txt_UserName.setText("");
        txt_Password.setText("");
    }//GEN-LAST:event_bt_CreateActionPerformed

    private void cb_orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_orgActionPerformed
        Organization organization = (Organization) cb_org.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_cb_orgActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb_users.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            UserAccount u = (UserAccount) tb_users.getValueAt(selectedRow, 0);

            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccntList()) {
                    if (u==ua){
                        organization.getUserAccountDirectory().getUserAccntList().remove(u);
                        break;
                    }

                }
                JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                popData();
            }
        }
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Create;
    private javax.swing.JButton bt_delete;
    private javax.swing.JComboBox cb_employee;
    private javax.swing.JComboBox cb_org;
    private javax.swing.JComboBox cb_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_users;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
