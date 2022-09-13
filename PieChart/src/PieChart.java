import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PieChart extends JFrame {

	private double north;
	private double south;
	private double east;
	private double west;
	private double midwest;

	public PieChart(double north, double south, double east, double west,

			double midwest) throws HeadlessException {

		super();

		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.midwest = midwest;
	}
	@Override
	public void paint (Graphics g){

		super.paint(g);
		double total=north+south+east+west+midwest;


		int startAngle=0;
		int arcLength=(int)(north/total*360.0);
		g.setColor(Color.red);
		g.fillArc(100,100,300,300,startAngle,arcLength);

		startAngle=startAngle+arcLength;
		arcLength=(int)(south/total*360.0);
		g.setColor(Color.green);
		g.fillArc(100,100,300,300,startAngle,arcLength);

		startAngle=startAngle+arcLength;
		arcLength=(int)(east/total*360.0);
		g.setColor(Color.yellow);
		g.fillArc(100,100,300,300,startAngle,arcLength);

		startAngle=startAngle+arcLength;
		arcLength=(int)(west/total*360.0);
		g.setColor(Color.pink);
		g.fillArc(100,100,300,300,startAngle,arcLength);

		startAngle=startAngle+arcLength;
		arcLength=(int)(midwest/total*360.0);
		g.setColor(Color.blue);
		g.fillArc(100,100,300,300,startAngle,arcLength);

		int xRect=100;
		int rectWidth=50;
		int horSpacing=10;
		int vertSpacing=5;

		int yRect=500;
		int rectHeight=10;
		g.setColor(Color.red);
		g.fillRect (xRect,yRect,rectWidth,rectHeight);

		int xString=xRect+rectWidth+horSpacing;
		int yString=yRect+rectHeight;
		String theString="North - 20.0";
		g.drawString (theString,xString,yString);

		yRect=yRect+rectHeight+vertSpacing;
		rectHeight=10;
		g.setColor(Color.green);
		g.fillRect (xRect,yRect,rectWidth,rectHeight);

		yString=yRect+rectHeight;
		theString="South - 25.0";                  
		g.drawString (theString,xString,yString);

		yRect=yRect+rectHeight+vertSpacing;
		rectHeight=10;
		g.setColor(Color.yellow);
		g.fillRect (xRect,yRect,rectWidth,rectHeight);

		yString=yRect+rectHeight;
		theString="East - 15.0";                  
		g.drawString (theString,xString,yString);

		yRect=yRect+rectHeight+vertSpacing;
		rectHeight=10;
		g.setColor(Color.pink);
		g.fillRect (xRect,yRect,rectWidth,rectHeight);

		yString=yRect+rectHeight;
		theString="West - 30.0";                  
		g.drawString (theString,xString,yString);

		yRect=yRect+rectHeight+vertSpacing;
		rectHeight=10;
		g.setColor(Color.blue);
		g.fillRect (xRect,yRect,rectWidth,rectHeight);

		yString=yRect+rectHeight;
		theString="Midwest - 10.0";                  
		g.drawString (theString,xString,yString);
	}
}