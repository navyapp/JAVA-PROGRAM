class box3
{
double width;
double height;
double depth;
void volume()
{
System.out.print("Volume is ");
System.out.println(width * height * depth);
}
}
class boxdemo2
{
public static void main(String args[])
{
box mybox1=new box();
box mybox2=new box();

mybox1.width=20;
mybox1.height=30;
mybox1.depth=40;


mybox2.width=10;
mybox2.height=20;
mybox2.depth=30;


mybox1.volume();
mybox2.volume();
}
}