import java.util.Scanner;
class arrayeven
{
public static void main(String[]args)
{
int i,n,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements of an array");
n=sc.nextInt();
int a[]=new int[n];
int rev[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(" array elements in even position");
for(i=1;i<n;i=i+2)
{
System.out.println(a[i]);
}
}
}