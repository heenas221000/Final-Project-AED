/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
import business.Network.Network; 
import business.Organization.Organization;
import business.Role.Role; 
=======
import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
>>>>>>> Stashed changes
=======
import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
>>>>>>> Stashed changes
import business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author heenashah
 */
public class EcoSystem extends Organization {
    
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkUserIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
<<<<<<< Updated upstream
    
<<<<<<< Updated upstream
    
    
    
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
}
