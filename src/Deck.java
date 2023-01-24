import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        deck.add(new Card(10, "walet"));
        deck.add(new Card(10, "krolowa"));
        deck.add(new Card(10, "krol"));
        deck.add(new Card(11, "as"));
        deck.add(new Card(10, "dziesiatka"));
        deck.add(new Card(2, "dwojka"));
        deck.add(new Card(3, "trojka"));
        deck.add(new Card(4, "czworka"));
        deck.add(new Card(5, "piatka"));
        deck.add(new Card(6, "szostka"));
        deck.add(new Card(7, "siodemka"));
        deck.add(new Card(8, "osemka"));
        deck.add(new Card(9, "dziewiatka"));
    }

    public Card drawCard(){
        Card randCard = RandomCard.pickRandomCard(deck);
        randCard.cardPicked();
    return randCard;
    }
}

