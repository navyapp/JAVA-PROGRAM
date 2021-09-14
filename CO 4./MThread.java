Q 5:Define 2 classes; one for generating multiplication table of 5 and other for displaying first 
N prime numbers. Implement using threads. (Thread class)

import java.util.*;
class Mtable extends Thread
{
     public void run()
     {
       System.out.println("Multiplication table of 5 is :");
       try{
       for(int i= 1;i<=10;i++)
       {   
        System.out.println(i + "*5=" + (i*5));
        
       }
       } 
     catch(Exception e)
     {
      System.out.println(e);
     }
   }

}




class prime extends Thread
{
  int limit;
  prime(Scanner sc)
  {
   System.out.println("Enter the limit of a prime numbers:") ;
   limit=sc.nextInt();
  }
  public void run()
  {
   System.out.println("primenumber upto"  +  limit +  "is:");
   try{
   for( int i=2,n=1;n<=limit;i++)
   {
    int flag=0;
    for(int j=2;j<=Math.sqrt(i);j++)
    {
     if(i%j==0)
     {
      flag = 1;
      break;
     }
    }
  
    if(flag==0)
    {
     System.out.println(i);
     n=n+1;
    }
   
 }
}
catch(Exception e)
{
System.out.println(e);
}
}
} 

public class MThread
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  Mtable obj1=new Mtable();
  prime  obj2=new prime(sc);
  obj1.start();
  obj2.start();
 }
}

OUTPUT

D:\JAVA PROGRAMS>javac MThread.java

D:\JAVA PROGRAMS>java MThread
Enter the limit of a prime numbers:
10
Multiplication table of 5 is :
1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50
primenumber upto10is:
2
3
5
7
11
13
17
19
23
29
