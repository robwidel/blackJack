public class Player {
    private int score = 0;
    Boolean hit = false;
    Boolean stand = false;
    Boolean bust = false;

    public int getScore() {
        return score;
    }

    public void setScore(int cardValue) {
        this.score += cardValue;
    }
    public void displayPlayerScore(){
        System.out.println("gracz ma na rece: " + score);
    }
}
