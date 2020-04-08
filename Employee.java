public class Employee extends Person{
	private double annualSal;
	private int year;
	private	String nationalIno;
	

	public Employee(String name,double annualSal,int year,String nationalIno){
		
		super(name);
		
		this.annualSal=annualSal;
		this.year=year;
		this.nationalIno=nationalIno;

	}

	public String getName(){
		return name;
	}

	public double getAnnualSal(){
		return annualSal;
	}

	public int getYear(){
		return year;
	}

	public String getNationalIno(){
		return nationalIno;
	}

		
	public String emplDetails() {
		return "\nName: " +name+"\nannualSalary: " + annualSal + "\nyearOfJoining: " + year + "\nnationalInsuranceNo: "+ nationalIno;
	}

}