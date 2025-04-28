package Day19;

import java.util.Scanner;

class Manager
{

}

class Employee
{
    private String name, id, designation;
    private int age;
    private double salary;
    public Employee(String name, String id,int age, String designation, double salary)
    {
        this.name = name;
        this.id = id;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("Employee Name: "+this.name);
        System.out.println("ID: "+this.id);
        System.out.println("Age: "+this.age);
        System.out.println("Designation: "+this.designation);
    }

}

public class OOPS
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Employees in your company: ");
        int n = in.nextInt();

        Employee[] emp = new Employee[n];

        for(int i=0;i<n;++i)
        {
            System.out.println("\nEnter Employee "+i+" Details: \n");
            System.out.println("Enter Employee name: ");
            String name = in.next();
            System.out.println("Enter Employee ID: ");
            String id = in.next();
            System.out.println("Enter Employee Age: ");
            int age = in.nextInt();
            System.out.println("Enter Employee Designation: ");
            String designation = in.next();
            System.out.println("Enter Employee Salary: ");
            double salary = in.nextDouble();
            emp[i] = new Employee(name, id, age, designation, salary);
        }

        for(Employee i: emp)
            i.displayEmployeeDetails();
    }
}
