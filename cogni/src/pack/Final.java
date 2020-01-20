package pack;
class A2
{
	static final double pi=3.14;
	void display()
	{
		System.out.println("class A");
	}
}
class B2 extends A2
{
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A2.pi=3.22;//cant assign
		System.out.println(A2.pi);
	}

}
