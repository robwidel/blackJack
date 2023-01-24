import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Deck d1 = new Deck();

        Card c = d1.drawCard();
        p1.setScore(c.getValue());
        p1.displayPlayerScore();
        c = d1.drawCard();
        p1.setScore(c.getValue());
        p1.displayPlayerScore();

        Scanner scanner = new Scanner(System.in);
        System.out.println("hit or stand");
        String userDecision = scanner.nextLine();
        int state = decision(userDecision, p1, d1);
        //funkcja do tego rekurencyjna
        

    }

    public static int decision(String userDecision, Player p1, Deck d1) {
        if(userDecision.equals("hit")){
            Card c = d1.drawCard();
            p1.setScore(c.getValue());

            if(p1.getScore()>21){
                p1.bust = true;
                p1.displayPlayerScore();
                System.out.println("Busted");
                return 0;
            }
            System.out.println("user Hit");
            p1.displayPlayerScore();

            Scanner scanner = new Scanner(System.in);
            System.out.println("hit(true) or stand(false)");
            String usrDec = scanner.nextLine();
            if(usrDec.equals("hit")) {
                decision(usrDec, p1, d1);
            }
            else{
                System.out.println("user Standing");
                p1.displayPlayerScore();
            }
        }
        else{
            System.out.println("user Standing");
            p1.displayPlayerScore();
        }
    return 1;}
}




//Card c3 = d1.drawCard();
//c3.displayCard();
//Card c4 = d1.drawCard();
//c4.displayCard();
//Card c5 = d1.drawCard();
//c5.displayCard();
//Card c6 = d1.drawCard();
//c6.displayCard();