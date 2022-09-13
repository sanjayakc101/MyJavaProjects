import java.text.DecimalFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		String out, in="";
		 String delim = ",";
		  int count=0;
		   String token="";
		  in = JOptionPane.showInputDialog
        ("Enter data values separated by commas");
		 
		  StringTokenizer st = new StringTokenizer (in, delim);
		  count = st.countTokens ( );
		  double[] data = new double [count];
		  for (int i=0; i<count; i++)
      {
         token = st.nextToken ( );
		   token = token.trim ( );
         data [i] = Double.parseDouble(token);
      }
		  Statistics stat=new Statistics(data);
		  	double min = stat.findMin();
		  	double max = stat.findMax();
		  	double mean = stat.findMean();
		  	double median = stat.findMedian();
		  	double[] origData = stat.getOrigData();
		  	double [ ] sortedData = stat.getSortedData();

		  	
		   in = JOptionPane.showInputDialog
         ("Enter number of decimal places for output");

		   	int placesCount = Integer.parseInt (in);
		   	String pattern = "0.";
		   	for (int i=0; i<placesCount; i++)
			pattern = pattern + "0";
		   	DecimalFormat df = new DecimalFormat ( );
		   	df.applyPattern (pattern);
		   	out ="";
           out = out + "Original Data: \n";
           for (int i=0; i<origData.length; i++)
           {
            out = out + origData [i] + " ";
           }  
           out = out + "\n";
           out = out + "\n";
           out=out + "Results Using Instance Methods:\n";
           out = out + "\n";
           out = out + "Sorted Data: \n";
           for (int i=0; i<sortedData.length; i++)
           {
            out = out + sortedData [i] + " ";
           }
           out = out + "\n";
           out = out + "\n";
           out=out + "Computed Values:\n";
           out = out + "Min: " + df.format (min) + "\n";
           out = out + "Max: " + df.format (max) + "\n";
           out = out + "Mean: " + df.format (mean) + "\n";
           out = out + "Median: " + df.format (median) + "\n";
           out = out + "\n";

          		double min2 = Statistics.computeMin(data);
          		double max2 = Statistics.computeMax(data);
          		double mean2 = Statistics.computeMean(data);
   		  	double median2 = Statistics.computeMedian(data);
   		 double [ ] sortedData2 = Statistics.computeSortedData(data);
   		  	
          		out=out + "Results Using Static Methods:\n";
          		out = out + "\n";
          		out = out + "Sorted Data: \n";
          		for (int i=0; i<sortedData2.length; i++)
                {
                 out = out + sortedData2 [i] + " ";
                }
               out = out + "\n";
               out = out + "\n";
               out=out + "Computed Values:\n";
          		out = out + "Min: " + df.format (min2) + "\n";
          		out = out + "Max: " + df.format (max2) + "\n";
               out = out + "Mean: " + df.format (mean2) + "\n";
               out = out + "Median: " + df.format (median2) + "\n";
               out = out + "\n";
               int instanceCount=Statistics.count;
          		out = out +
            "The Total Number of Statistics objects created during execution:\n";
          		out = out + instanceCount+"\n";
          		 JOptionPane.showMessageDialog ( null, out);
   }
}
