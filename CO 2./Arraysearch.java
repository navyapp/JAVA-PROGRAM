import java.util.Scanner;
class Arraysearch
{
public static void main(String[]args)
{

int i,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the  no of  elementsin array");
n=sc.nextInt();
int a[]= new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter element you want");
int x=sc.nextInt();
for(i=0;i<n;i++)
{
 if(a[i]==x)
 {
  flag=1;
  break;
 }
 else
 {
  flag=0;
  
  }
}
if(flag==1)
{
 System.out.println("searched element in position:"+(i+1));
}
else
{
 System.out.println("element is not found");
}
}
}
 