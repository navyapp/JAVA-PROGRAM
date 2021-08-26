package Graphics; 
interface Area{
                   public double Rectangle(double length,double width);
                   public double Triangle(double length,double width);
                   public double Square(double side);
                   public double Circle(double radius); 
               
public class Figure implements Area{
                               public double Rectangle(double length,double width){
                                                                              return (length*width);
                                                                               }

                               public double Triangle(double length,double width){
                                                                               return(0.5*length*width);
                                                                              }
                                
                               public double Square(double side){
                                                               return(side*side);
                                                              }
 
                                public double Circle( double radius){
                                                            return(3.14*radius*radius);
                                                           }

                                  }

    
}
    