class student
{
int sid;
String sname;
String sbranch;
double fees;
void setter(int id, String name,String branch,double fee)
{
sid=id;
sname=name;
sbranch=branch;
fees=fee;
}
void getter(int id, String name, String branch, double fee)
{
System.out.println("id"+sid,"name"+sname,"branch"+sbranch,"fee"+fees);
}
public static void main(String[] args)
{
student s=new student();
s.setter(1,"suvarsha","cse",600000);
s.getter();
}
}
