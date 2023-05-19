import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Size of Stack : ");
		int size = sc.nextInt();
		int s[]=new int[size];
		for(int a=0;a<s.length;a++)
		{
			System.out.println("Enter element : ");
			s[a]=sc.nextInt();
		}
		System.out.println("1.Peek\n2.Pop\n3.Push");
		System.out.println("\nEnter Opration : ");
		int choice=sc.nextInt();
		switch(choice)
		{ case 1:Stack a= new Stack();
				a.peek(s);
				
		}
	}
}
