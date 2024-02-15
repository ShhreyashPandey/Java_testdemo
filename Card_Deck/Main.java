//Shhreyash Pandey
//AIML-B2
//22070126105

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print Card");
            System.out.println("3. Print Cards of Same Suit");
            System.out.println("4. Compare Card");
            System.out.println("5. Find Card");
            System.out.println("6. Deal 5 Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    deck.printDeck();
                    break;
                case '2':
                    System.out.print("Enter index: ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case '3':
                    System.out.print("Enter suit: ");
                    String suit = scanner.next();
                    deck.sameCard(suit);
                    break;
                case '4':
                    System.out.print("Enter index 1: ");
                    int index1 = scanner.nextInt();
					System.out.print("Enter index 2: ");
                    int index2 = scanner.nextInt();
                    deck.compareCard(index1,index2);
                    break;
                case '5':
                    System.out.print("Enter suit: ");
                    String findSuit = scanner.next();
                    System.out.print("Enter value: ");
                    String findValue = scanner.next();
                    deck.findCard(findSuit, findValue);
                    break;
                case '6':
                    deck.dealCard();
                    break;
                case '7':
                    deck.shuffleDeck();
                    break;
                case '8':
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != '8');
        scanner.close();
    }
}
