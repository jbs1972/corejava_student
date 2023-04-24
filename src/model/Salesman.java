package model;

public class Salesman extends Employee {
	@Override
	public float computeSalary() {
		return getBasic()+comm;
	}
	private float comm;
	public Salesman(String name, float basic, float comm) {
		super(name, basic);
		this.comm = comm;
	}
	public Salesman(String name, float basic) {
		super(name, basic);
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "Salesman [id=" + getId() + ", name=" + getName() + ", basic=" + getBasic() + ", Commission=" + comm + "]";
	}
}
