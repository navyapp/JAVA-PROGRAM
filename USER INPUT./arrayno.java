import java.util.Scanner;
class arrayno
{
public static void main(String[]args)
{
int i,n,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the  no of elements");
n=sc.nextInt();
int[] a=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
count=count+1;
}
System.out.println("no of elements present in array \n"+count);
}
}