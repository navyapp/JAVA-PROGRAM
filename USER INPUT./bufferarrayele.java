import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class bufferarrayele
{
public static void main(String[]args)throws IOException
{
int i,n;
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no of elements of an array");
n=Integer.parseInt(read.readLine());
int a[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(read.readLine());
}
System.out.println("array elements");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}