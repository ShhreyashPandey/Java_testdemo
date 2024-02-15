import java.util.*;

public class Deck {
    ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    void createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "A"};
        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }
    }

    void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    void sameCard(String suit) {
        for (Card card : deck) {
            if (card.getSuit().equals(suit)) {
                System.out.println(card);
            }
        }
    }

    void compareCard(int index1, int index2) {
        Card card1 = deck.get(index1);
        Card card2 = deck.get(index2);
        
        if (card1.getValue().equals(card2.getValue())) {
            System.out.println("Same Value");
        }
        if (card1.getSuit().equals(card2.getSuit())) {
            System.out.println("Same Suit");
        }
    }

    void findCard(String suit, String value) {
        for (Card card : deck) {
            if (card.getSuit().equals(suit) && card.getValue().equals(value)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

    void dealCard() {
        Random random = new Random();
        System.out.println("Randomly Dealt 5 Cards:");
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(deck.size());
            System.out.println(deck.get(index));
        }
    }

    void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully.");
    }
}
