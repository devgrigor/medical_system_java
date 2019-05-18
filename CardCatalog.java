
import java.util.*;

/**
 * 
 */
public class CardCatalog {
    Map< Integer, Card > myMap;

    /**
     * Default constructor
     */
    public CardCatalog() {
        this.myMap = new HashMap<Integer, Card>();
    }

    /**
     * @param CardID
     */
    public void addCard(Integer CardID, Card card) {
        // TODO implement here
        this.myMap.put(CardID, card);
    }

    /**
     * @param cardID
     */
    public Card findCard(Integer cardID) {
        return this.myMap.get(cardID);
    }

    /**
     * @param CardID
     */
    public void delete(Integer CardID) {
        
        this.myMap.remove(CardID);
    }

}