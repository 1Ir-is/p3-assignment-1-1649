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
}

