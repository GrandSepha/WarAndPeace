
public class MainDriver
{
	public static void main(String[] args)
	{
		System.out.println("Let's begin War!\n");
	
		Deck playerOne = new Deck();
		Deck playerTwo = new Deck();
		int oneWins = 0;
		int twoWins = 0;
	
		System.out.println("Shuffling the decks.\n");
	
		playerOne.shuffleDeck();
		playerTwo.shuffleDeck();
		
		for (int roundsRemaining = 52; roundsRemaining > 0; roundsRemaining--)
		{
			Card oneCard = playerOne.drawCard();
			System.out.println("Player One draws, " + oneCard);
		
			Card twoCard = playerTwo.drawCard();
			System.out.println("Player Two draws, " + twoCard);
		
			if (oneCard.winner(twoCard) == true)
			{
				System.out.println("Player One, wins the hand!\n");
				oneWins++;
			}
			else
			{
				System.out.println("Player Two, wins the hand!\n");
				twoWins++;
			}
		}
		
		System.out.println("Player One, wins " + oneWins + " hands.");
		System.out.println("Player Two, wins " + twoWins + " hands.");
	
		if (oneWins > twoWins)
			System.out.println("End of game. Player One wins this game!");
	
		if (oneWins == twoWins)
			System.out.println("End of game. There's a tie!");
	
		if (oneWins < twoWins)
			System.out.println("End of game. Player Two wins this game!");
	}
}