import java.util.Scanner;

interface Shape{
                public void area();
                public void perimeter();
               }
class Circle implements Shape{
                              double radius;
                              Circle(Scanner sc){
                                                System.out.println("Enter the radius of the circle");
                                                radius=sc.nextDouble();
                                                }
                              public void area(){
                                                        System.out.println("Area of the circle:" +(radius*radius*3.14));
                                                 }
                              public void perimeter(){
                                                         System.out.println("Perimeter of the circle:"+(2*3.14*radius));
                                                 }
}
class Rectangle implements Shape{
                                 double length,width;
                                 Rectangle(Scanner sc){
                                                      System.out.println("Enter the length of the Rectangle");
                                                      length=sc.nextDouble();
                                                      System.out.println("enter the width of the Rectangle");
                                                      width=sc.nextDouble();
                                                  }
                                 public void area(){
                                                             System.out.println("Area of the Rectangle:"+(length*width));
                                                  }
                                 public void perimeter(){
                                                             System.out.println("Perimeter of the Rectangle:"+(2*(length*width)));
                                                  }
}
public class RecCircle{
                       public static void main(String args[]){
                                                              int i=1,d;
                                                              Scanner sc=new Scanner(System.in);
                                                              Rectangle r=new Rectangle(sc);
                                                              Circle c=new Circle(sc);
                                                              while(i!=0){
                                                                       System.out.println("\nENTER YOUR CHOICE ");
                                                                       d=sc.nextInt();
                                                                       System.out.println("\n___________________MENU__________________________\n");
                                                                       System.out.println("\n\t1.Area of Circle\n\t2.Perimeter of Circle\n\t3.Area of Rectangle\n\t4.Perimeter of Rectangle\n\t5.exit");
                                                                       System.out.println("\n__________________________________________________\n");
                                                                       switch(d){
                                                                                 case 1:c.area();
                                                                                        break;
                                                                                 case 2:c.perimeter();
                                                                                        break;

                                                                                 case 3:r.area();
                                                                                        break;
                                                                                 case 4:r.perimeter();
                                                                                        break;
                                                                                 case 5:i=0;
                                                                                        break;
                                                                                 default:System.out.println("\nEnter the valid choice");
                                                                                 }
                                                                          }
}
}




                                                                                    









 
































































































































