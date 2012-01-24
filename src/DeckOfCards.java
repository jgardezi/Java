
public class DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		/*
		 * Card numbers 0 to 12, 13 to 25, 26 to 38, 39 to 51 represent 13 Spades, 13 Hearts, 13 Diamonds,
		 * and 13 Clubs, respectively.
		 * Initialize cards
		 */
		for(int i=0 ; i<deck.length ; i++ ) {
			deck[i] = i;
		}
		
		//Shuffle the cards
		for(int i=0 ; i<deck.length ; i++){
			//Generate an index randomly
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;			
		}
		
		//display the first 4 cards
		for(int i=0 ; i<4 ; i++){
			String suit = suits[deck[i] / 13];
			System.out.println( deck[i] + " "+ deck[i] % 13);
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number "+ deck[i] + ": " + rank + " of "+ suit);
		}

	}

}
