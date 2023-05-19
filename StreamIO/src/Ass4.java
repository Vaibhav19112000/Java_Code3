import java.io.*;
public class Ass4 {
	public static void main(String[] args)throws Exception {
		//FileWriter, FileOutputStream
	// ---------- Write data into File Using (Byte Stream) ------
		
		/*String str1="Java Programming";
		String str2="File IO Session";
		String str3=" Result Available ";
		FileOutputStream fout=new FileOutputStream("d:\\abc.txt");
		fout.write(str1.getBytes());
		fout.write(str2.getBytes());
		fout.write(str3.getBytes());
		fout.close();*/
		
	// Write data into File using (character stream) --------
		/*String str1="Java Programming";
		String str2="File IO Session";
		String str3=" Result Available ";
		FileWriter fr=new FileWriter("d:\\pqr.txt");
		fr.write(str1);
		fr.write(str2);
		fr.write(str3);
		fr.close();*/
	
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\xyx.txt",true));
		bw.write("Hello All");
		bw.write("Welcome to Stream IO ");
		
		bw.close();
		
	}

}
