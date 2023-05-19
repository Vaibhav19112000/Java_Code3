import java.io.Serializable;

public class Emp implements Serializable
{
	private int id;
	private String name;
	private double salary;
	private long working_days;
	public Emp(int id, String name, double salary, long working_days) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.working_days = working_days;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", working_days=" + working_days + "]";
	}
	
	
}
