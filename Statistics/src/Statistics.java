import java.util.Arrays;
public class Statistics
{
	private double [] data;
	private double [] sdata;
	
	public Statistics (double [] d)
	{
		data=d.clone();

        sdata = d.clone();
		
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
	public double findMean()
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
		 double [ ] d = data.clone();       

         return d;

}
	public double [ ] getSortedData ( )

	{
		double [ ] d = sdata.clone();
        return d;
    }

}
	

