import java.util.LinkedList;

public class CardStack {
    LinkedList<Card> cardList;

    public CardStack() {
        cardList = new LinkedList<Card>();
    }

    public void push (Card card) {
        cardList.push(card);
    }

    public Card pop() {
        return cardList.pop();
    }

    public Card peek() {
        return cardList.peek();
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }

    public int size() {
        return cardList.size();
    }

    public void printStack() {
        System.out.println(cardList);
    }
}