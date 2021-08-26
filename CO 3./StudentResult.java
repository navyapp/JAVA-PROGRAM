Q5:Create classes Student and Sports. Create another class Result inherited from Student and 
Sports. Display the academic and sports score of a student. 


import java.util.Scanner;
interface student{
              public void StudentDetails(Scanner sc);
              public void AcademicScore(Scanner sc);
}
interface sports{ 
              public void SportsScore(Scanner sc);
}

class result implements student,sports{
                                      int stdrollno;
                                      String name;
                                      int Amark,Smark,totmark;
                                      result(Scanner sc){
                                             StudentDetails(sc);
                                             AcademicScore(sc);
                                             SportsScore(sc);
                                      }        
                                      public void StudentDetails(Scanner sc){
                                                       
                                                       System.out.println("enter the roll number of the student");
                                                       stdrollno=sc.nextInt();
                                                       System.out.println("enter the name of the student");
                                                       name=sc.next();
                                      }
                                      public void AcademicScore(Scanner sc){
                                                       
                                                       System.out.println("enter the total mark");
                                                       totmark=sc.nextInt();
                                                       System.out.println("enter the student obtained mark");
                                                       Amark=sc.nextInt();
                                     } 
                                     public void SportsScore(Scanner sc){
                                                       
                                                       System.out.println("enter the sports mark");
                                                       Smark=sc.nextInt();
                                     }
                                      void display(){
                                             System.out.println("________________________________________");
                                             System.out.println("Roll number of the student:"+stdrollno);
                                             System.out.println("Name of the student:"+name);
                                             System.out.println("total mark ("+totmark+"):"+Amark);
                                             System.out.println("sports mark (500):" +Smark);
                                             System.out.println("________________________________________");
                                           }
}                                     
                                                                                    
public class StudentResult{
               public static void main(String arg[]){
                                                      Scanner sc=new Scanner(System.in);
                                                      result r=new result(sc);
                                                      r.display();
                                                     }
}                                                            

OUTPUT
D:\JAVA PROGRAMS>javac StudentResult.java

D:\JAVA PROGRAMS>java StudentResult
enter the roll number of the student
46
enter the name of the student
NAVYA
enter the total mark
1000
enter the student obtained mark
800
enter the sports mark
300
________________________________________
Roll number of the student:46
Name of the student:NAVYA
total mark (1000):800
sports mark (500):300
________________________________________
