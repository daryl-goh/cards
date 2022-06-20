package project.cards;

public class Cards {
    
    // Find a way to represent the suits, numbers and values of a deck of Poker cards

    public enum Suits {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    
    }

    public static final String[] CARD_NAMES = {
        "Ace", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" 
      } ;


    public static final int[] CARD_VALUES = {
        1, 2, 3, 4, 5, 6, 7,
        8, 9, 10, 10, 10, 10
    };


    private final Suits suit;
    private final String name;
    private final int value;

    public Cards(Suits s, String n, int v) {

        suit = s;
        name = n;
        value = v;

    }

    public Suits getSuits() {
        return suit;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "s=%s,n=%s,v=%d".formatted(suit, name ,value);
    }
    



}
