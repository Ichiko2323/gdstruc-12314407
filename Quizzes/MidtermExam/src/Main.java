import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CardStack cardDeck = new CardStack ();
        CardStack playerHand = new CardStack();
        CardStack discardPile = new CardStack();

        // Main Deck
        cardDeck.push(new Card(1, "Zeus"));
        cardDeck.push(new Card(2, "Poseidon"));
        cardDeck.push(new Card(3, "Hades"));
        cardDeck.push(new Card(4, "Demeter"));
        cardDeck.push(new Card(5, "Hera"));
        cardDeck.push(new Card(6, "Persephone"));
        cardDeck.push(new Card(7, "Athena"));
        cardDeck.push(new Card(8, "Artemis"));
        cardDeck.push(new Card(9, "Aphrodite"));
        cardDeck.push(new Card(10, "Ares"));
        cardDeck.push(new Card(11, "Hephaestus"));
        cardDeck.push(new Card(12, "Dionysus"));
        cardDeck.push(new Card(13, "Hermes"));
        cardDeck.push(new Card(14, "Apollo"));
        cardDeck.push(new Card(15, "Hestia"));
        cardDeck.push(new Card(16, "Hecate"));
        cardDeck.push(new Card(17, "Leto"));
        cardDeck.push(new Card(18, "Prometheus"));
        cardDeck.push(new Card(19, "Gaia"));
        cardDeck.push(new Card(20, "Helios"));
        cardDeck.push(new Card(21, "Nyx"));
        cardDeck.push(new Card(22, "Aether"));
        cardDeck.push(new Card(23, "Uranus"));
        cardDeck.push(new Card(24, "Chronos"));
        cardDeck.push(new Card(25, "Hyperion"));
        cardDeck.push(new Card(26, "Rhea"));
        cardDeck.push(new Card(27, "Phoebe"));
        cardDeck.push(new Card(28, "Atlas"));
        cardDeck.push(new Card(29, "Eos"));
        cardDeck.push(new Card(30, "Chaos"));


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- GREEK DEITIES TCG ---");

        while (!cardDeck.isEmpty()) {
            System.out.println("\nPress Enter to proceed.");
            scanner.nextLine();

            int action = random.nextInt(3);
            int cardCount = random.nextInt(5) + 1;


            switch (action) {
                case 0:
                    System.out.println("\nDrawing " + cardCount + " card/s.\n");
                    for (int i = 0; i < cardCount && !cardDeck.isEmpty(); i++) {
                        playerHand.push(cardDeck.pop());
                    }
                    break;
                case 1:
                    System.out.println("\nDiscarding " + cardCount + " card/s.");

                    if (!playerHand.isEmpty())
                    {
                        for (int i = 0; i < cardCount && !playerHand.isEmpty(); i++) {
                            discardPile.push(playerHand.pop());
                        }
                    }
                    else
                    {
                        System.out.println("Found no cards to discard.\n");
                    }
                    break;
                case 2:
                    System.out.println("\nRetrieving " + cardCount + " card/s from the discarded pile.");

                    if (!discardPile.isEmpty()) {
                        for (int i = 0; i < cardCount && !discardPile.isEmpty(); i++) {
                            playerHand.push(discardPile.pop());
                        }
                    }
                    else
                    {
                        System.out.println("Found no cards to retrieve.\n");
                    }
                    break;
            }
            System.out.println("Player's Hand: ");
            playerHand.printStack();
            System.out.println("Remaining Cards In Deck: " + cardDeck.size());
            System.out.println("Cards In The Discarded Pile: " + discardPile.size());
        }
        System.out.println("\nThe Player's Deck is Empty!");
        System.out.println("\n--- GAME OVER ---");
        scanner.close();
    }
}