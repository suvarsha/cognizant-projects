class Employee
{
	//data members
 	public int empid;
	public String empname;
	public int empsalary;
	/*Employee()
	{
		empid=1;
		empname="0";
		empsalary=1;
	Employee(int empid,String empname,int empsalary)
	{
	this.empid=empid;
	this.empname=empname;
	this.empsalary=empsalary;
	}
	
*/
void setEmployee(int empid,String empname,int empsalary)
	{
	this.empid=empid;
       this.empname=empname;
	this.empsalary=empsalary;
	}
void getEmployee()
	{
	System.out.println(""+empid+""+empname+""+empsalary);
	}
int calculator()
{
return empsalary+100000;
}
}