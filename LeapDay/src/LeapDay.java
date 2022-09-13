
public class LeapDay extends Day {
	private int day;
	private int year;
	public LeapDay (int d, int m, int y) {
		super (d,m);
		
		day=d;
		month=m;
		year=y;
	}

	public int getYear ( )
	{
	  return year;
	}

	public int findDayNum ( )
	{
		Day getDay = new Day(day, month);
		getMonth();
		int dayNum = getDay.findDayNum();
	
if (((year % 400) == 0) || ( ((year %   4) == 0) && ((year%100) != 0) ) )
{
	dayNum=dayNum+1;
}

else

{ 
 return dayNum;
	
}
return dayNum;
	}
}
