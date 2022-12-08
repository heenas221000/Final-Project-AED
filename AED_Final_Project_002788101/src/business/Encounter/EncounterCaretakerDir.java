/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Encounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author hetal
 */
public class EncounterCaretakerDir {
    
    private ArrayList<EncounterCaretaker> Encounters;
    private HashMap<String, ArrayList<EncounterCaretaker>> EncounterDirectory;
    
    public EncounterCaretakerDir(){
        EncounterDirectory= new HashMap<String,ArrayList<EncounterCaretaker>>();
        Encounters= new ArrayList<EncounterCaretaker>();
    }
    
    public ArrayList<EncounterCaretaker> getEncounters(){
        return Encounters;
    }
   
    public HashMap<String, ArrayList<EncounterCaretaker>> getEncounterDirectory(){
        return EncounterDirectory;
    }
     
}
