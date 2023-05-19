import java.io.*;
public class Ass2 {

	public static void main(String[] args) {
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream("d:\\batch3\\check.txt");
			int i;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}