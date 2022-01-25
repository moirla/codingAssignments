package war;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player p1 = new Player("Linden");
		Player p2 = new Player("Yerrin");
		Player[] pArr = {p1, p2};
		deck.shuffle();
		for(int i = 1; i < 52; i++) {
			pArr[i%2].draw(deck);
		}
		
		Card p1Card = null;
		Card p2Card = null;
		for (int i = 1; i < 26; i++) {
			p1Card = p1.flip();
			p2Card = p2.flip();
			if (p1Card.describeCard().compareTo(p2Card.describeCard()) > 0) {
				p1.incrementScore();
				System.out.println(p1Card.describeCard() + " > " + p2Card.describeCard());
			} else {
				p2.incrementScore();
				System.out.println(p1Card.describeCard() + " < " + p2Card.describeCard());
			}
		}
		int p1score , p2score;
		p1score = p1.getScore(); p2score = p2.getScore();
		if (p1score > p2score) 
			System.out.println("Player 1 Wins : " + p1score + " to " + p2score);
		else if (p1score < p2score)
			System.out.println("Player 2 Wins : " + p1score + " to " + p2score);
		else
			System.out.println("Draw : " + p1score + " to " + p2score);
		
	}

}
