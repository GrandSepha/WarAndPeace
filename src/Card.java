/**
 * A playing card that must be represented with the standard
 * suit and face value. A card must be able to print out
 * its value and suit. Must be able to be comparable to other
 * cards.
 * 
 * @author GrandSepha
 *
 */
public class Card 
{
	private final Value value;
	private final Suit suit;
	
	//Card constructor
	public Card(Value value, Suit suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	//Method for Card object to declare its properties
	public String toString()
	{
		return value + " of " + suit;
	}
	
	//Method that compares this card to another and state which higher value
	public boolean winner(Card card)
	{
		boolean wins = false;
		
		if (value.compareTo(card.value) > 0)
			wins = true;
		if (value.compareTo(card.value) == 0)
			if (suit.compareTo(card.suit) > 0)
				wins = true;
		
		return wins;
	}
}
