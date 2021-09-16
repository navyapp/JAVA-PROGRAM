Q 4:Find the average of N positive integers, raising a user defined exception for each negative 
input.

import java.util.Scanner;

class NegativeException extends Exception {
  
  public String toString()
  {
    
    return "\nEnter the non negative numbers\n";
  
  }

}
class NegativeNumber
{
 
  float total;
  int num,n;

  NegativeNumber(Scanner sc,int limit)
  {

    
    System.out.println("\nEnter the Numbers: \n");
    
    for(int i=0;i<limit;i++)
    {
     try
        {
         n=sc.nextInt();
         if(n<0)
         {
     
         throw new NegativeException();
 
        }
       
       total=total+n;
       num=num+1;
    }
     
     catch(NegativeException e)

        {
         
          System.out.println("\n\nException :" + e);

        }
    
    }

}


void Avarage()
{
  
    System.out.println("\nAvarage of positive numbers is :" + (total/num)) ;

}

}
public class PositiveNumbers
{

    public static void main(String args[])

     {
      
       int limit;
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter the Limit : \n");        
       limit=sc.nextInt();
       NegativeNumber obj1=new NegativeNumber(sc,limit);  
       obj1.Avarage(); 

     }

}


OUTPUT

D:\JAVA PROGRAMS>javac PositiveNumbers.java

D:\JAVA PROGRAMS>java PositiveNumbers

Enter the Limit :

3

Enter the Numbers:

10
20
30

Avarage of positive numbers is :20.0

D:\JAVA PROGRAMS>java PositiveNumbers

Enter the Limit :

3

Enter the Numbers:

10
-20


Exception :
Enter the non negative numbers

30

Avarage of positive numbers is :20.0
