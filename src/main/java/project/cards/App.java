package project.cards;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println("-------- Before");
        System.out.println(d);
        d.shuffle();
        System.out.println("-------- After");
        System.out.println(d);


        List<Cards> cards = d.take(5);
        System.out.println("-------- Take 5");
        System.out.println(cards);
    }
    
}
