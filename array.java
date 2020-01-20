class array{
public static void main(String args[])
{
int []arr={10,5,30,6,9};
int i,t,j,s=0,avg;
for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length;j++)
{
if(arr[i]<=arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
for(i=arr.length-1;i>=0;i--)
{
System.out.println("descending"+arr[i]);
}
System.out.println("min"+arr[0]);
System.out.println("max"+arr[arr.length-1]);
for(i=0;i<arr.length;i++)
{
s=s+arr[i];
}
System.out.println("sum"+s);
avg=(s/(arr.length));
System.out.println("average"+avg);
}
}