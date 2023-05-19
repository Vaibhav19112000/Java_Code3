
public class Stack 
{
	private static int top;
	static 
	{
		top=-1;
	}
	
	public boolean pop()
	{
		boolean flag=false;
		if(top==-1)
		{
			flag=true;
			
		}
		else
		{
			top=top-1;
		}
		return flag;
	}
	public void peek(int s[])
	{
		if(top!=-1)
		{
			System.out.println(s[top]);
		}
		else
			throw new StackUnderFlowException();
	}
	public void push(int d[],int size,int num)
	{
		
		if(top!=size-1)
		{
			top=top+1;
			d[top]=num;
		}
		else
		{
			throw new StackOverFlowException();
		}
	}

}
