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
public class EncounterPsychiatristDirectory {
    private ArrayList<EncounterPsychiatrist> HPEncounters;
    private HashMap<String,ArrayList<EncounterPsychiatrist>> HPEncounterDirectory;
    
    public EncounterPsychiatristDirectory()
    {
       HPEncounterDirectory=new HashMap<String,ArrayList<EncounterPsychiatrist>>();
       HPEncounters=new ArrayList<EncounterPsychiatrist>();
    }

    public ArrayList<EncounterPsychiatrist> getHPEncounters() {
        return HPEncounters;
    }

    public HashMap<String, ArrayList<EncounterPsychiatrist>> getHPEncounterDirectory() {
        return HPEncounterDirectory;
    }
}
