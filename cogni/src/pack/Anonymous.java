package pack;

interface Eatable
{
	void  eat();
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eatable e=new Eatable() {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("i ate");	
	}
};
e.eat();
	}

}
