
public class Date {
	int day,month,year;
	
	public Date()
	{
		day=2;
		month=2;
		year=2000;
	}
	public Date(int d, int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public String show()
	{
		return "\t"+day+"/"+month+"/"+year;
	}
	public void display()
	{
		System.out.println("Date :: "+day+"/"+month+"/"+year);
	}

}