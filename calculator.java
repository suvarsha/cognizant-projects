import java.util.*;
class calculator
{
int add(int a,int b)
	{
int sum=a+b;
return sum;
	}
int sub(int a,int b )
{
int su=a-b;
return su;
}
int multiplication(int a,int b);
{
int mul=a*b;
return mul;
}
int division(int a,int b);
{
int div=a/b;
return div;
}
public static void main(String args[])
{
calculator c= new calculator();
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
int k=s.nextInt();
int r=s.nextInt();
Scanner v=new Scanner(System.in);
System.out.println("enter the opperator");
String i=v.nextLine();
switch(i)
{
case "+":System.out.println(c.add(k,r));
        break;
case "-":System.out.println(c.sub(k,r));
         break;
case "*":System.out.println(c.multiplication(k,r));
       break;
case "/":System.out.println(c.division(k,r));
        break;
default: System.out.println("invalid");
     break;
}
}
}
