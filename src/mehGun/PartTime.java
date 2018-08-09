package mehGun;

public class PartTime extends Employee {
	
	int hours;
	int hourlyRate;
	

	public PartTime(String name, int id, int hours, int hourlyRate) {
		super(name, id);
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}


	@Override
	int getPaid() {
		System.out.println("Receives Parttime Wage");		
		return hours * hourlyRate;      //weekly payment
	}


	void annualWage () {
		System.out.println("Annual Wage  : " + getPaid() * 52);
	}


	@Override
	public String toString() {
		return "PartTime [hours=" + hours + ", hourlyRate=" + hourlyRate + ", name=" + name + ", id=" + id + "]";
	}

}
