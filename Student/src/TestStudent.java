import java.util.StringTokenizer;

import javax.swing.JOptionPane;
public class TestStudent {

	public static void main(String[] args) {
	String in;

     int nStudents, nExams;

     in = JOptionPane.showInputDialog("Enter number of students");

     nStudents = Integer.parseInt(in);
     
       Student [] st = new Student [nStudents];
          
       for (int i = 0;i < st.length;i++){
    	   
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
                        }
      String outA="", outB="", outC="", outD="", outF=""; 
         
      String grade="";
      
      for (int i = 0; i < st.length; i++){

    grade = st[i].findGrade();

  if (grade.equalsIgnoreCase("A")){
         
       outA=outA+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                                    }
    else if (grade.equalsIgnoreCase("B")){      
         
      outB=outB+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                                    }
  else if (grade.equalsIgnoreCase("C")){    
         
	  outC=outC+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
                                    	
  		}
  else if (grade.equalsIgnoreCase("D")){                              	
                                    	
	  outD=outD+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
  		}
  else {                    	
	  outF=outF+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";                            	
  		}
    	}
        String outAll=outA+outB+outC+outD+outF;
       JOptionPane.showMessageDialog(null, outAll);
	}
}
