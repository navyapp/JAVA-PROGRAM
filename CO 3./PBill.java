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
















