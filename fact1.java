import java.util.*;
class fact1
{
 int f;
int fact2(int n)
{
if(n==0||n==1)
return 1;
else
{
 f=(n*fact2(n-1));
return f;
}

}
public static void main(String args[])
{
fact1 f1= new fact1();
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int k=s.nextInt();
System.out.println(f1.fact2(k));
}
}

