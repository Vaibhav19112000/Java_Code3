
public class Admin extends Emp
{
	private double bonus;
	
	public Admin()
	{
		
	}
	public Admin(double bonus,String name,int age,int d,int m,int y,int eid,double salary)
	{
		super(name,age,eid,salary,d,m,y);
		this.bonus=bonus;
	}
	public String toString()
	{
		return "\n"+super.toString() +"\nBonus : "+bonus;
	}
	public double calSal()
    {
   	 return (super.getSalary()+bonus);
   	 
    }
	

}
