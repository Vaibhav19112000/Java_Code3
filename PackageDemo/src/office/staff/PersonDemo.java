package office.staff;
import office.utility.*;

public class PersonDemo 
{
	public static void main(String [] args)
	{
		Person p1= new Person("Vaibhav",19,11,2000);
		p1.display();
		
		Person p2=new Person("Kunal",new Date(8,10,1998));
		System.out.println(p2.show());
		
	    Person p3=new Person();
	    int res=p3.displayobj();
	    System.out.println("No of object created = "+res);
		
	}

}
