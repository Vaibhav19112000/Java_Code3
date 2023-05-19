
public class Demo 
{
	public static void main(String a[])
	{
		
		Book b[]=new Book[5];
		b[0]=new EBook ("C",500);
		b[1]=new EBook ("C++",560);
		b[2]=new EBook ("Java",1120);
		b[3]=new EBook ("Python",480);
		b[4]=new EBook ("AI",3570);
		for(Book d:b)
		{
		 double res=d.calCost();
         System.out.println("\nPrice :: "+d.calCost());
		}
		
		System.out.println("--------");
		Book c[]=new Book[5];
		c[0]=new PaperBook ("ABC",570);
		c[1]=new PaperBook ("XYZ",580);
		c[2]=new PaperBook ("EFG",1020);
		c[3]=new PaperBook ("HIJ",4800);
		c[4]=new PaperBook ("LMN",3550);
		for(Book e:c)
		{
			double ress=e.calCost();
			System.out.println("Book : "+ e.getName());
			System.out.println("\nPrice :: "+ress);
		}
	}
}
