import java.util.Arrays;
public class Statistics {
	private double [] data; 
	private double [] sdata;
	public static int count=0;

	public Statistics (double [ ] d )
			{
            count=count + 1;
            data = new double  [d.length];
            sdata = new double [d.length];
             
            System.arraycopy (d, 0, data, 0, d.length);
            System.arraycopy (d, 0, sdata, 0, d.length);
            Arrays.sort (sdata );  
			}
	public double findMin ( )
			{
            double min=sdata[0];
            return min;           
			}                         
	public double findMax ( )
			{
            double max=sdata[sdata.length-1];
            return max;
			}
	public double findMean ( )
			{
            double sum, mean;
            sum=0;
            for (int i=0; i<sdata.length; i++)
            {
            sum=sum+sdata [i];
            }
            mean=sum/sdata.length;
            return mean;
			}

	public double findMedian ( )
			{	
			double median;
			int index, indexHi, indexLo;

			if ( (sdata.length %2) != 0 )
				{
                index = sdata.length / 2;
                median = sdata [index];
				}
				else
				{
                indexHi = sdata.length / 2;
                indexLo = indexHi - 1;
                median = (sdata[indexLo] + sdata[indexHi] ) / 2;
				}
    
				return median;
				}
    public double [ ] getOrigData ( )
    			{
    	 	double [ ] d = new double [ data.length ];
    	 	System.arraycopy ( data, 0, d, 0, data.length );
    	 	return d;
    			}
    public double [ ] getSortedData ( )
    {
    double [ ] d = new double [ data.length ];
 	System.arraycopy ( sdata, 0, d, 0, data.length );
 	return d;
    }
    
    		public static double computeMin (double [ ] data)

    			{
    			Statistics st = new Statistics ( data );

    			double min = st.findMin ( );
    			return min;
    			}
    		public static double computeMax (double [ ] data)

    			{
    			Statistics st = new Statistics ( data );
    			double max = st.findMax ( );
    			return max;		
    			}
    		public static double computeMean (double [] data )
			{
    		Statistics st = new Statistics ( data );
            double mean =st.findMean();
            return mean;
			}
    		public static double computeMedian (double [] data )
			{
    		Statistics st = new Statistics ( data );
            double median =st.findMedian();
    		
			return median;
    		}
    		public static double [ ] computeSortedData (double [] data)
    			{
    			Statistics st = new Statistics ( data );
    			double [] computeSortedData = st.getSortedData();
    			return computeSortedData;
    		    }
}
