package pack;

import java.nio.channels.ShutdownChannelGroupException;

abstract class Automobile1{
	 abstract String show();
}
 interface fly1
 {
	abstract int  fly(int a);
 }
class Aeroplane extends Automobile implements fly1{
	int flightNo;
String show()
{
	return "aeroplane";
}
	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
interface runnable{
	abstract int run(int speed);
	}
class Train extends Automobile implements runnable{
int trainnumber;
	String show()
	{
		return "train";
	}
	@Override
	public int run(int speed) {
		// TODO Auto-generated method stub
		return speed;
	}
}
interface swimable
{
	 abstract String swim();
	
}
class ship extends Automobile implements swimable{

	String show()
	{
		return "swim";
	}
	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "can swim";
	}
}

public class exapmle {
	public static void main(String args[]){
	ship s=new ship();
	System.out.println(s.show());
	System.out.println(s.swim());
	Aeroplane a= new Aeroplane();
	System.out.println(a.show());
	System.out.println(a.fly(40));
	Train t=new Train();
	//System.out.println(t.trainnumber);
	System.out.println(t.show());
	System.out.println(t.run(100));
		}
}


