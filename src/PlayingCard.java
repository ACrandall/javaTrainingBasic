/**
 * Created by acrandall on 2/4/2016.
 */
public class PlayingCard {
    public String rank;
    public String suit;
    public String color;

    public PlayingCard(){
        this.rank = "ACE";
        this.suit = "SPADES";
    }

    public PlayingCard(String rank){
        this.rank = rank;
//        this.suit = "SPADES";
    }

    public PlayingCard(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public PlayingCard(String rank, String suit, String ourColor){
        this.rank = rank;
        this.suit = suit;
        color = ourColor;
    }


    public static void main(String[] args) {
        PlayingCard aCard = new PlayingCard();
        PlayingCard bCard = new PlayingCard("TWO");
        PlayingCard cCard = new PlayingCard("THREE","HEARTS");
        PlayingCard dCard = new PlayingCard("FOUR","DIAMONDS","BLUE");

        assert (aCard.rank == "TWO");
    }
}
