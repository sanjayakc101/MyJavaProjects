import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class JFrameExt extends JFrame implements ActionListener {

	private JLabel jlbMessage = new JLabel ("Enter Guess");

	private JTextField jtfMessage = new JTextField (15);

	private JTextArea jtaMessage = new JTextArea (10, 20);

	private JScrollPane jscrMessage = new JScrollPane (jtaMessage,

			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,

			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	JPanel jpNorth = new JPanel( );
	JPanel jpCenter = new JPanel ( );

	private Guess g;

	private int guessCount = 0;
	private int gameCount = 0;

	public JFrameExt ( )
	{
		super ( );

		FlowLayout fl = new FlowLayout ();

		jpCenter.setLayout(fl);

		this.setContentPane (jpCenter);

		jpCenter.add(jpNorth);

		jpNorth.add  (jlbMessage);
		jpNorth.add (jtfMessage);

		jpCenter.add (jscrMessage);

		jtfMessage.addActionListener(this);

		g = new Guess ( );
	}

	public void actionPerformed (ActionEvent e)
	{ 
		String message = null;
		String userGuess;

		if (e.getSource() == jtfMessage)
		{
			guessCount = guessCount++;

			try
			{
				userGuess = jtfMessage.getText( ).trim ( );
				g.checkGuess ( userGuess);
				message = "Correct Guess\n";

				gameCount = gameCount++;

				g = new Guess ( );
			}
			catch (GuessNotWholeNumberException ex)
			{
				message = ex.getMessage ( );
			}
			catch (GuessTooSmallException ex)
			{
				message = ex.getMessage( );
			}
			catch (GuessTooLargeException ex)
			{
				message = ex.getMessage( );
			}
			catch (GuessOutOfBoundsException ex)
			{
				message = ex.getMessage( );
			}

			finally
			{
				jtaMessage.append (message + "\n");
				jtaMessage.append ("Enter your guess above" + "\n");
			}
		}
	}
}

