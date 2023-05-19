import java.util.*;
public class SortEmpId implements Comparator<Emp>
{


	@Override
	public int compare(Emp e1, Emp e2) 
	{
		
		return  e1.getDptId()-e2.getDptId();
	}
	

}
