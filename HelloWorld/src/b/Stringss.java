package b;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="suvarsha";
String s1="santhosh sir";
char[] a={'s','u','v','a','r'};
char[] b={'s','u','v','a','r'};
int l=a.length;
int k=b.length;
System.out.println(l);
 int c=0;
if(l==k){
for(int i=0;i<l;i++)
{
	if(a[i]==b[i])
	{
		c++;
	}
}
System.out.println(c);
if(c==l){
System.out.println("yes");
}
else{
	System.out.println("no");
}
}
if(s==s1)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}

	}

}
