/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Encounter.EncounterCounsellor;
import java.util.ArrayList;

/**
 *
 * @author hetal
 */
public class CounsellorWorkRequest {
     CaseReporterWorkRequest hswr;
    ArrayList<EncounterCounsellor> ConslrEncounter = new ArrayList<EncounterCounsellor>();

    public CaseReporterWorkRequest getHswr() {
        return hswr;
    }

    public void setHswr(CaseReporterWorkRequest hswr) {
        this.hswr = hswr;
    }

    public ArrayList<EncounterCounsellor> getConslrEncounter() {
        return ConslrEncounter;
    }

    public void setConslrEncounter(ArrayList<EncounterCounsellor> ConslrEncounter) {
        this.ConslrEncounter = ConslrEncounter;
    }
    
}
