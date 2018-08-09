package mehGun;

public class FullTime extends Employee {

	int salary;
	
	public FullTime(String name, int id, int salary) {
		super(name, id);
		this.salary = salary;
	}

	@Override
	int getPaid() {
		System.out.println("Receives Full Time Salary");
		return salary;
	}

	void annualSalary() {
		System.out.println("Annual Salary : " + getPaid() * 12);
	}

	@Override
	public String toString() {
		return "FullTime [salary=" + salary + ", name=" + name + ", id=" + id + "]";
	}

	
	
	
	
}
