import java.util.*;
class mult{
public static void main(String args[])
{
int c[][]={{0,0,0},{0,0,0},{0,0,0}};
int i,j,k;
Scanner s=new Scanner(System.in);
System.out.println("enter number of rouws and coulms");
int r1=s.nextInt();
int c1=s.nextInt();
System.out.println("enter number of rouws and coulms");
int r2=s.nextInt();
int c2=s.nextInt();
int arr[][]=new int[r1][c1];
int arr1[][]=new int[r2][c2];
if(c1==r2)
{
System.out.println("enter the numbers in matrix1");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
arr[i][j]=s.nextInt();
}
}
System.out.println("enter the numbers in matrix2");
for(i=0;i<r2;i++)
{
   for(j=0;j<c2;j++)
    {
     arr1[i][j]=s.nextInt();
     }
}
for(i=0;i<r1;i++)
  {
for(j=0;j<c2;j++)
     {
    c[i][j]=0;
     for(k=0;k<r2;k++)
       {
       c[i][j]=c[i][j]+(arr[i][k]*arr1[k][j]);
         }
     System.out.print(c[i][j]+" ");
       }
System.out.println();
   }
}
else
   {
   System.out.println("break");
    }
}
}