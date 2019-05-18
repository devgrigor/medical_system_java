
import java.util.*;

/**
 * 
 */
public class Card {

    /**
     * Default constructor
     */
    public Card(Integer cardID, Integer patientID, Integer disieaseID, Integer doctorID) {
        this.cardID = cardID;
        this.patientID = patientID;
        this.diseaseID = disieaseID;
        this.doctorID = doctorID;
    }

    /**
     * 
     */
    private Integer cardID;

    /**
     * 
     */
    private Integer patientID;

    /**
     * 
     */
    private Integer diseaseID;

    /**
     * 
     */
    private Integer doctorID;

    public Date changeDate;

}