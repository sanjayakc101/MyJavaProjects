import javax.swing.JOptionPane;
public class TestStatistics {

	public static void main(String[] args)
	{
		String in, out;

		
		
		in=JOptionPane.showInputDialog ("Enter item count");

        int itemCount=Integer.parseInt(in);
        

        double[] data= new double[itemCount];
        
        
        for(int i=0; i<itemCount; i++)

        {

        	in = JOptionPane.showInputDialog("Enter data value");

        	data[i]=Double.parseDouble(in);                   

        }
        
        Statistics stat=new Statistics(data);

        
        
        double min = stat.findMin();

        double max = stat.findMax();

        double mean = stat.findMean();
        
        double median = stat.findMedian();
        


        double[] origData = stat.getOrigData();
        
        
        double [ ] sortedData = stat.getSortedData();
        
        out = "";

        

        out = out + "Original Data: \n";

        for (int i=0; i<origData.length; i++)
        {

         out = out + origData [i] + " ";

        }

        out = out + "\n";

        out = out + "Sorted Data: \n";
        for (int i=0; i<sortedData.length; i++)

        {

                    out = out + sortedData [i] + " ";

        }

        out = out + "\n";
        

        out = out + "Min: " + min + "\n";

        out = out + "Max: " + max + "\n";

        out = out + "Mean: " + mean + "\n";
        
        out = out + "Median: " + median + "\n";

        
        JOptionPane.showMessageDialog ( null, out);

    }
}
