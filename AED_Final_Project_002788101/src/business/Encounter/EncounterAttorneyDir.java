/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Encounter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author hetal
 */
public class EncounterAttorneyDir {
    
private ArrayList<EncounterAttorney> Encounters;
    private HashMap<String,ArrayList<EncounterAttorney>> EncounterDirectory;

    public EncounterAttorneyDir() {
       EncounterDirectory=new HashMap<String,ArrayList<EncounterAttorney>>();
       Encounters=new ArrayList<EncounterAttorney>();
    }

    public ArrayList<EncounterAttorney> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<EncounterAttorney>> getEncounterDirectory() {
        return EncounterDirectory;
    }
}
