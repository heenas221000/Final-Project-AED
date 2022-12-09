/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Organization;
import buisness.Employee.EmployeeDirectory;
import buisness.Encounter.EncounterCaretakerDirectory;
import buisness.Encounter.EncounterCounsellorDirectory;
import buisness.Encounter.EncounterLawyerDirectory;
import buisness.Encounter.EncounterPsychiatristDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author vishwa
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private EncounterCounsellorDirectory counsellorencounterdirectory;
    private EncounterLawyerDirectory lawyerencounterdirectory;
    private EncounterCaretakerDirectory caretakerencounterdirectory;
    private EncounterPsychiatristDirectory Psychiatricencounterdirectory;
    public enum Type{
        CaseReporter("CaseReporterOrganization"),Hospital("HospitalOrganization"),Forensic("ForensicOrganization"),
        CounsellingOrganization("CounsellingOrganization"), Legal("LegalOrganization"), CaseVolunteer("CaseVolunteer"),
        PsychiatricOrganization("PsychiatricOrganization"),Pharmacy("PharmacyOrganization");//,Rehab("RehabOrganization")
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        counsellorencounterdirectory=new EncounterCounsellorDirectory();
        lawyerencounterdirectory = new EncounterLawyerDirectory();
        caretakerencounterdirectory = new EncounterCaretakerDirectory();
        Psychiatricencounterdirectory=new EncounterPsychiatristDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    public EncounterPsychiatristDirectory getPsychiatricencounterdir() {
        return Psychiatricencounterdirectory;
    }

    public EncounterCounsellorDirectory getCounsellorencounterdir() {
        return counsellorencounterdirectory;
    } 

    public EncounterLawyerDirectory getLawyerencounterdir() {
        return lawyerencounterdirectory;
    }
    
     public EncounterCaretakerDirectory getCaretakerencounterdir() {
        return caretakerencounterdirectory;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
