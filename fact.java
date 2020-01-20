class fact
{
int f=1;
void factorial(int n)
{
int i;
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
public static void main(String args[])
{
fact f1=new fact();
f1.factorial(5);
}
}