

public abstract class CEmployee {
	
    protected String name;
    protected String empID;
    
	public CEmployee(String name, String empID) {
		this.name = name;
		this.empID = empID;
	}
	
	public void print () {
		System.out.println(this.name);
		System.out.println(this.empID);
	}
	
	public abstract int getSalary ();
	
}


 class Programers extends CEmployee {
	
	protected int salary;

	public Programers(String name, String empID, int salary) {
		super(name, empID);
		this.salary = salary;
		
	}
	
	@Override
	public int getSalary() {
		return(this.salary);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}

}

 
 class Consultants extends CEmployee {
	 
	 protected int hours;
	 protected int rate;
	 
	 public Consultants(String name, String empID, int hours, int rate) {
		super(name, empID);
		this.hours = hours;
		this.rate = rate;
	 }
	 
	 @Override
	 public int getSalary() {
		 return(this.hours*this.rate);
	 }
	 
	 @Override 
	 public void print() {
		 super.print();
		 System.out.println(this.hours);
		 System.out.println(this.rate);
	 }
	 
 }
 
 class Admin extends CEmployee {
		
		protected int salary;
		protected int nightallow;

		public Admin(String name, String empID, int salary,int nightall) {
			super(name, empID);
			this.salary = salary;
			this.nightallow  = nightall;
			
		}
		
		@Override
		public int getSalary() {
			return(this.salary + this.nightallow);
		}
		
		@Override
		public void print() {
			super.print();
			System.out.println(this.salary);
			System.out.println(this.nightallow);
		}

}
