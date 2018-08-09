package mehGun;

public abstract class Employee {

		String name;
		int id;
		public Employee(String name, int id) {
			super();
			this.name = name;
			this.id = id;
			
		}
		
		abstract int getPaid();
		
		final void employeePolicy() {
			System.out.println("Employee Policy Documents Received");
		}
		
		static void employeeHandbook() {
			System.out.println("Employee Handbook Received");
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + "]";
		}
		
		

}
