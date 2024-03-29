/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sysadmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.CaseVolunteerOrganization;
import business.Organization.CaseReporterOrganization;
import business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author heenshah
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private HashMap<String, Integer> chart;
    int bostoncases,seattlecases;
   
   //private HashMap<String, Integer> piechartbos;
   private HashMap<String, Integer> piechartsea;


    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        chart= new HashMap<String,Integer>();
        //piechartbos=new HashMap<String,Integer>();
        piechartsea=new HashMap<String,Integer>();

        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) tb_Network.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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

        lblManageNetworks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Network = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        bt_AddNetwork = new javax.swing.JButton();
        bt_Remove = new javax.swing.JButton();
        bt_ViewCases = new javax.swing.JButton();
        bt_Report = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageNetworks.setBackground(new java.awt.Color(255, 255, 255));
        lblManageNetworks.setFont(new java.awt.Font("Songti SC", 1, 28)); // NOI18N
        lblManageNetworks.setForeground(new java.awt.Color(0, 0, 204));
        lblManageNetworks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageNetworks.setText("MANAGE NETWORKS");
        add(lblManageNetworks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 805, 40));

        tb_Network.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Network);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 340, 130));

        jLabel2.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, -1));

        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });
        add(txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 216, -1));

        bt_AddNetwork.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_AddNetwork.setForeground(new java.awt.Color(0, 0, 204));
        bt_AddNetwork.setText("ADD");
        bt_AddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AddNetworkActionPerformed(evt);
            }
        });
        add(bt_AddNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 90, -1));

        bt_Remove.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Remove.setForeground(new java.awt.Color(0, 0, 204));
        bt_Remove.setText("REMOVE");
        bt_Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RemoveActionPerformed(evt);
            }
        });
        add(bt_Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 190, 120, -1));

        bt_ViewCases.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_ViewCases.setForeground(new java.awt.Color(0, 0, 204));
        bt_ViewCases.setText("VIEW CASES");
        bt_ViewCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ViewCasesActionPerformed(evt);
            }
        });
        add(bt_ViewCases, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 230, 120, 30));

        bt_Report.setFont(new java.awt.Font("Songti SC", 1, 14)); // NOI18N
        bt_Report.setForeground(new java.awt.Color(0, 0, 204));
        bt_Report.setText("REPORT");
        bt_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ReportActionPerformed(evt);
            }
        });
        add(bt_Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void bt_AddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AddNetworkActionPerformed
        // TODO add your handling code here:
        
        if( txt_Name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        String name = txt_Name.getText();

        Network network = system.createAndAddNetwork();
        network.setNameOfNetwork(name);

        populateNetworkTable();
        txt_Name.setText("");
    }//GEN-LAST:event_bt_AddNetworkActionPerformed

    private void bt_RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RemoveActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tb_Network.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Network p=(Network) tb_Network.getValueAt(selectedRow, 0);

            for (Network network : system.getNetworkList()) {
                    if(p==network){
                      system.getNetworkList().remove(p);
                        break;
                    }
            }
            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateNetworkTable();
        }
    }//GEN-LAST:event_bt_RemoveActionPerformed

    private void bt_ViewCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ViewCasesActionPerformed
          
        //chart.clear();
        
        updateData();
        //System.out.println("5");
        updateChart();
        //System.out.println("6");
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ViewCasesActionPerformed

    private void bt_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ReportActionPerformed
        
        int selectedRow = tb_Network.getSelectedRow();
         
            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please choose a network");
            return;
            }         
            Network network= (Network) tb_Network.getValueAt(selectedRow, 0);
            Enterprise e= network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            
            for (Organization o: e.getOrganizationDirectory().getOrganizationList())
            {   Organization org=null;
               
                if(o instanceof CaseVolunteerOrganization)
                { 
                    org=o;
                    this.UpdatePieData(org);
                     
                    
                }
               // updateSeattlePieChart(network);
            }
                            updateSeattlePieChart(network);

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ReportActionPerformed

    
  private void updateData(){
    for(Network n : system.getNetworkList()){
          
            Enterprise e = n.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.NGO);
            
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()){
               
                if (o instanceof CaseVolunteerOrganization){
               
                int count = o.getWorkQueue().getCaseReporterWorkRequestList().size();
                System.out.println(count);
                chart.put(n.toString(), count);
                
            }}
        }    
  }
  
  private void updateChart() {
  
    DefaultCategoryDataset d=new DefaultCategoryDataset();
        Set keys=chart.keySet();
        Iterator it=keys.iterator();
        
        while(it.hasNext())
        {
            Object cityname=it.next().toString();
            int casesdata= (int) chart.get(cityname);
            d.setValue(casesdata, "No of cases", (Comparable) cityname);
            
        }
        
        JFreeChart barc=ChartFactory.createBarChart("Summary of cases", "City/Network", "No of cases", d, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot plt=barc.getCategoryPlot();
        //plt.setRangeGridlinePaint(Color.black);
        
        ChartFrame cp=new ChartFrame("No of cases by network",barc);
        //cp.removeAll();
        cp.setVisible(true);
        cp.setSize(600,600);
    }

    private void UpdatePieData(Organization org) {
     
       
//      piechartsea.clear();
//      piechartsea.put("Labor",org.getWorkQueue().getcountbytypesa("Labor"));
//      piechartsea.put("Physical Abuse", org.getWorkQueue().getcountbytypesa("Physical Abuse"));
//      piechartsea.put("Sexual Abuse", org.getWorkQueue().getcountbytypesa("Sexual Abuse"));
//      piechartsea.put("Harrassment", org.getWorkQueue().getcountbytypesa("Harrassment"));
//      piechartsea.put("Other", org.getWorkQueue().getcountbytypesa("Other"));
      piechartsea.clear();
      piechartsea.put("Labor",org.getWorkQueue().getcountbytypesa("Labor"));
      piechartsea.put("Physical Abuse", org.getWorkQueue().getcountbytypesa("Physical Abuse"));
      piechartsea.put("Sexual Abuse", org.getWorkQueue().getcountbytypesa("Sexual Abuse"));
      piechartsea.put("Harrassment", org.getWorkQueue().getcountbytypesa("Harrassment"));
      piechartsea.put("Other", org.getWorkQueue().getcountbytypesa("Other"));
      //this.updateSeattlePieChart();
        
    }

    private void updateSeattlePieChart(Network network) {
    
        DefaultPieDataset ddd=new DefaultPieDataset();
        Set keys=piechartsea.keySet();
        Iterator it=keys.iterator();
        keys.size();
        System.out.print(keys.size());
      
        while(it.hasNext())
        {
            Object type=it.next().toString();
            int caspiedata= (int) piechartsea.get(type);
            ddd.setValue((Comparable) type, caspiedata);
        }
            JFreeChart seapie=ChartFactory.createPieChart(network.toString() + " cases summary.", ddd, true, true, true);
            PiePlot p=(PiePlot) seapie.getPlot();
            ChartFrame cp=new ChartFrame("No of cases by type in " + network.toString(),seapie);
            cp.setVisible(true);
            cp.setSize(600,600);
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AddNetwork;
    private javax.swing.JButton bt_Remove;
    private javax.swing.JButton bt_Report;
    private javax.swing.JButton bt_ViewCases;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageNetworks;
    private javax.swing.JTable tb_Network;
    private javax.swing.JTextField txt_Name;
    // End of variables declaration//GEN-END:variables
}
