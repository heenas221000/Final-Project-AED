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
public class WellnessEnterprise {
    public WellnessEnterprise(String name){
        super(name,EnterpriseType.Wellness);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
