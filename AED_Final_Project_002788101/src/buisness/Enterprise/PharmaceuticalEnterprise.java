/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vishwa
 */
public class PharmaceuticalEnterprise {  public PharmaceuticalEnterprise(String name){
        super(name,EnterpriseType.Pharmaceutical);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
    
}
