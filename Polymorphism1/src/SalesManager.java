
public class SalesManager extends Emp
{
	private int target;
	private double incentive;
	
	public SalesManager()
	
	{
		
	}
     public SalesManager(int target,double incentive,String name,int age,int d,int m,int y,int eid,double salary)
    
    {	 
    	 super(name,age,eid,salary,d,m,y);
    	 this.target=target;
    	 this.incentive=incentive;
    	 
	}
     public String toString()
     {
    	 return super.toString()+"\nTarget : "+target+"\nIncentive : "+incentive;
     }
     public double calSal()
     {
    	 return (super.getSalary()+(target*incentive));
    	 
     }
	
	
}
