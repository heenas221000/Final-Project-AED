/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

/**
 *
 * @author hetal
 */
public class DrWorkRequest {
    CaseReporterWorkRequest CaseReporterWorkRequest;
    LabAssistantWorkRequest LabAssistanceWorkRequest;
    PharmacistWorkRequest PharmacistWorkRequest;

    private String docsign;

    public CaseReporterWorkRequest getCaseReporterWorkRequest() {
        return CaseReporterWorkRequest;
    }

    public void setCaseReporterWorkRequest(CaseReporterWorkRequest CaseReporterWorkRequest) {
        this.CaseReporterWorkRequest = CaseReporterWorkRequest;
    }

    public String getDocsign() {
        return docsign;
    }

    public void setDocsign(String docsign) {
        this.docsign = docsign;
    }

    public LabAssistantWorkRequest getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setLabAssistanceWorkRequest(LabAssistantWorkRequest LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public PharmacistWorkRequest getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setPharmacistWorkRequest(PharmacistWorkRequest PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
}
