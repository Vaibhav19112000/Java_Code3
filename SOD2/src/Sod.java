
public class Sod {
	public Sod()
	{
		
	}
	public int Sumod(int num)
	{
		int num1=num;
		int count = 0;
	        while (num != 0) 
	        {
	            num = num / 10;
	            ++count;
	        }
	        
	 
		int sum=0;
		while(sum>0||sum<9) 
		{
		for(int a=0;a<count;a++)
		{
			int s=num1%10;
			sum=sum+s;
			num=num/10;
		}
		}
		
		return sum;
   }
	
	

}
