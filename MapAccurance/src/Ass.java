import java.util.*;
public class Ass 
{
	public static void main(String[] args)
	{
		TreeMap <Character,Integer > a= new TreeMap<>();
		String str="the quick brown fox jumps over a lazy dog"; 
		for(int i=0;i<str.length();i++)
		{
			
			if(a.containsKey(str.charAt(i)))
			{
				int cnt=a.get(str.charAt(i));
				    cnt++;
				    a.put(str.charAt(i), cnt);
				
			}
			else
			{
				a.put(str.charAt(i),1);
			}
		}
		System.out.println(a);
		
	}
}
