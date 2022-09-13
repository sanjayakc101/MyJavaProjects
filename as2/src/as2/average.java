package as2;
import javax.swing.JOptionPane;
public class average{
		       public static void main (String [] args)
		       {
		             double n1;
		             double n2;
		             double n3;
		             double sum, avg;
		             String in, out;
		             in = JOptionPane.showInputDialog ("Enter the first number");
		             n1 = Double.parseDouble (in);

		 

		             in = JOptionPane.showInputDialog("Enter the second number");
		             n2 = Double.parseDouble (in); 
		             in = JOptionPane.showInputDialog("Enter the third number");
		             n3 = Double.parseDouble (in);
		             sum = n1 + n2 + n3;
		             avg = sum / 3;
		             out = "";
		             out = out + "The sum of " + n1 +", " + n2 + " and " + n3 + " is " + sum + "\n";
		             out = out + "The average of " + n1 +", " + n2 + " and " + n3 + " is " + avg;
		             JOptionPane.showMessageDialog(null, out);
		             System.exit (0);
		       }
		}
