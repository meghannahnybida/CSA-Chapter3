import java.util.Random;

public class PickTwoCards {

    public static void main(String[] args) {

        final int CARDS_IN_SUIT = 13;
        char[] suits = {'H', 'D', 'S', 'C'};
        int myValue;
        int yourValue;
        Cards myCard = new Cards();
        Cards yourCard = new Cards();

        myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        myCard.setValue(myValue);
        myCard.setSuit('S');
        yourCard.setValue(yourValue);
        yourCard.setSuit('H');

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card is the " +yourCard.getValue() + " of " + yourCard.getSuit());
    }
}
