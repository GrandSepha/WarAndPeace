/**
 * Deck class must represent a standard "52" playing card
 * deck with 4 suits of 13 different playing cards,
 * each deck will initialize itself with 52 card objects
 * must be able to shuffle itself, and draw a card for play.
 * 
 * @author GrandSepha
 *
 */
public class Deck 
{
	private Card[] deck;
	private final int deckSize = 52;
	private int deal = 0;
	
	//Constructor. Initialize new deck of cards
	public Deck()
	{
		deck = new Card[deckSize];
		
		for (Suit cardSuit : Suit.values())
		{
			for(Value cardValue : Value.values())
			{
				deck[deal] = new Card(cardValue, cardSuit);
				deal++;
			}
		}
		
		deal = 0;
	};
	
	//Shuffles the deck randomly.
	public void shuffleDeck()
	{
		for (deal = deckSize-1; deal > 0; deal--)
		{
			int rand = (int)(Math.random()*(deal+1));
            Card temp = deck[deal];
            deck[deal] = deck[rand];
            deck[rand] = temp;
		}
		
		deal = 0;
	};
	
	//Draw a card for play
	public Card drawCard()
	{
		if (deal == deckSize)
			throw new IllegalStateException("Deck is empty");
		deal++;
		
		return deck[deal - 1];
	};
}
