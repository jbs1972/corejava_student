package model;

public class Manager extends Employee {
	@Override
	public float computeSalary() {
		// TODO Auto-generated method stub
		return getBasic()+carAllow;
	}
	private float carAllow;
	public Manager(String name, float basic, float carAllow) {
		super(name, basic);
		this.carAllow = carAllow;
	}
	public Manager(String name, float basic) {
		super(name, basic);
	}
	public float getCarAllow() {
		return carAllow;
	}
	public void setCarAllow(float carAllow) {
		this.carAllow = carAllow;
	}
	@Override
	public String toString() {
		return "Manager [id=" + getId() + ", name=" + getName() + ", basic=" + getBasic() + ", Car Allow.=" + carAllow + "]";
	}
}