
public class Main {
    public static void main(String[] args) {
        PlayerQueue players = new PlayerQueue(10);

        players.enqueue(new Player(1, "Deku", 100));
        players.enqueue(new Player(2, "Saitama", 999));
        players.enqueue(new Player(3, "Saiki K.", 500));

        //print initial queue
        System.out.println("\nInitial Queue: ");
        players.printQueue();

        // enqueue new player
        System.out.println("\n\nEnqueue Player Sakamoto:  ");
        players.enqueue(new Player(4, "Sakamoto", 10));
        players.printQueue();

        //dequeue a player
        System.out.println("\n Dequeue player: ");
        Player removedPlayer = players.dequeue();
        System.out.println("\nRemoved player " + removedPlayer + "\nNew Front " + players.peek());
    }
}