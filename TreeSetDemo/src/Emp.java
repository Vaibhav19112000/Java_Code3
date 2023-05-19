import java.util.*;
public class Emp implements Comparable<Emp>
{
	private int dptId;
	private String Ename;
	private String dptName,city;
	private double salary;
	public int getDptId() {
		return dptId;
	}
	public void setDptId(int dptId) {
		this.dptId = dptId;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(int dptId, String dptName, String city,double salary,String name)
	{
		
		this.dptId = dptId;
		this.dptName = dptName;
		this.city = city;
		this.salary=salary;
		this.Ename=name;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	
	@Override
	public String toString() {
		return "Emp [dptId=" + dptId + ", Ename=" + Ename + ", dptName=" + dptName + ", city=" + city + ", salary="
				+ salary + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
		return 0;
	}
	
	
	

}
