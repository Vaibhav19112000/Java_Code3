
public class Demo
{
	public static void main(String[] args) 
	{
		
		Emp e1=new SalesManager(60,700,"Nikhil",24,8,3,1998,203,90000);
		System.out.println(e1);
		double res=e1.calSal();
		System.out.println("Salary :: "+res);
		
		Emp e2 =new Admin(20000,"xyz",23,3,4,2000,204,200000);
		System.out.println(e2);
		double ress=e2.calSal();
		System.out.println("Salary :: "+ress);
		
		Emp e3 = new Programmer("abc",24,301,300000,12,200,12,2,1999);
		System.out.println(e3);
		double resss=e3.calSal();
		System.out.println("Salary :: "+resss);
	}

}
