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