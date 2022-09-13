
public class Guess {

	private int selection;

	public Guess()
	{
		selection = ((int) (Math.random() * 7)) + 1;
	}

	public void checkGuess (String guess ) throws GuessOutOfBoundsException,
	GuessTooLargeException, GuessTooSmallException, GuessNotWholeNumberException
	{
		int n = 0;

		try
		{
			n = Integer.parseInt (guess);
		}

		catch (NumberFormatException ex)
		{
			throw new GuessNotWholeNumberException( );
		}

		if ( n > 7 || n < 1)

		{
			throw new GuessOutOfBoundsException( );
		}
		else if ( n > selection )
		{
			throw new GuessTooLargeException ( );
		}
		else if (n < selection)
		{
			throw new GuessTooSmallException ( );
		}
		return;
	}
}
