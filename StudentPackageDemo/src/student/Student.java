package student;
import java.util.*;

public class Student 
{
	private int rollno;
	private String name;
	private int noOfSub;
	private double marks[];
	public Student(int rollno,String name,int noOfSub)
	{
		this.rollno=rollno;
		this.name=name;
		this.noOfSub=noOfSub;
		marks=new double[noOfSub];
		for(int i=0;i<marks.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter mark for sub " +(i+1)+" :: ");
			marks[i]=sc.nextDouble();
		}
	}
	
	public void display()
	{
		System.out.println("--**--**--**--**--**--**--");
		System.out.println("Roll number   :: "+rollno);
		System.out.println("Name          :: "+name);
		System.out.println("Number of sub :: "+noOfSub);
		System.out.println();
		
		for(int i = 0;i<marks.length;i++)
		{
			System.out.println("Mark for sub "+(i+1)+" :: "+marks[i]);
		}
	}
	
}