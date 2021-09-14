import java.util.*;

class shapes
{
     
             void area(int side){
                                    
                        System.out.println("Area of the Square:"+(side*side))  ;
             }
              
            
             void area(float length,float width){
                                    
                        System.out.println("Area of the Rectangle:"+(length*width))  ;
             }
             
             void area(double radius){
                                    
                        System.out.println("Area of the circle:" +(3.14*radius))  ;
             }            

             
}  

public class Overloadingfunctions
{
           public static void main(String[] args)
           {
        
              Scanner sc=new Scanner(System.in);
              int sq;
              float l, w;
              double c;
              shapes s=new shapes();

              System.out.println("Enter the length of the Square is :");
              sq=sc.nextInt();
              s.area(sq);

              System.out.println("Enter the length and width of the Rectangle is :");
              l=sc.nextFloat();
              w=sc.nextFloat();
              s.area(l,w); 

              System.out.println("Enter the radius of the Circle is :");
              c=sc.nextDouble();
              s.area(c); 
          }
}
                 