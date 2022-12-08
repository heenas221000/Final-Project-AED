/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

import business.Role.PharmacistRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author heenashah
 */
public class PharmacyOrganization extends Organization {
    
    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
    
}
