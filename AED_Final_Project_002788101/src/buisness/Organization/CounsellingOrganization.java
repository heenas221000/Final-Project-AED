/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Organization;

import business.Role.CounsellorRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vishwa
 */
public class CounsellingOrganization  extends Organization{
    
    public CounsellingOrganization() {
        super(Organization.Type.CounsellingOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounsellorRole());
        return roles;
    }
    
}
