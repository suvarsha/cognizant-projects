package pack;
class A{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A{
	B()
	{
		System.out.println("B()");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b=new B();
	}
}
