import java.util.*;
import java.io.*;
public class Serialization
{
	public static void main(String[] args)throws Exception
	{
		Student s;
		int rollno;
		String name;
		double percentage;
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter Number of Data : ");
		int a=sc.nextInt();*/
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream ("student.dat"));
		for(int i=0;i<5;i++)
		{   System.out.println("Enter Roll_no Name Percentage : ");
			rollno=sc.nextInt();
			name=sc.next();
			percentage=sc.nextDouble();
			
			s=new Student(rollno,name,percentage);
			oos.writeObject(s);
			
			
		}
		oos.close();
	}
}
