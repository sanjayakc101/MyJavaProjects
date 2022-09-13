public class Rectangle {
	 private double length;
	 private double width;
	 public Rectangle (double l, double w)
{
    	length = l;
           	width = w;
}
    public double getLength ( )
    {
                return length;
    }
    public double getWidth ( )
    {
                return width;
    }
    public double computeArea ( )
    {
                double a=0;
                a = length * width;
                return a;
    }
    public double computePerim ( )
    {
                double p=0;
                p = 2 * (length + width);
                return p;
    }   
}
