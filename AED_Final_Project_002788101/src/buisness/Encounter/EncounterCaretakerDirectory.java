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
public class EncounterCaretakerDirectory {
    private ArrayList<business.Encounter.EncounterCaretaker> Encounters;
    private HashMap<String,ArrayList<business.Encounter.EncounterCaretaker>> EncounterDirectory;

    public EncounterCaretakerDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<business.Encounter.EncounterCaretaker>>();
       Encounters=new ArrayList<business.Encounter.EncounterCaretaker>();
    }

    public ArrayList<business.Encounter.EncounterCaretaker> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<business.Encounter.EncounterCaretaker>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
}
