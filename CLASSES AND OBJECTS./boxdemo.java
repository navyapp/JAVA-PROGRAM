class box
{
double width;
double height;
double depth;
}
class boxdemo
{
public static void main(String args[])
{
box mybox=new box();
double vol;

mybox.width=20;
mybox.height=30;
mybox.depth=40;

vol=mybox.width*mybox.height*mybox.depth;
System.out.println("volume =" +vol);

}
}