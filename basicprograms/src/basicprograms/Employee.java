package basicprograms;

public class Employee {
	private int num;
	private String name;
	private double sal;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
