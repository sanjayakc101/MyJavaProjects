import javax.swing.JOptionPane;
public class RectangleProc {
	public static void main(String[] args) {
String in, out;
double l, w;
double area, perim;
        in = JOptionPane.showInputDialog ("Length: ");
        l = Double.parseDouble (in);
        
        in = JOptionPane.showInputDialog ("Width: ");
        w = Double.parseDouble (in);
        area = computeArea (l, w);
        perim= computePerim (l, w);
        
        out="Length: " + l + "\n";

        out= out + "Width: " + w + "\n";

        out= out + "Area: " + area + "\n";

        out= out + "Perimeter: " + perim + "\n";       
        JOptionPane.showMessageDialog (null, out);     
    }
public static double computeArea (double l, double w)
{
    double area;
    area = l * w;
    return area;
}
public static double computePerim (double l, double w)
{
	double perim;
	perim = 2 * (l+w);
	return perim;
    }
}
