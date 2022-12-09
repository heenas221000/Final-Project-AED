/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Encounter.EncounterCaretaker;
import java.util.ArrayList;

/**
 *
 * @author dhetal

 */
public class CaretakerWorkRequest extends WorkRequest {
      CaseReporterWorkRequest CaseReporterWorkRequest;
    ArrayList<EncounterCaretaker> CaretakerEncounter = new ArrayList<EncounterCaretaker>();

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public ArrayList<EncounterCaretaker> getCaretakerEncounter() {
        return CaretakerEncounter;
    }

    public void setCaretakerEncounter(ArrayList<EncounterCaretaker> CaretakerEncounter) {
        this.CaretakerEncounter = CaretakerEncounter;
    }
    
}