/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Encounter.EncounterAttorney;
import java.util.ArrayList;

/**
 *
 * @author hetal

 */
public class AttorneyWorkRequest extends WorkRequest {
      CaseReporterWorkRequest CaseReporterWorkRequest;
    ArrayList<EncounterAttorney> AttorneyEncounter = new ArrayList<EncounterAttorney>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public ArrayList<EncounterAttorney> getAttorneyEncounter() {
        return AttorneyEncounter;
    }

    public void setAttorneyEncounter(ArrayList<EncounterAttorney> AttorneyEncounter) {
        this.AttorneyEncounter = AttorneyEncounter;
    }
    
}
