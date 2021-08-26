Q7: Prepare bill with the given format using calculate method from interface. 
  
Order No. 
Date :

Product Id      Name        Quantity        unit price                 Total 
 101              A           2                 25                      50
 102              B           1                 100                     100 
  
                                                            Net. Amount 150

import java.util.Scanner;
interface calculate{
                    public int calculate(int NetAmount);
}
class bill implements calculate{
                                int ProductId,Quality,UnitPrice,Total;
                                String Name;
                                bill(Scanner sc,int i){              
                                                 System.out.println("\n\nEnter the Product Id:");
                                                 ProductId=sc.nextInt();
                                                 System.out.println("Enter the Name:");
                                                 Name=sc.next();
                                                 System.out.println("Enter the Quality of the product:");
                                                 Quality=sc.nextInt();
                                                 System.out.println("Enter UnitPrice of the Product:");
                                                 UnitPrice=sc.nextInt();
                                                 
                                                }
                               public int calculate(int NetAmount){
                                                
                                                Total=Quality*UnitPrice;
                                                NetAmount=NetAmount+Total;
                                                return NetAmount;
                                                }
                               void display(int OrderNo,int NetAmount,bill[] n){
                                             
                                              System.out.println("\nOrder No:"+ OrderNo);
                                              System.out.println("Product Id\tName\t\tQuality\t\tUnit Price\t\tTotal");
                                              System.out.println("\n____________________________________________________________________________");
                                              for(int i=0;i<n.length;i++){
                                                           System.out.println(n[i].ProductId+"\t\t"+n[i].Name+"\t\t"+n[i].Quality+ "\t\t"+ n[i].UnitPrice+ "\t\t\t"+n[i].Total);
                                                
                                             }
                                             System.out.println("_____________________________________________________________________________");
                                             System.out.println("\t\t\t\t\t\t\t\t Net Amount:"+ NetAmount);
                                             }

}
public class PBill{
                   public static void main(String arg[]){
                                                          Scanner sc=new Scanner(System.in);
                                                          int NetAmount=0,OrderNo,num;
                                                          System.out.println("\n\nEnter the Order No:");
                                                          OrderNo=sc.nextInt();
                                                          System.out.println("Enter the Number of Products:");
                                                          num=sc.nextInt();
                                                          bill[] n=new bill[num];
                                                          for(int i=0;i<num;i++){
                                                                             n[i]=new bill(sc ,i);
                                                                             NetAmount = n[i].calculate(NetAmount);
                                                         }
                                                         n[0].display(OrderNo,NetAmount,n);
                                                    }
}

OUTPUT

D:\JAVA PROGRAMS>javac PBill.java

D:\JAVA PROGRAMS>java PBill


Enter the Order No:
100
Enter the Number of Products:
2


Enter the Product Id:
01
Enter the Name:
pen
Enter the Quality of the product:
5
Enter UnitPrice of the Product:
10


Enter the Product Id:
02
Enter the Name:
pencil
Enter the Quality of the product:
3
Enter UnitPrice of the Product:
5

Order No:100
Product Id      Name            Quality         Unit Price              Total

____________________________________________________________________________
1               pen             5               10                      50
2               pencil          3               5                       15
_____________________________________________________________________________
                                                                 Net Amount:65














