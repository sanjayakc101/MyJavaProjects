import javax.swing.JOptionPane;
public class TestDay {
	
	public static void main(String[] args) {

		String in, out;
		int day, month;
		
in = JOptionPane.showInputDialog("Enter day");
day = Integer.parseInt(in);

in = JOptionPane.showInputDialog("Enter month");
month = Integer.parseInt(in);

Day Day1 = new Day(day, month);
int dayNum = Day1.findDayNum();

out = "";
out = out + "Day Number for " + month + "/" + day + " is " + dayNum + "\n";
JOptionPane.showMessageDialog ( null, out);
    }
}

