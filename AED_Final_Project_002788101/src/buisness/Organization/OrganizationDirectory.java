/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Organization;

import buisness.Organization.Organization.Type;
import business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author vishwa
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
         if (type.getValue().equals(Type.CaseReporter.getValue())){
            organization = new CaseReporterOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Forensic.getValue())){
            organization = new ForensicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CounsellingOrganization.getValue())){
            organization = new CounsellingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Legal.getValue())){
            organization = new LegalOrganization();
            organizationList.add(organization);
        }
//         else if (type.getValue().equals(Type.Rehab.getValue())){
//            organization = new RehabOrganization();
//            organizationList.add(organization);
        
         
        else if (type.getValue().equals(Type.CaseVolunteer.getValue())){
            organization = new CaseVolunteerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PsychiatricOrganization.getValue())){
            organization = new PsychiatricOrganization() {
                @Override
                public ArrayList<Role> getSupportedRole() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization searchOrganizationbyname(String Name){
        for(Organization org: organizationList){
            if(Name.equalsIgnoreCase(org.getName())){
                return org;
            }
            
        }
        return null; 
    }
    
}
