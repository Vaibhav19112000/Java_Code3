import java.util.*;
public class SortSalary implements Comparator <Emp> 
{


	public int compare(Emp o1, Emp o2) {
		
		return (int)o1.getSalary()-(int)o2.getSalary();
	}

}
