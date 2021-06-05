class box
{
double width;
double height;
double depth;


void volume()
{
System.out.print("vol is");
System.out.println(width*height*depth);
}
}

class boxdemo3
{
public static void main(String args[])
{
 box mybox1=new box();
 box mybox2=new box();

mybox1.width=20;
mybox1.height=30;
mybox1.depth=40;

mybox2.width=9;
mybox2.height=10;
mybox2.depth=60;
 

mybox1. volume();
mybox2.volume();
}
}

