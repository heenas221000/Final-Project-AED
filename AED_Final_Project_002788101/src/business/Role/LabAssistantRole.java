/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.EcoSystem;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vishwa
 */
public class LabAssistantRole extends Role {

   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabAssistantJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
}
