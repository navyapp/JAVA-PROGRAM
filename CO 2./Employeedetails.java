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