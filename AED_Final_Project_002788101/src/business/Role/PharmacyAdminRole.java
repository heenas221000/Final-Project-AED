/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import buisness.Enterprise.Enterprise;
import business.Network.Network;
import buisness.Organization.Organization;
import business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author vishwa
 */
public class PharmacyAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new EnterpriseAdminJPanel(userProcessContainer, enterprise, business);
    }
    
}
