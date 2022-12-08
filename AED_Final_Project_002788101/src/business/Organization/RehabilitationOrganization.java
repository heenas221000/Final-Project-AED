/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

 
import business.Role.RehabilitationCaretaker;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author heenashah
 */
public class RehabilitationOrganization extends Organization {
    
    public RehabilitationOrganization() {
         super(Organization.Type.RehabilitationOrganization.getValue());
    }

    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> roles = new ArrayList();
        roles.add(new RehabilitationCaretaker());
        return roles;
    }
    
}
