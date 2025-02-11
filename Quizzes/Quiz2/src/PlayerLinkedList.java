public class PlayerLinkedList {

    private PlayerNode head;
    private int size; // In-place counter

    public PlayerLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
        size++;
    }

    public void printLinkedList() {
        System.out.print("(Head) -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }

    public void removeFirstElement() {
        head = head.getNextPlayerNode();
        size--;
    }

    public int getSize() { // Gets size of list
        return size;
        }

    public boolean contains(Player player) { // Check if list contains target element
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true; // If found
            }
            current = current.getNextPlayerNode();
        }
        return false; // If not found
    }

    public int indexOf(Player player) { // Checks the index of target element
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index; // If found
            }
            current = current.getNextPlayerNode();
            index++;
        }
        return -1; // If not found
    }
}