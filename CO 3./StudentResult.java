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
