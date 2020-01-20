import java.util.*;
class fact
{
int i;
 int f;
int fact1(int n)
{
f=n*fact1(n-1);
return f;
}
public static void main(String args[])
{
fact f= new fact();
f.fact1(5);
System.out.println(f);
}
}

