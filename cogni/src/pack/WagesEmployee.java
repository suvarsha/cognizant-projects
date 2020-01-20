package pack;

public class WagesEmployee extends Employee {
	int numbers;
	int hours;
	public WagesEmployee(Address a, int empid, String empname, int salary, String emplocation,int numbers,int hours) {
		super(a, empid, empname, salary, emplocation);
		// TODO Auto-generated constructor stub
		this.numbers=numbers;
		this.hours=hours;
	}
	@Override
	public String toString() {
		return "WagesEmployee [numbers=" + numbers + ", hours=" + hours + ", a=" + a + ", empid=" + empid + ", empname="
				+ empname + ", salary=" + salary + ", emplocation=" + emplocation + "]";
	}
	
	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	int calemp() {
		return numbers * hours * salary;
	}

}
