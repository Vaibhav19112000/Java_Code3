

abstract public class Emp extends Person
{
	private int eid;
	private double salary;
	
	public Emp()
	{
		
	}
	public Emp(String name,int age,int eid,double salary,int d,int m,int y)
	{
		super(name,age,d,m,y);
		this.eid=eid;
		this.salary=salary;	
	}
	public String toString()
	{
		return "Eid : "+eid+super.toString()+"\nSalary : "+salary;
	}
	public double getSalary()
	{
		return salary;
	}
	abstract public double calSal();
	
}
