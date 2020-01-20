package ass;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int k=s.nextInt();
		if((k%4==0)||(k%400==0))
		{
			System.out.println("leap year");
		}
		else
		{
		System.out.println("not a leap yeaar");
	}
		}
	}


