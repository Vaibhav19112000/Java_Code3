
public class Person 
{
	String name;
	Date dob;
	static int cnt;
	
	public Person()
	{
		name="NA";
		dob=new Date();
		cnt++;
		
	}
	public Person(String nm,int d,int m,int y)
	{
		name=nm;
		dob=new  Date(d,m,y);
		cnt++;
		
	}
	public Person(String nm, Date d1)
	{
		this.name=nm;
		this.dob=d1;
		cnt++;
	}
	public String show()
	{
		return name+"::"+dob.show();
	}
	public void display()
	{
		System.out.println("Person :: "+name+"\t");
		dob.display();
	}
	
	public int displayobj()
	{
		return cnt;
	}
	

}
