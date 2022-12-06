/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.Encounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vishwa
 */
public class EncounterCounsellorDirectory {private ArrayList<EncounterCounsellor> Encounters;
    private HashMap<String,ArrayList<EncounterCounsellor>> EncounterDirectory;

    public EncounterCounsellorDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterCounsellor>>();
       Encounters=new ArrayList<EncounterCounsellor>();
    }

    public ArrayList<EncounterCounsellor> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterCounsellor>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
}
