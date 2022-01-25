package war;

public class Card {

	private int value;
	private String name;
	
	
	//constructor
	
	
	public Card () {
	}
	
	
	
	//getters and setters
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public int getValue(int value) {
		return value;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
		public String getName(String name) {
			return name;
		}
	
					
	public String describeCard() {
		return "This is a " + this.value + " of " + this.name;
	}





	
	
}

