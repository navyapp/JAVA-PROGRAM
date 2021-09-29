Q1: Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of 
the class and find the product having the lowest price.

class product
{
String pcode;
String pname;
double price;

String lowerprice(product p1,product p2)
{
if( p1.price< p2.price)
return p1.pname;
if( p1.price< price)
return  p1.pname;
if( p2.price< p1.price)
return p2.pname;
if( p2.price<price)
return  p2.pname;
else
return pname;
}
void setDim(String pc,String s,double p)
{
pcode=pc;
pname=s;
price=p;
}
}
class productprz
{
public static void main(String args[])
{
product p1=new product();
product  p2=new product();
product  p3=new product();
String sname;

p1.setDim("01","television",20000);
p2.setDim("02","fridge",3000);
p3.setDim("03","AC",4000);

sname= p3.lowerprice(p1,p2);
System.out.println("lowest price is " + sname);

}
}
  
OUTPUT
D:\JAVA PROGRAMS>javac productprz.java

D:\JAVA PROGRAMS>java productprz
lowest price is fridge
