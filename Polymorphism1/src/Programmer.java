
public class Programmer extends Emp
{
	private float extra_hrs;
	private double charges;
	
	public Programmer()
	{
		
	}
	public Programmer(String name,int age,int eid,double salary,float extra_hrs,double charges,int d,int m ,int y)
	{
		super(name,age,eid,salary,d,m,y);
		this.extra_hrs=extra_hrs;
		this.charges=charges;
	}
	public double calSal()
    {
   	 return (super.getSalary()+(extra_hrs*charges));
   	 
    }
	public String toString()
	{
		return super.toString()+"\nExtra_Hrs : "+extra_hrs+"\nCharges_per_Hr : "+charges;
				
	}
	

}
