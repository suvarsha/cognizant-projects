class A{
 int count=0;
A()
{
count++;
}
public static void main(String args[])
{
A a1=new A();
A a2=new A();
System.out.println(a1.count);
System.out.println(a2.count);
}
}