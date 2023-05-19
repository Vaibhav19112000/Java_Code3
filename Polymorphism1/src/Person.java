public class Person extends Date 
{
	private String name;
	private int age;
	Date dob;
	
	public Person()
	{
		
		
	}

	public Person(String name,int age,int d,int m,int y)
	{
		super(d,m,y);
		this.name=name;
		this.age=age;
		
	}
	public String toString()
	{   System.out.println("-----------");
		return  "\nName : "+name+"\nAge : " +age+super.toString();
	}
}
