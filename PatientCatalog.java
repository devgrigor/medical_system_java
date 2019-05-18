import java.util.*;
import java.lang.*;

/**
 * 
 */
public class PatientCatalog {
    Map< Integer, Patient > myMap;
    /**
     * Default constructor
     */
    public PatientCatalog() {
        this.myMap = new HashMap<Integer, Patient>();
    }


    /**
     * @param patient
     */
    public void addPateint(Patient patient) {
        this.myMap.put(patient.patientID, patient);
        System.out.println("Patient added");
    }

}