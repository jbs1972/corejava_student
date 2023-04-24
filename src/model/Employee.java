package model;

public abstract class Employee {
	private int id;
	private String name;
	private float basic;
	private static int counter;
	static {
		counter = 1000;
	}
	public Employee(String name, float basic) {
		super();
		this.id = ++counter;
		this.name = name;
		this.basic = basic;
	}
	public Employee() {
		super();
		this.id = ++counter;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public static int getCounter() {
		return counter;
	}
	public static int getEmployeeCount() {
		return counter-1000;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public abstract float computeSalary();
}
