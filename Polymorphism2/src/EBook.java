
public class EBook extends Book
{
	private  float discount;
	
    public EBook(String name,double price)
    {
    	super(name,price);
    	if(price<=500)
    		discount=0.02f;
    	if(price>500&&price<=1000)
    		discount=0.05f;
    	if(price>1000&&price<=5000)
    		discount=0.07f;
    }
    public double calCost()
    {
    	double x=super.getPrice()-(super.getPrice()*discount);
    	return x;
    	
    }
    
}
