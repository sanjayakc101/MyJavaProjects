import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class HappyFace extends JFrame implements ActionListener {

	JButton happy = new JButton("Happy");
	JButton sad = new JButton("Sad");
	JButton picture = new JButton("Picture");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	int i = 0;

	public HappyFace () {
		this.setContentPane(panel);
		GridLayout g1 = new GridLayout(6,1);
		panel.setLayout(g1);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);

		panel.setBackground(Color.YELLOW);
		panel1.setBackground(Color.YELLOW);
		panel2.setBackground(Color.YELLOW);
		panel3.setBackground(Color.YELLOW);
		panel4.setBackground(Color.YELLOW);
		panel5.setBackground(Color.YELLOW);
		panel6.setBackground(Color.GREEN);
		panel6.add(happy);
		panel6.add(sad);
		panel6.add(picture);
		happy.addActionListener(this);
		happy.addActionListener(this);
		sad.addActionListener(this);
		picture.addActionListener(this);
	}
	public void paint (Graphics g) {
		super.paint(g);

		if (i == 1) {
			g.drawOval(30, 50, 70, 70);
			g.fillOval(50, 70, 3, 5);
			g.fillOval(75, 70, 3, 5);
			g.drawArc(28, 30, 75, 75, 210, 120);
		} 

		if (i == 2) {
			g.drawOval(30, 50, 70, 70);
			g.fillOval(50, 70, 3, 5);
			g.fillOval(75, 70, 3, 5);
			g.drawArc(28, 80, 75, 75, 40, 100);
		}
		if  (i == 3) {
			URL url = getClass( ).getResource ("myfile.jpg");
			ImageIcon imageIcon = new ImageIcon (url);
			Image image = imageIcon.getImage( );
			g.drawImage (image, 25, 35, 100, 100, this);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Happy")) {
			i = 1;
			repaint();
		}
		else if(e.getActionCommand().equals("Sad")) {
			i = 2;
			repaint();

		}
		else if(e.getActionCommand().equals("Picture")) {
			i = 3;
			repaint();
		}
	}
}




