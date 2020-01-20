import java.util.*;
class calculator
{
void add(int a,int b)
	{
int sum=a+b;
System.out.println(sum);
	}
void sub(int a,int b )
{
int su=a-b;
System.out.println(su);
}
void mult(int a, int b);
{
int mul=a*b;
System.out.println(mul);
}
void divi(int a, int b);
{
int div=a/b;
System.out.println(div);
}
public static void main(String args[])
{
calculator c= new calculator();
Scanner s=new Scanner(System.in);
System.out.println("enter three numbers");
int k=s.nextInt();
int r=s.nextInt();
System.out.println("enter your choice");
int i=s.nextInt();
switch(i)
{
case 1:c.add(k,r);
        break;
case 2:c.sub(k,r);
         break;
case 3:c.mult(k,r);
       break;
case 4:c.divi(k,r);
        break;

default: System.out.println("invalid");
     break;
}
}
}
