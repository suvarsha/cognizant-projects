package pack;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WagesEmployee w = new WagesEmployee(new Address(503164,"rampur",5118),42, "suvarsha", 6000000, "chennai", 5, 4);
		System.out.println(w.calemp());
		System.out.println(w);

	}

}
