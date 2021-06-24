import java.util.Scanner;

class Stringmanipulation
   {
    String s1,s2;
    Stringmanipulation(String s1,String s2)
    {
        this.s1=s1;
        this.s2=s2;
    }
    void StringLength()
   {
        System.out.println("Length of "+s1+" is : "+(s1.length()));
        System.out.println("Length of "+s2+" is : "+(s2.length()));
    }
    void StringConcat()
    {
        System.out.println("After String adding "+s1+" and "+ s2+" is : "+s1.concat(s2) );
    }
    void StringCharAt(Scanner read)
    {
        int pos;
        System.out.print("Enter the position of Character you want to access : ");
        pos = read.nextInt();
        System.out.println("Character at position "+pos+" of "+s1+" is : "+s1.charAt(pos-1));
        System.out.println("Character at position "+pos+" of "+s2+" is : "+s2.charAt(pos-1));
    }
    void StringChange()
    {
        System.out.println("Uppercase of string "+s1+" is: "+ s1.toUpperCase());
        System.out.println("Lowercase of string "+s1+" is: "+ s2.toLowerCase());
    }
    void StringCompare()
       {
        if(s1.compareTo(s2) == 0)
       {
            System.out.println("Two Strings are equal");
        }
        else
        {
            System.out.println("Two Strings are not equal!");
        }
    }
}

public class Stringmanipulations
{
    public static void main(String args[])
     { 
        String s1,s2;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter first string : ");
        s1 = read.nextLine();
        System.out.print("Enter Second string : ");
        s2 = read.nextLine();
        Stringmanipulation sm = new Stringmanipulation(s1,s2);
        sm.StringLength();
        sm.StringConcat();
        sm.StringCharAt(read);
        sm.StringChange();
        sm.StringCompare();
    }
}