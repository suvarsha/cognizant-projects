package b;

public class stringexample {
String s1="welcome";
String s2="to india";
char[] ch={'s','u','v','a','r','s','h','a'};
void concatString()
{
	System.out.println(s1+s2);
}
void charAt1(int index)
{
	System.out.print(s1.charAt(index));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stringexample s=new stringexample();
s.concatString();
s.charAt1(3);
	}

}
