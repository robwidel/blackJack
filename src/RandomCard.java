import java.util.ArrayList;

public class RandomCard {

    static public Card pickRandomCard(ArrayList<Card> deck){
        ArrayList<Card> cards = new ArrayList<>();
        for (Card c:deck){
            for(int i=0; i<c.getQuantity(); i++){
                cards.add(c);
            }
        }
        int rand = (int) (Math.random() * (cards.size()));
        Card pickedCard = cards.get(rand);
    return pickedCard;
    }
}

