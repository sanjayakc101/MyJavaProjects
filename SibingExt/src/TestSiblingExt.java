import javax.swing.JOptionPane;
public class TestSiblingExt
{
            public static void main (String[] args)
            { 
            	String in, out, name;

            	int age, weight, height;

            	SiblingExt sibe1, sibe2, sibe3;
            	
    name=JOptionPane.showInputDialog("Enter name");

    in=JOptionPane.showInputDialog("Enter age");

    age=Integer.parseInt(in);

    in=JOptionPane.showInputDialog("Enter weight");

    weight=Integer.parseInt(in);

    in=JOptionPane.showInputDialog("Enter height");

    height=Integer.parseInt(in);        	
            	
    sibe1 = new SiblingExt (name, age, weight, height);        	
            	
    name=JOptionPane.showInputDialog("Enter name");

in=JOptionPane.showInputDialog("Enter age");

age=Integer.parseInt(in);

in=JOptionPane.showInputDialog("Enter weight");

weight=Integer.parseInt(in);

in=JOptionPane.showInputDialog("Enter height");

height=Integer.parseInt(in);        	
            	
 sibe2 = new SiblingExt (name, age, weight, height);           	
    
  name=JOptionPane.showInputDialog("Enter name");

in=JOptionPane.showInputDialog("Enter age");

age=Integer.parseInt(in);

in=JOptionPane.showInputDialog("Enter weight");

weight=Integer.parseInt(in);

in=JOptionPane.showInputDialog("Enter height");

height=Integer.parseInt(in);  
    
    
   sibe3 = new SiblingExt (name, age, weight, height); 
    
    SiblingExt youngest=null, lightest=null, tallest=null;
    
    if (sibe1.getAge( ) <= sibe2.getAge( ) && sibe1.getAge( ) <= sibe3.getAge( ) )
{
            youngest=sibe1;
 }
else if (sibe2.getAge( ) <= sibe1.getAge( ) && sibe2.getAge( ) <= sibe3.getAge( ) )
{
            youngest=sibe2;
 }
else
{
            youngest=sibe3;
 }
    
    if (sibe1.getWeight( ) <= sibe2.getWeight( ) && sibe1.getWeight( ) <= sibe3.getWeight( ) )
    {
                lightest=sibe1;
     }
    else if (sibe2.getWeight( ) <= sibe1.getWeight( ) && sibe2.getWeight( ) <= sibe3.getWeight( ) )
    {
                lightest=sibe2;
     }
    else
    {
                lightest=sibe3;
     }  
    
    if (sibe1.getHeight( ) > sibe2.getHeight( ) && sibe1.getHeight( ) > sibe3.getHeight( ) )
    {
                tallest=sibe1;
     }
    else if (sibe2.getHeight( ) > sibe1.getHeight( ) && sibe2.getHeight( ) > sibe3.getHeight( ) )
    {
                tallest=sibe2;
     }
    else
    {
                tallest=sibe3;
    }

    
    out="";

	out = "The Youngest Sibling: " + youngest.getName() + " " + youngest.getAge() + " " + youngest.getWeight() + "\n" ;
	out = out + "The Lightest Sibling: " + lightest.getName() + " " + lightest.getAge() + " " + lightest.getWeight() + "\n" ; 
	out = out + "The Tallest Sibling: " + tallest.getName() + " " + tallest.getAge() + " " + tallest.getWeight() + "\n" ;

	JOptionPane.showMessageDialog(null, out);
}
}