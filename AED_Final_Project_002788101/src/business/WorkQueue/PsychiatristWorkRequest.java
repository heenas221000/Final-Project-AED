/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author hetal
 */
public class PsychiatristWorkRequest {
    
         DrWorkRequest DoctorWorkRequest;
    private ArrayList<Medicines> medicines = new ArrayList<Medicines>();

    public DrWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DrWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    }

    public ArrayList<Medicines> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicines> medicines) {
        this.medicines = medicines;
    }
    
}
