
public class PaperBook extends Book
{
	private double del_chrgs;
	
	
		
	    public PaperBook(String name,double price)
	    {
	    	super(name,price);
	    	if(price<=500)
	    		del_chrgs=0.07f;
	    	if(price>500&&price<=1000)
	    		del_chrgs=0.05f;
	    	if(price>1000&&price<=5000)
	    		del_chrgs=0.02f;
	    }
	    public double calCost()
	    {
	    	double x=super.getPrice()+(super.getPrice()*del_chrgs);
	    	return x;
	    	
	    }
}


