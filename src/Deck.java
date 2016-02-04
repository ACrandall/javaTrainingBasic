/**
 * Created by acrandall on 2/4/2016.
 */
public class Deck {
    public PlayingCard[] pileOfCards = new PlayingCard[52];

    public Deck(){

        for (int i = 0; i < 4; i++) {
            String suit;
            switch (i){
                case 0:
                    suit = "SPADES";
                    break;
                case 1:
                    suit = "DIAMONDS";
                    break;
                case 2:
                    suit = "CLUBS";
                    break;
                default:
                    suit = "HEARTS";
                    break;
            }
            for (int j = 1; j <= 13; j++) {
                String rank;
                if (j == 1) {
                    rank = "ACE";
                } else if (j == 11) {
                    rank = "JACK";
                } else if (j == 12) {
                    rank = "QUEEN";
                } else if (j == 13) {
                    rank = "KING";
                } else {
                    rank = String.valueOf(j);
                }
                pileOfCards[13*i + j -1] = new PlayingCard(rank,suit);
            }
        }
    }

    public static void main(String[] args) {
        Deck ourDeck = new Deck();
        for(PlayingCard card:ourDeck.pileOfCards) {
            System.out.println(card.rank + " of " + card.suit);
        }
    }
}
