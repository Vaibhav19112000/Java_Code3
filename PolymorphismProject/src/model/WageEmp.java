package model;

public class WageEmp extends Emp
{
	private float hrs;
	private float rate;
	public WageEmp()
	{
		
	}
	public WageEmp(String name,int age,int eid,double salary,float hrs,float rate)
	{
		super(name,age,eid,salary);
		this.hrs=hrs;
		this.rate=rate;
	}
	public String toString()
	{
		return super.toString()+"\nHrs : "+hrs+"\nRate : "+rate;
	}
}

