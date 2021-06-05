class box
{
double width;
double height;
double depth;


double volume()
{
return width*height*depth;
}
}

class boxdemo4
{
public static void main(String args[])
{
 box mybox1=new box();
 box mybox2=new box();
double vol;

mybox1.width=20;
mybox1.height=30;
mybox1.depth=40;

mybox2.width=9;
mybox2.height=10;
mybox2.depth=60;
 
vol =mybox1.volume();
System.out.println("volume is" + vol);
vol= mybox2.volume();
System.out.println("volume is " +vol);
}
}

