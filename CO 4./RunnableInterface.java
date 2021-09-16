Q 6:Define 2 classes; one for generating Fibonacci numbers and other for displaying even 
numbers in a given range. Implement using threads. (Runnable Interface) 

import java.util.*;

class FibonacciNums implements Runnable {
    int limit;

    FibonacciNums(Scanner read) {
        System.out.print("\nEnter the limit for Fibonacci numbers: ");
        limit = read.nextInt();
    }

    synchronized public void display(){
        System.out.println("\nFibonacci numbers : ");
        for (int i = 1, j = 1, count = 1; count <= limit; count++) {
            System.out.println(i);
            j = i + j;
            i = j - i;
            j = (j - i) + i;
        }
    }
    

    @Override
    public void run() {
        display();
    }
}

class evenNums implements Runnable {
    int limit;

    evenNums(Scanner read) {
        System.out.print("\nEnter the limit for  even numbers: ");
        limit = read.nextInt();
    }

    synchronized public void display(){
        System.out.println("\nThe Even numbers upto " + limit + " is : ");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void run() {
        display();
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        evenNums eObj = new evenNums(read);
        FibonacciNums fObj = new FibonacciNums(read);
        Thread t1 = new Thread(eObj);
        Thread t2 = new Thread(fObj);
        t1.start();
        t2.start();
    }
}

OUTPUT

C:\Users\Admin\Desktop>javac RunnableInterface.java

C:\Users\Admin\Desktop>java RunnableInterface

Enter the limit for  even numbers: 10

Enter the limit for Fibonacci numbers: 6

Fibonacci numbers :
1
1
2
3
5
8

The Even numbers upto 10 is :
2
4
6
8
10
