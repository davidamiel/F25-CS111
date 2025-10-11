public class PlayingCards {

    public static void main(String[] args) {
        
        String[] suits = {"♣", "♦", "♠", "♥"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
                          "9", "10", "J", "Q", "K", "A"};

        String[] deck = new String[suits.length * ranks.length];
        int nextFreeIndex = 0;

        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < ranks.length; j++) {
                // card to add to the deck
                String currentCard = suits[i] + ranks[j] + " ";

                // add the card to the deck
                deck[nextFreeIndex] = currentCard;
                nextFreeIndex ++;
            }
        }

        for(String card : deck) {
            System.out.print(card + " ");
        }


    }
    
}
