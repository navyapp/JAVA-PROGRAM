import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class bufferarrayrev
{
public static void main(String[]args)throws IOException
{
int i,n,j=0;
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the no of elements of an array");
n=Integer.parseInt(read.readLine());
int a[]=new int[n];
int rev[]=new int[n];
System.out.println("enter the elements of an array");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(read.readLine());
}

for(i=n-1;i>=0;i--)
{
rev[j]=a[i];
j++;
}
System.out.println(" reverse array elements are");
for(i=0;i<n;i++)
{
System.out.println(rev[i]);
}
}
}