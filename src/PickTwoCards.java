import java.util.Random;

public class PickTwoCards {

    public static void main(String[] args) {

        final int CARDS_IN_SUIT = 13;
        Random rd = new Random();
        char[] suits = {'S', 'D', 'C', 'H'};
        int randS = rd.nextInt(suits.length);
        int randD = rd.nextInt(suits.length);
        int myValue;
        int yourValue;
        Cards myCard = new Cards();
        Cards yourCard = new Cards();

        myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        myCard.setValue(myValue);
        myCard.setSuit(suits[randS]);
        yourCard.setValue(yourValue);
        yourCard.setSuit(suits[randD]);

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card is the " +yourCard.getValue() + " of " + yourCard.getSuit());
    }
}
