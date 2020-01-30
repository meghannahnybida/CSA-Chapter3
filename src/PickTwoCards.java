import java.util.Random;

public class PickTwoCards {
    //Author: Meghan Nahnybida
    //Date: 1/23/2020

    public static void main(String[] args) {

        final int CARDS_IN_SUIT = 13;
        char[] suits = {'S', 'D', 'C', 'H'};
        int rand1 = ((int) (Math.random() * suits.length));
        int rand2 = ((int) (Math.random() * suits.length));
        int myValue;
        int yourValue;

        Cards myCard = new Cards();
        Cards yourCard = new Cards();

        myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);

        myCard.setValue(myValue);
        yourCard.setValue(yourValue);
        myCard.setSuit(suits[rand1]);
        yourCard.setSuit(suits[rand2]);

        System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
        System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());
    }

}
