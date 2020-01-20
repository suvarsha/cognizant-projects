import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int k=s.nextInt();
		int c=1,r=0;
		while(k>0)
		{
			r=r+k%10;
						k=k/10;	
		}
		System.out.println(r);
		int w=0;
		while(r>=10)
		{
			c++;
			w=w+r%10;
			r=r/10;
			}
		System.out.println(c);
	}

}
