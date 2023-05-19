import java.util.Scanner;
import java.io.*;

public class Ass1 {
	public static void main(String[] args)throws Exception {
		
		BufferedReader b= new BufferedReader ( new InputStreamReader(System.in));
		
		int c;
		int count=0;
		System.out.println("Enter char : ");
		while((c=b.read())!='q')
		{
			
			System.out.println((char)c);
			count++;
		}
		System.out.println("Count : "+count);
		b.close();
	
	}

}
