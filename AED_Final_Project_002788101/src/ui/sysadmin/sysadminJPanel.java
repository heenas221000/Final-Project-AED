/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sysadmin;

import business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author heenashah
 */
public class sysadminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form sysadminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public sysadminJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setDividerLocation(120);
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

        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblWelcomeSysAdmin = new javax.swing.JLabel();
        btnManageEnterprises = new javax.swing.JButton();
        btnManageEnterpriseAdministrator = new javax.swing.JButton();
        btnManageNetworks = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        jCheckBox1.setText("jCheckBox1");

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(204, 255, 51));
        jPanel1.setToolTipText("");
        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblWelcomeSysAdmin.setBackground(java.awt.Color.white);
        lblWelcomeSysAdmin.setFont(new java.awt.Font("Songti SC", 1, 24)); // NOI18N
        lblWelcomeSysAdmin.setForeground(new java.awt.Color(102, 102, 255));
        lblWelcomeSysAdmin.setText("Welcome System Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(lblWelcomeSysAdmin, gridBagConstraints);

        btnManageEnterprises.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnManageEnterprises.setForeground(new java.awt.Color(102, 102, 255));
        btnManageEnterprises.setText("Manage Enterprises");
        btnManageEnterprises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterprises.setBorderPainted(false);
        btnManageEnterprises.setContentAreaFilled(false);
        btnManageEnterprises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEnterprisesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEnterprisesMouseEntered(evt);
            }
        });
        btnManageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterprisesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 52, 26, 0);
        jPanel1.add(btnManageEnterprises, gridBagConstraints);

        btnManageEnterpriseAdministrator.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnManageEnterpriseAdministrator.setForeground(new java.awt.Color(102, 102, 255));
        btnManageEnterpriseAdministrator.setText("Manage Enterprise Administrators ");
        btnManageEnterpriseAdministrator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEnterpriseAdministrator.setBorderPainted(false);
        btnManageEnterpriseAdministrator.setContentAreaFilled(false);
        btnManageEnterpriseAdministrator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEnterpriseAdministratorMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageEnterpriseAdministratorMouseEntered(evt);
            }
        });
        btnManageEnterpriseAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdministratorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 35, 26, 38);
        jPanel1.add(btnManageEnterpriseAdministrator, gridBagConstraints);

        btnManageNetworks.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        btnManageNetworks.setForeground(new java.awt.Color(102, 102, 255));
        btnManageNetworks.setText("Manage Networks");
        btnManageNetworks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageNetworks.setBorderPainted(false);
        btnManageNetworks.setContentAreaFilled(false);
        btnManageNetworks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageNetworksMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnManageNetworksMouseEntered(evt);
            }
        });
        btnManageNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworksActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 52, 26, 0);
        jPanel1.add(btnManageNetworks, gridBagConstraints);

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterprisesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterprisesMouseEntered
              btnManageEnterprises.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterprisesMouseEntered

    private void btnManageEnterpriseAdministratorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorMouseEntered
             btnManageEnterpriseAdministrator.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterpriseAdministratorMouseEntered

    private void btnManageNetworksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworksMouseEntered
                  btnManageNetworks.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetworksMouseEntered

    private void btnManageNetworksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageNetworksMouseExited
                 btnManageNetworks.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageNetworksMouseExited

    private void btnManageEnterprisesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterprisesMouseExited
              btnManageEnterprises.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterprisesMouseExited

    private void btnManageEnterpriseAdministratorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorMouseExited
               btnManageEnterpriseAdministrator.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEnterpriseAdministratorMouseExited

    private void btnManageNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworksActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageNetworkJPanel);
        /*userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageNetworksActionPerformed

    private void btnManageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterprisesActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageEnterpriseJPanel);
        /*userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageEnterprisesActionPerformed

    private void btnManageEnterpriseAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdministratorActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        jSplitPane1.setBottomComponent(manageEnterpriseAdminJPanel);
        /*userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnManageEnterpriseAdministratorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterpriseAdministrator;
    private javax.swing.JButton btnManageEnterprises;
    private javax.swing.JButton btnManageNetworks;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcomeSysAdmin;
    // End of variables declaration//GEN-END:variables
}
