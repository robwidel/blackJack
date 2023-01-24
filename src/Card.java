public class Card {
    private int value;
    private String id;
    private int quantity = 4;

    public Card(int value, String id) {
        this.value = value;
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void cardPicked(){
        quantity--;
    }

    public void displayCard(){
           System.out.println("karta: " + this.id + " ma wartosc: " + this.value + " jest ich w talii: " + this.quantity);
   }


}
