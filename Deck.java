package war;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList <Card> deck = new ArrayList <>();{

	for (int i = 0; i < 52; i++) {
		//creates 
	deck.add(new Card ()); 
	if (i < 13) {
		deck.get(i).setValue(i);
		deck.get(i).setName("Hearts");
	} 
		else if (i < 26) {
		
		 deck.get(i).setValue(i-13);
		 deck.get(i).setName("Diamonds");
	} 
		else if (i < 39) {
			deck.get(i).setValue(i-26);
			 deck.get(i).setName("Spades");
		}
		else if (i < 52) {
			deck.get(i).setValue(i-39);
			 deck.get(i).setName("Clubs");
		}
		
	}
	}	
	public void shuffle () {
		Collections.shuffle(deck);
	}
	public Card draw () {
		return this.deck.remove(0);
	}
	
}
