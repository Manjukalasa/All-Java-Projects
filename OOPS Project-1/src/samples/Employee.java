package samples;

public class Employee {
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + sal;
	}

}
