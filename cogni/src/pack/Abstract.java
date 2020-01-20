package pack;
abstract class Abstract1{
	abstract void add(int a,int b);
		void show()
		{
			System.out.println("this is a non abstract method");
		}
	}
class A1 extends Abstract1
{

	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Abstract1 a=new Abstract1();
		A1 a=new  A1();
a.add(4, 5);
	}

}
