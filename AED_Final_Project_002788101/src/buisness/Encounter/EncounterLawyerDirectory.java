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
public class EncounterLawyerDirectory {
    private ArrayList<EncounterLawyer> Encounters;
    private HashMap<String,ArrayList<EncounterLawyer>> EncounterDirectory;
 public EncounterLawyerDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterLawyer>>();
       Encounters=new ArrayList<EncounterLawyer>();
    }

    public ArrayList<EncounterLawyer> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterLawyer>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
}
