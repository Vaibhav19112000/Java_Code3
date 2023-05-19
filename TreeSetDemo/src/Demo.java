import java.util.*;
public class Demo 
{
	public static void main(String[] args)
	{   
		int dptId;
		String dptName,city,name;
		double salary;
		TreeSet<Emp> e=new TreeSet<>();
		TreeSet<Emp> e1=new TreeSet<Emp>(new SortEmpId());
		TreeSet<Emp> e2=new TreeSet<Emp>(new SortEName());
		TreeSet<Emp> e3=new TreeSet<Emp>(new SortSalary());
		for(int i=0;i<10;i++)
		{   
			System.out.println("Enter ID DPTNAME CITY SALARY NAME : ");
			Scanner sc=new Scanner(System.in);
			dptId=sc.nextInt();
			dptName=sc.next();
			city=sc.next();
			salary=sc.nextDouble();
			name=sc.next();
			e.add(new Emp(dptId,dptName,city,salary,name));
			e1.add(new Emp(dptId,dptName,city,salary,name));
			e2.add(new Emp(dptId,dptName,city,salary,name));
			e3.add(new Emp(dptId,dptName,city,salary,name));
		}
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
