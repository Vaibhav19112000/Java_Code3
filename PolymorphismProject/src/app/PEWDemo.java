package app;
import model.*;

public class PEWDemo 
{
	public static void main(String[] args) 
	{
		Person p[]=new Person[3];
		p[0]=new Person("ABCD",25);
		p[1]=new Emp("WXYZ",28,100,70000);
		p[2]=new WageEmp("QWERTY",30,200,95000,79,300);
		for(Person a:p)
		{
			System.out.println(a);
		}
		
	}

}
