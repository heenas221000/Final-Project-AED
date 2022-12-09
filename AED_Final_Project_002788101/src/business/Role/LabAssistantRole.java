/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;
<<<<<<< Updated upstream

import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.EcoSystem;
<<<<<<< Updated upstream
import business.Organization.Organization;
=======
>>>>>>> Stashed changes
import business.UserAccount.UserAccount;
=======
 
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.Lab.LabAssistantJPanel;
>>>>>>> Stashed changes
import javax.swing.JPanel;

/**
 *
 * @author vishwa
 */
public class LabAssistantRole extends Role {

   
<<<<<<< Updated upstream
   @Override
=======
  @Override
>>>>>>> Stashed changes
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabAssistantJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
}
