class fact
{
int i,f=1;
int fact(int n)
{
f=f*fact(n-1);
System.out.println(f);
}
public static void main(String args[])
{
fact f= new fact();
f.fact(5);
}
}

