package pack;

class AirAutomobile implements fly {
	String modelNo;

	void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	String show() {
		return modelNo;
	}

	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}

interface fly {
	int speed = 200;

	int fly(int a);
}

public  class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomobile a = new AirAutomobile();
		a.setModelNo("airbus");
		System.out.println("airplane name is" +a.show());
		System.out.println(a.fly(90));
		System.out.println("max speed of airplane is" + fly.speed);
	}

}
