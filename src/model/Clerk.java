package model;

public class Clerk extends Employee {
	@Override
	public float computeSalary() {
		return getBasic()+overtime;
	}
	private float overtime;
	public Clerk(String name, float basic, float overtime) {
		super(name, basic);
		this.overtime = overtime;
	}
	public Clerk(String name, float basic) {
		super(name, basic);
	}
	public float getOvertime() {
		return overtime;
	}
	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	@Override
	public String toString() {
		return "Clerk [id=" + getId() + ", name=" + getName() + ", basic=" + getBasic() + ", overtime=" + overtime + "]";
	}
}
