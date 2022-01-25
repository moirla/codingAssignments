package war;

import java.util.ArrayList;

public class Player {

	private ArrayList <Card> hand;
	private int score;
	private String name;
	
	
	//constructor setting player name and score to 0	
		public Player(String name) {
			this.name = name;
			hand = new ArrayList <>();
		}
		
		public String describe () {
			
			String cards = "";
			
			for (int i = 0; i < this.hand.size(); i++) {
				
				if (i == this.hand.size() - 1) {
					
					cards = cards + this.hand.get(i).describeCard();
				} else {
					
					cards = cards + this.hand.get(i).describeCard() + ", ";
				}
			}
			return this.name + " " + this.score + " " + cards;
		}
		
	
		
		public Card flip () {
			
			return this.hand.remove(0);
		}
		
		public void draw (Deck a) {
			
			this.hand.add(a.draw());
		}
		
		public void incrementScore () {
			
			this.score++;
		}
		
		public int getScore () {
			
			return this.score;
		}
		
		public int cardCount () {
			return hand.size();
		}
}
