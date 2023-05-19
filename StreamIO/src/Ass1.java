
	import java.io.*;
	import java.util.Scanner;
	public class Ass1 {
	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		String fileName;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter File Name To Open ");
		fileName=sc.next();
		FileInputStream fin=new FileInputStream(fileName);
		
		int i;
		System.out.println(" File Data Is : \n");
		 while((i=fin.read())!=-1)
			 System.out.print((char)i);
		 
		 fin.close();
		
		
		
	}
	}
