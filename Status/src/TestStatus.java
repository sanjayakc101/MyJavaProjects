import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class TestStatus {

	public static void main(String[] args) {
	 String in, out;
	 Status[] status=new Status[6];
	 int statusIndex = 0;
	 
	 
	 for (int i=0; i<3; i++)

     {

		 in= JOptionPane.showInputDialog ("Enter length");

		 double length=Double.parseDouble(in);

		 in= JOptionPane.showInputDialog ("Enter width");

		 double width=Double.parseDouble(in);

		 status[statusIndex]=new Rectangle(length,width);

		 statusIndex++;

     }

	 for (int i=0; i<2; i++)

     {
		 String n = JOptionPane.showInputDialog ("Enter Name");
		 in= JOptionPane.showInputDialog ("Enter Age");

		 int a=Integer.parseInt(in);

		 in= JOptionPane.showInputDialog ("Enter weight");

		 int w=Integer.parseInt(in);

		 status[statusIndex]=new Sibling(n, a, w);

		 statusIndex++;

     }
		 

	 
	  for (int i=0; i<1; i++)

      {
		  
		  int nStudents, nExams;

		     in = JOptionPane.showInputDialog("Enter number of students");

		     nStudents = Integer.parseInt(in);	
		     
		       Student [] st = new Student [nStudents];
		          
		       for (i = 0;i < st.length;i++){
		    	   
		    	   in = JOptionPane.showInputDialog

		 ("Enter one student data with items separated by commas");  
		        	  
		        	  
		   String delim = ",";

		   String token;
		       
		   StringTokenizer stk = new StringTokenizer (in, delim);

		   token = stk.nextToken ().trim();

		   int id=Integer.parseInt(token);

		   String name = stk.nextToken ().trim();

		   token = stk.nextToken ().trim();

		   nExams=Integer.parseInt(token);

		   double[] scores=new double[nExams];

		   for (int j=0;j<nExams;j++){

		   token = stk.nextToken().trim();

		   scores[j]=Double.parseDouble(token);
		   }   
		  
		   st [i] = new Student (id, name, scores);
		       
		   
		status[statusIndex]=new Student(id, name, scores);

		statusIndex++;
		  
      }
	  
	  for (int index=0; index<status.length; index++)

	  {

		  status[index].displayStatus ( );

	  }	  
	  out ="";

	  for (int index=0; index<status.length; index++)

	  {

		  out = out + status[index].getStatus ( );

	  }

	  JOptionPane.showMessageDialog (null, out);

	              }
	  
	}
}

