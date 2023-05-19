package model;

public class Emp  extends Person
{
	private int eid;
	private double salary;
	
	public Emp()
	{
		
	}
	public Emp(String name,int age,int eid,double salary)
	{
		super(name,age);
		this.eid=eid;
		this.salary=salary;	
	}
	public String toString()
	{
		return "Eid : "+eid+super.toString()+"\nSalary : "+salary;
	}
}
