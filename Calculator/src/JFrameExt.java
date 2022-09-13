import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JFrameExt extends JFrame implements ActionListener
{

	private JPanel jpMain = new JPanel();
	private JPanel jpNumber1 = new JPanel();
	private JPanel jpNumber2 = new JPanel();
	private JPanel jpResult = new JPanel();
	private JPanel jpOption = new JPanel();

	private JLabel jlbNumber1 = new JLabel("Number 1");
	private JLabel jlbNumber2 = new JLabel("Number 2");
	private JLabel jlbResult = new JLabel("Result");

	private JTextField jtfNumber1 = new JTextField(10);
	private JTextField jtfNumber2 = new JTextField(10);
	private JTextField jtfResult = new JTextField(10);

	private JButton jbtAdd = new JButton("Add");
	private JButton jbtSub = new JButton("Sub");
	private JButton jbtMult = new JButton("Mult");
	private JButton jbtDiv = new JButton("Div");
	private JButton jbtClear = new JButton("Clear");

	public JFrameExt()
	{
		this.setContentPane(jpMain);
		GridLayout g1 = new GridLayout(4, 1);

		jpMain.setLayout(g1);
		jpMain.add(jpNumber1);
		jpMain.add(jpNumber2);
		jpMain.add(jpResult);
		jpMain.add(jpOption);

		jpNumber1.setBackground(Color.green);
		jpNumber2.setBackground(Color.red);
		jpResult.setBackground(Color.yellow);
		jpOption.setBackground(Color.pink);

		jpNumber1.add(jlbNumber1);
		jpNumber1.add(jtfNumber1);

		jpNumber2.add(jlbNumber2);
		jpNumber2.add(jtfNumber2);

		jpResult.add(jlbResult);
		jpResult.add(jtfResult);

		jpOption.add(jbtAdd);
		jpOption.add(jbtSub);
		jpOption.add(jbtMult);
		jpOption.add(jbtDiv);
		jpOption.add(jbtClear);

		jtfResult.setEditable(false);


		jbtAdd.addActionListener(this);
		jbtSub.addActionListener(this);
		jbtMult.addActionListener(this);
		jbtDiv.addActionListener(this);
		jbtClear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ev)
	{

		String sNum1, sNum2, sResult;
		double dNum1, dNum2, dResult;

		if(ev.getSource() == jbtClear)
		{
			sNum1 = "";
			sNum2 = "";
			sResult = "";

			jtfNumber1.setText(sNum1);
			jtfNumber2.setText(sNum2);
			jtfResult.setText(sResult);
			return;
		}

		sNum1 = jtfNumber1.getText().trim();
		sNum2 = jtfNumber2.getText().trim();

		dNum1 = Double.parseDouble(sNum1);
		dNum2 = Double.parseDouble(sNum2);

		if(ev.getSource() == jbtAdd)
		{
			dResult = dNum1 + dNum2;
			sResult = "" + dResult;
			jtfResult.setText(sResult);
		}

		else if(ev.getSource() == jbtSub)
		{

			dResult = dNum1 - dNum2;
			sResult = "" + dResult;
			jtfResult.setText(sResult);
		}
		else if(ev.getSource() == jbtMult)
		{

			dResult = dNum1 * dNum2;
			sResult = "" + dResult;
			jtfResult.setText(sResult);
		}

		else if(ev.getSource() == jbtDiv)
		{

			dResult = dNum1 / dNum2;
			sResult = "" + dResult;
			jtfResult.setText(sResult);
		}
	}
}