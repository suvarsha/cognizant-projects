package pack;

public class Employee {
	Address a;
	public Employee(Address a, int empid, String empname, int salary, String emplocation) {
		super();
		this.a = a;
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.emplocation = emplocation;
	}

	int empid;
	String empname;
	int salary;
	String emplocation;
	@Override
	public String toString() {
		return "Employee [a=" + a + ", empid=" + empid + ", empname=" + empname + ", salary=" + salary
				+ ", emplocation=" + emplocation + "]";
	}

	

	
	public String getEmplocation() {
		return emplocation;
	}

	public void setEmplocation(String emplocation) {
		this.emplocation = emplocation;
	}

	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * int grossSalary() { return 12*salary; }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub //Employee e =new Employee(10, "suvarsha", 6000000,"chennai");
	 * Employee e=new Employee(12, "suvarsha", 6000000, "chennai");
	 * System.out.println(e.getSalary()+"  "+e.getEmpname()+" "+e.getEmpid()+" "
	 * +e.getEmplocation()); System.out.println(e.grossSalary());
	 * //System.out.println(e);
	 * 
	 * }
	 */

}