package pack;

public class VariableArgument {
								static void add(int...values)
								{
									int s=0;
									System.out.println("add method is invoked");
									           for(int i:values)
									           {
									        	   s=s+i;
									           }
									           System.out.println(s);
								}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		add(1);
		add(2,3);
	}

}
