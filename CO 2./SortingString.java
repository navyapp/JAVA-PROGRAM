
Q1:Program to Sort strings 

import java.util.Arrays;
import java.util.Scanner;
public class SortingString
 {
   public static void main(String args[]) 
 {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a string value:");

      String s = sc.nextLine();

      char charArray[] = s.toCharArray();

      Arrays.sort(charArray);

      System.out.println("sorted string is:\n"+new String(charArray));
   }
}

OUTPUT


D:\JAVA PROGRAMS>javac SortingString.java

D:\JAVA PROGRAMS>java SortingString
Enter a string value:
PYTHON
sorted string is:
HNOPTY
