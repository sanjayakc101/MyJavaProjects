import javax.swing.JOptionPane;
public class TestRectangle {
public static void main(String[] args) {
String in, out;
         	double l, w;
         	double area, perim;
         in=JOptionPane.showInputDialog ("Enter length");
         l=Double.parseDouble (in);
         in=JOptionPane.showInputDialog ("Enter width");
         w=Double.parseDouble (in);

         Rectangle r1 = new Rectangle (l, w);
         in=JOptionPane.showInputDialog ("Enter length");
         l=Double.parseDouble (in);
         in=JOptionPane.showInputDialog ("Enter width");
         w=Double.parseDouble (in);

         Rectangle r2 = new Rectangle (l, w);
         l = r1.getLength ( );
         w= r1.getWidth ( );
         area= r1.computeArea ( );
         perim= r1.computePerim ( );
         out="First Rectangle:\n";
         out=out + "Length: " + l + "\n";
         out= out + "Width: " + w + "\n";
         out= out + "Area: " + area + "\n";
         out= out + "Perimeter: " + perim + "\n";
         l = r2.getLength ( );
         w= r2.getWidth ( );
         area= r2.computeArea ( );
         perim= r2.computePerim ( );


         out=out+"\nSecond Rectangle:\n";
         out=out + "Length: " + l + "\n";
         out= out + "Width: " + w + "\n";
         out= out + "Area: " + area + "\n";
         out= out + "Perimeter: " + perim + "\n";
         JOptionPane.showMessageDialog (null, out); 
         System.exit(0);                           
}
}
