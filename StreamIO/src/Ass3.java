import java.io.*;
public class Ass3 {
	public static void main(String[] args) throws Exception {
		
		InputStreamReader fi=new InputStreamReader(System.in);
		BufferedReader bfin=new BufferedReader(fi);
		int i;
		System.out.println(" Enter Data ");
		while((i=bfin.read()) !='q')
			System.out.println((char)i);
		bfin.close();
	
		
	}

}
