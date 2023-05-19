import java.util.Comparator;
public class SortEName implements Comparator<Emp>
{


	@Override
	public int compare(Emp e1, Emp e2) 
	{
		
		return  e1.getEname().compareTo(e2.getEname());
	}
	

}
