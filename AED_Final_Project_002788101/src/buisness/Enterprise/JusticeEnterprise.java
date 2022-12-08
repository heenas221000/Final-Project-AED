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
public class JusticeEnterprise {
    public JusticeEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Justice);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
