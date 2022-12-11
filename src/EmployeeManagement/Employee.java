package EmployeeManagement;

import java.util.Scanner;

public class Employee {
    String id, name;
    int age;
    float salary,allowance;
    Employee(){}
    Employee(String id, String name, int age, float salary, float allowance){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.allowance = allowance;
    }

    public void enterInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = scanner.nextLine();
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        System.out.println("Enter salary: ");
        salary = scanner.nextFloat();
        System.out.println("Enter allowance: ");
        allowance = scanner.nextFloat();
    }

    public void displayEmployeeInformation(){
        System.out.println("-------- EMPLOYEE LIST --------");
        System.out.println("\tId: " + id);
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tSalary: " + salary);
        System.out.println("\tAllowance: " + allowance);
    }
    public void displayEmployeeInformationWithOutAllowance(){
        System.out.println("-------- EMPLOYEE LIST WITH OUT ALLOWANCE--------");
        System.out.println("\tId: " + id);
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tSalary: " + salary);
        System.out.println("\tAllowance: " + allowance);
    }
    public void displayEmployeeInformationWhoUpdateAllowance(){
        System.out.println("-------- EMPLOYEE LIST WHO UPDATE ALLOWANCE--------");
        System.out.println("\tId: " + id);
        System.out.println("\tName: " + name);
        System.out.println("\tAge: " + age);
        System.out.println("\tSalary: " + salary);
        System.out.println("\tAllowance: " + allowance);
    }
}

