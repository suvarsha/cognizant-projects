package pack;
class Addition{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a1=new Addition();
System.out.println(a1.add(4,5));
System.out.println(a1.add(5.5,5.5));
System.out.println(a1.add(4.5,5));
	}

}
