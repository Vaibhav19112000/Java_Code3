import java.io.*;
public class Student implements Serializable
{
	private int rollno;
	private String name;
	private double percentage;
	public Student(int rollno, String name, double percentage) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	 
}
