Q 3:Write a user defined exception class to authenticate the user name and password. 

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

 OUTPUT
 
 D:\JAVA PROGRAMS>javac Authentication.java

D:\JAVA PROGRAMS>java Authentication

Enter the username:

Navya

Enter the password:

navya99

Successfully Completed


D:\JAVA PROGRAMS>java Authentication

Enter the username:

navya

Enter the password:

navyapp


Exception :*UserName and Password not matching

          
