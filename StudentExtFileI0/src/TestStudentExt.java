import java.util.StringTokenizer;
import java.io.*;
import javax.swing.JOptionPane;
public class TestStudentExt {

	public static void main(String[] args) throws Exception {
		String in, outAll;
		int nStudents, nExams;
   
   BufferedReader br = new BufferedReader(new FileReader("in.txt"));
   PrintWriter pw = new PrintWriter (new FileWriter("out.txt"));
   
   in = br.readLine();
   in = JOptionPane.showInputDialog("Enter number of students");
   nStudents = Integer.parseInt(in);
 
  StudentExt [] st = new StudentExt [nStudents];
  
  	for (int i = 0;i < st.length;i++){
	
  	in = br.readLine();
    in = JOptionPane.showInputDialog
    ("Enter one student data, items separated by comma");
 
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
    String gradeType= stk.nextToken().trim();
    st [i] = new StudentExt (id, name, scores, gradeType);
   	}
    String outA="", outB="", outC="", outD="", outF="", outCr="", outNcr="";
    
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
     else if (grade.equalsIgnoreCase("F")){
    	 outF=outF+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
     	}
     else if (grade.equalsIgnoreCase("CR")){
    	outCr=outCr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
     	}
     else if (grade.equalsIgnoreCase("NCR")){	
    	outNcr=outNcr+ st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
         }
    	}
    	outAll=outA+outB+outC+outD+outF+ outCr+outNcr;
    	pw.println(outAll);

    	pw.flush();
    	if (br != null)

    		br.close();

    	if (pw != null)

    		pw.close();
		}
}

  
    
