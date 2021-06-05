class box1
{
double width;
double height;
double depth;
}
class boxdemo1
{
public static void main(String args[])
{
box mybox1=new box();
box mybox2=new box();
double vol;

mybox1.width=20;
mybox1.height=30;
mybox1.depth=40;


mybox2.width=10;
mybox2.height=20;
mybox2.depth=30;


vol=mybox1.width*mybox1.height*mybox1.depth;
System.out.println("volume =" +vol);

vol=mybox2.width*mybox2.height*mybox2.depth;
System.out.println("volume =" +vol);
}
}