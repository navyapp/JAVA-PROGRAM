Q4:Program to create a class for Employee having attributes eNo, eName eSalary. Read n 
employ information and Search for an employee given eNo, using the concept of Array of 
Objects.

import java.util.Scanner;

class Employee{
    int eno;
    String ename;
    Double esalary;

    Employee(int no, String name, Double salary){
        eno = no;
        ename = name;
        esalary = salary;
    }
}

public class Employeedetails{

    public static Employee[] InsertEmployeedetails(Scanner read)
    {
        int limit, num;
        String name;
        Double salary;
        System.out.print("Enter the number of Employee : ");
        limit = read.nextInt();
        Employee[] emp = new Employee[limit];
        for (int i=0; i<limit; i++){
            System.out.print("\nEnter the Employee Number : ");
            num = read.nextInt();
            read.nextLine();
            System.out.print("Enter the Employee Name : ");
            name = read.nextLine();
            System.out.print("Enter the Salary : ");
            salary = read.nextDouble();
            emp[i] = new Employee(num,name,salary);
        }
        return emp;
    }

    public static void Search(Employee[] emp,Scanner read)
    {
        System.out.print("\nEnter the Employee Number to be Searched: ");
        int eNum = read.nextInt();
        for (int i=0 ; i < emp.length; i++){
            if (emp[i].eno == eNum){
                System.out.println("\tDetails of given Employee:");
                System.out.println("\tEmployee Name: "+ emp[i].ename);
                System.out.println("\tEmployee salary: "+ emp[i].esalary);
                return;
            }
        }
        System.out.println("No Employee with Given Employee number found!!!");
    }

    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        Employee[] emp = InsertEmployeedetails(read);
        Search(emp, read);
    }
}

OUTPUT

D:\JAVA PROGRAMS>javac Employeedetails.java

D:\JAVA PROGRAMS>java Employeedetails
Enter the number of Employee : 2

Enter the Employee Number : 1
Enter the Employee Name : ANAND
Enter the Salary : 12000

Enter the Employee Number : 3
Enter the Employee Name : SHANKAR
Enter the Salary : 30000

Enter the Employee Number to be Searched: 1
        Details of given Employee:
        Employee Name: ANAND
        Employee salary: 12000.0
