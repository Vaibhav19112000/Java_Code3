import java.io.*;

public class Deserialization 
{
	public static void main(String[] args) throws Exception
	{   Student s1;
	
	ObjectInputStream ooi=new ObjectInputStream(new FileInputStream ("student.dat"));
	for(int i=0;i<5;i++)
	{
		s1=(Student)ooi.readObject();
		System.out.println(s1);
	}
}
}
