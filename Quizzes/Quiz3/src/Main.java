import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerQueue players = new PlayerQueue(14);
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int matchesFound = 0;

        while (matchesFound < 10)
        {
            System.out.println("\nPress Enter to proceed.");
            scanner.nextLine();

            int playersToAdd = random.nextInt(7) + 1;

            for (int i = 0; i < playersToAdd; i++) {
                int id = random.nextInt(1000);
                players.enqueue(new Player(id, "Player " + id));
            }

            System.out.println("\nMatchmaking Queue: ");
            players.printQueue();

            if (players.getSize() >= 5)
            {
                System.out.println("\n\nMatch found for the following players:");
                for (int i = 0; i < 5; i++) {
                    Player dequeuedPlayer = players.dequeue();
                    if (dequeuedPlayer != null) {
                        System.out.println(dequeuedPlayer);
                    }
                }
                matchesFound++;
                System.out.println("\nMatches Found: " + matchesFound);
            }
        }
        System.out.println("\n\n10 games found! Closing program.");
        scanner.close();
    }
}