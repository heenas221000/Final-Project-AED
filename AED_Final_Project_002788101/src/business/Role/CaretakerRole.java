/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.EcoSystem;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Caretaker.CaretakerJPanel;

/**
 *
 * @author vishwa
 */
public class CaretakerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business,Network network) {
        return new CaretakerJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }

    
}
