package project.cards;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import project.cards.Cards.Suits;

public class Deck {

    private List<Cards> cards = new LinkedList<>();

    public Deck() {

        this(1);
    }
    public Deck(int numDecks) {

        for (int d = 0; d < numDecks; d++)
            for (Suits s: Suits.values()) {
                for (int i = 0; i < Cards.CARD_NAMES.length; i++) {
                    Cards card = new Cards(s, Cards.CARD_NAMES[i], Cards.CARD_VALUES[i]);
                    cards.add(card);
                }
            }

    }
    


    public void shuffle() {

        Random rand = new SecureRandom();
        for (int p = 0; p < cards.size(); p++) {
            Cards srcCard = cards.get(p);
            int idx = rand.nextInt(0, cards.size());
            Cards toSwap = cards.get(idx);
            cards.set(p, toSwap);
            cards.set(idx, srcCard);
        }
    }

    public Cards take() {
        return cards.remove(0); 
    }

    public List<Cards> take (int num) {
        List<Cards> cards = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            if (remaining () > 0)
                cards.add(take());
            else
                break;
        }
        return cards;
    }

    public int remaining() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}