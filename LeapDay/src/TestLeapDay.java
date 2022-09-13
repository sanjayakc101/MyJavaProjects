import javax.swing.JOptionPane;

public class TestLeapDay {

	public static void main(String[] args) {
		String in, out;
		int day, month, year;
		
in = JOptionPane.showInputDialog("Enter day");
day = Integer.parseInt(in);

in = JOptionPane.showInputDialog("Enter month");
month = Integer.parseInt(in);

in = JOptionPane.showInputDialog("Enter year");
year = Integer.parseInt(in);

LeapDay Day1 = new LeapDay(day, month, year);
int dayNum = Day1.findDayNum();

out = "";
out = out + "Day Number for " + month + "/" + day + "/" + year +" is " + dayNum + "\n";
JOptionPane.showMessageDialog ( null, out);
	}

}
