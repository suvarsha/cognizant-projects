class student
{
int sid;
String sname;
String sbranch;
double fees;
void set(int id,String name,String branch,double fee)
{
sid=id;
sname=name;
sbranch=branch;
fees=fee;
}
void get()
{
System.out.println("id"+sid+"name"+sname+"branch"+sbranch+"fee"+fees);
}
public static void main(String[] args)
{
student s=new student();
s.set(1,"suvarsha","cse",600000);
s.get();
}
}
