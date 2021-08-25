Q3:Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor 
to initialize the data members and another class ‘Employee’ that inherits the properties of 
class Person and also contains its own data members like Empid, Company_name, 
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits 
the properties of class Employee and contains its own data members like Subject, 
Department, Teacherid and also contain constructors and methods to display the data 
members. Use array of objects to display details of N teachers. 

import java.util.*;

class Person{
    String Name,Gender,Address;
    int Age;
    Person(String Name,String Gender, String Address,int Age){
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
    }
}

class Employee extends Person{
    String Empid,CompanyName,Qualification;
    Double Salary;
    Employee(String Empid,String CompanyName, String Qualification,Double salary,String Name,String Gender, String Address,int Age){
        super(Name,Gender,Address,Age);
        this.Empid = Empid;
        this.CompanyName=CompanyName;
        this.Qualification=Qualification;
    }
}

class Teacher extends Employee{

    String Subject,Department,TeacherId;

    Teacher(String Subject, String Department, String TeacherId,String Empid,String CompanyName, String Qualification,Double salary,String Name,String Gender, String Address,int Age){
        super(Empid,CompanyName,Qualification,salary,Name,Gender,Address,Age);
        this.Subject=Subject;
        this.Department=Department;
        this.TeacherId=TeacherId;
    }

    void display(){
        System.out.println("\t\t\tName of Employee : "+ Name);
        System.out.println("\t\t\tGender : "+ Gender);
        System.out.println("\t\t\tAddress : "+ Address);
        System.out.println("\t\t\tAge : "+ Age);
        System.out.println("\t\t\tEmployee id : "+ Empid);
        System.out.println("\t\t\tCompany Name : "+ CompanyName);
        System.out.println("\t\t\tQualification : "+ Qualification);
        System.out.println("\t\t\tEmployee Salary : "+ Salary);
        System.out.println("\t\t\tTeacher Id : "+ TeacherId);
        System.out.println("\t\t\tDepartment : "+ Department);
        System.out.println("\t\t\tSubject Tought : "+ Subject);
        System.out.println("\t\t_____________\n");
    }
}

public class MultiInheritance {
    static Teacher[] insertDetails(Scanner read){
        int limit,age;
        String Eid,name, Add,Dept,sub,cname,gender,ql,Tid;
        Double salary;
        System.out.print("Enter the no of Teachers :");
        limit=read.nextInt();
        read.nextLine();
        Teacher[] t = new Teacher[limit];
        for(int i=0; i<limit; i++){
            System.out.print("\n\n___________\n\nEnter the Details of Teacher "+(i+1)+"\n___________\n\n");
            System.out.print("Enter the Name : ");
            name = read.nextLine();
            System.out.print("\nEnter the Gender : ");
            gender = read.nextLine();
            System.out.print("\nEnter the Address : ");
            Add = read.nextLine();
            System.out.print("\nEnter the Age : ");
            age = read.nextInt();
            read.nextLine();
            System.out.print("\nEnter the Employee Id : ");
            Eid = read.nextLine();
            System.out.print("\nEnter the Company Name : ");
            cname = read.nextLine();
            System.out.print("\nEnter the Qualification : ");
            ql = read.nextLine();
            System.out.print("\nEnter the Salary : ");
            salary = read.nextDouble();
            read.nextLine();
            System.out.print("\nEnter the Department : ");
            Dept = read.nextLine();
            System.out.print("\nEnter the Subject tought by the teacher : ");
            sub = read.nextLine();
            System.out.print("\nEnter the Teacher Id : ");
            Tid = read.nextLine();
            t[i] = new Teacher(sub,Dept,Tid,Eid,cname,ql,salary,name,gender,Add,age);
        }
        return t;
    }
    static void displayDetails(Teacher[] t){
        for(int i=0;i<t.length;i++){
            System.out.println("\n\t\t\tDetails of a Teacher "+(i+1));
            System.out.println("\t\t_____________\n");
            t[i].display();
        }
    }
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        Teacher[] t=insertDetails(read);
        displayDetails(t);
    }
}

OUTPUT

D:\JAVA PROGRAMS>javac MultiInheritance.java

D:\JAVA PROGRAMS>java MultiInheritance
Enter the no of Teachers :2


___________

Enter the Details of Teacher 1
___________

Enter the Name : seetha

Enter the Gender : female

Enter the Address : kannur

Enter the Age : 45

Enter the Employee Id : 12

Enter the Company Name : nnnn

Enter the Qualification : mca

Enter the Salary : 300000

Enter the Department : mca

Enter the Subject tought by the teacher : python

Enter the Teacher Id : 2


___________

Enter the Details of Teacher 2
___________

Enter the Name : mani

Enter the Gender : male

Enter the Address : kannur

Enter the Age : 46

Enter the Employee Id : 13

Enter the Company Name : mmmm

Enter the Qualification : mca

Enter the Salary : 30000

Enter the Department : mca

Enter the Subject tought by the teacher : c

Enter the Teacher Id : 5

                        Details of a Teacher 1
                _____________

                        Name of Employee : seetha
                        Gender : female
                        Address : kannur
                        Age : 45
                        Employee id : 12
                        Company Name : nnnn
                        Qualification : mca
                        Employee Salary : null
                        Teacher Id : 2
                        Department : mca
                        Subject Tought : python
                _____________


                        Details of a Teacher 2
                _____________

                        Name of Employee : mani
                        Gender : male
                        Address : kannur
                        Age : 46
                        Employee id : 13
                        Company Name : mmmm
                        Qualification : mca
                        Employee Salary : null
                        Teacher Id : 5
                        Department : mca
                        Subject Tought : c
                _____________
