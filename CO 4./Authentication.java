import java.util.Scanner;

class UserException extends Exception {
  
  public String toString()
  {
    
    return "*UserName and Password not matching\n";
  
  }

}
class User
{
 
  String username,password;
  User(String user,String pass)throws UserException
  {

    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter the username: \n");
    username=sc.nextLine();
    System.out.println("\nEnter the password: \n");
    password=sc.nextLine();
    if((username.compareTo(user) != 0) || (password.compareTo(pass) != 0))

    {
     
     throw new UserException();
 
    }

   }

}


public class Authentication

{
  
  public static void main(String args[])
 
  {
  
    try
   
     {
       
        User u = new User("Navya","navya99");
        System.out.println("\nSuccessfully Completed\n");
        
     }
     
     catch(UserException e)

        {
         
          System.out.println("\n\nException :" + e);

        }
    
    }

}

          
          