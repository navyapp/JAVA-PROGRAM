Q2:Create a class ‘Employee’ with data members Empid, Name, Salary, Address and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own data members department, Subjects taught 
and constructors to initialize these data members and also include display function to 
display all the data members. Use array of objects to display details of N teachers. 

import java.util.*;

class Employee{
    String Empid,Name,Address;
    Double Salary;
    Employee(String Empid,String Name,String Address,Double Salary){
        this.Empid = Empid;
        this.Name = Name;
        this.Address = Address;
        this.Salary = Salary;
    }
}

class Teacher extends Employee{
    String Department;
    String[] Subjects;
    Teacher(String Department, String[] Subjects,String Empid,String Name,String Address,Double Salary){
        super(Empid,Name,Address,Salary);
        this.Department = Department;
        this.Subjects = Subjects;
    }
    void display(){
        System.out.println("\n\tEmployee id : "+ Empid);
        System.out.println("\n\tEmployee Name : "+ Name);
        System.out.println("\n\tEmployee Address : "+ Address);
        System.out.println("\n\tEmployee Salary : "+ Salary);
        System.out.println("\n\tDepartment : "+ Department);
        System.out.print("\n\tSubjects Tought : "+ Subjects[0]);
        for (int i=1;i<Subjects.length;i++){
            System.out.print(", "+Subjects[i]);
        }
        System.out.println("\n\t________\n");
    }
}

public class TeacherDetails {
    static Teacher[] insertDetails(Scanner read){
        int limit,num;
        String[] sub;
        String Eid,name, Add,Dept;
        Double salary;
        System.out.print("Enter the no of Teachers :");
        limit=read.nextInt();
        read.nextLine();
        Teacher[] t = new Teacher[limit];
        for(int i=0; i<limit; i++){
            System.out.print("\nEnter the Employee Id : ");
            Eid = read.nextLine();
            System.out.print("Enter the Employee Name : ");
            name = read.nextLine();
            System.out.print("Enter the Employee Address : ");
            Add = read.nextLine();
            System.out.print("Enter the Salary : ");
            salary = read.nextDouble();
            read.nextLine();
            System.out.print("Enter the Department : ");
            Dept = read.nextLine();
            System.out.print("Enter the Number of Subjects tought by the teacher : ");
            num = read.nextInt();
            read.nextLine();
            sub= new String[num];
            System.out.print("Enter the Subjects tought by the teacher : ");
            for(int j=0;j<num;j++){
                sub[j] = read.nextLine();
            }
            t[i] = new Teacher(Dept,sub,Eid,name,Add,salary);
        }
        return t;
    }
    static void displayDetails(Teacher[] t){
        for(int i=0;i<t.length;i++){
            System.out.println("\n\tDetails of a Teacher");
            System.out.println("\n\t________\n");
            t[i].display();
        }
    }
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        Teacher[] t = insertDetails(read);
        displayDetails(t);
    }
}

OUTPUT

D:\JAVA PROGRAMS>javac TeacherDetails.java

D:\JAVA PROGRAMS>java TeacherDetails
Enter the no of Teachers :2

Enter the Employee Id : 12
Enter the Employee Name : ANU
Enter the Employee Address : KANNUR
Enter the Salary : 20000
Enter the Department : MCA
Enter the Number of Subjects tought by the teacher : 2
Enter the Subjects tought by the teacher : C C++


Enter the Employee Id : 13
Enter the Employee Name : MANU
Enter the Employee Address : KANNUR
Enter the Salary : 30000
Enter the Department : MCA
Enter the Number of Subjects tought by the teacher : 2
Enter the Subjects tought by the teacher : JAVA PYTHON


        Details of a Teacher

        ________


        Employee id : 12

        Employee Name : ANU

        Employee Address : KANNUR

        Employee Salary : 20000.0

        Department : MCA

        Subjects Tought : C C++,
        ________


        Details of a Teacher

        ________


        Employee id : 13

        Employee Name : MANU

        Employee Address : KANNUR

        Employee Salary : 30000.0

        Department : MCA

        Subjects Tought : JAVA PYTHON,
        ________


