/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< Updated upstream
package business.Role;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.EcoSystem;
=======
=======

package business.Role;
>>>>>>> Stashed changes

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.EnterpriseAdmin.EnterpriseAdminJPanel;

/**
 *
 * @author vishwa
 */
public class LegalAdminRole extends Role{

   @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new EnterpriseAdminJPanel(userProcessContainer, enterprise, business);
    }


}
