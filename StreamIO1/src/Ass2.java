import java.io.*;
public class Ass2 {
	public static void main(String[] args)throws Exception {
		String str;
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader bf= new BufferedReader (i);
		System.out.println("enter string and Quit for Exit");
		
		while(!(str=bf.readLine()).equals("Quit"))
		{
			System.out.println(str);
		}
		
		bf.close();
}
}

