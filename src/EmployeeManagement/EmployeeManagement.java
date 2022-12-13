package EmployeeManagement;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeManagement {
    static Employee[] ls = new Employee[100];
    static int index = 0;

    void inputs(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            Employee employee = new Employee();
            employee.enterInformation();
            ls[index] = employee;
            index++;
            System.out.println("You want to continue? (y/n)");
            choice = scanner.next();
        }while (choice.equalsIgnoreCase("y"));
    }
    void outputs(){
        System.out.println("List employees");
        System.out.println("ID\t\t Name\t Age\tSalary\t\t Allowance");
        for (int i = 0; i<index;i++){
            Employee employee = ls[i];
            System.out.printf("%1s %10s  %5d    ",employee.id,employee.name,employee.age);
            System.out.printf("%5s %12s\n",employee.salary,employee.allowance);
        }
    }
    void displayWithoutAllowance(){
        System.out.println("List employees zero commission");
        System.out.println("ID\t\t Name\t Age\tSalary\t\t Allowance");
            for (int i = 0; i<index;i++){
                Employee employee = ls[i];
                if (employee.allowance == 0) {
                    System.out.printf("%1s %10s  %5d    ",employee.id,employee.name,employee.age);
                    System.out.printf("%5s %12s\n",employee.salary,employee.allowance);
                }
            }
    }
    void findName(String name){
        System.out.println("List employees");
        System.out.println("ID\t\t Name\t Age\tSalary\t\t Allowance");
        for (int i = 0; i < index; i++) {
            if (Objects.equals(ls[i].name, name)){
                Employee employee=ls[i];
                System.out.printf("%1s %10s  %5d    ",employee.id,employee.name,employee.age);
                System.out.printf("%5s %12s\n",employee.salary,employee.allowance);
            }
        }
    }
    void Sort(){
        System.out.println("Sort by name");
        for (int i = 0; i < index; i++) {
            int min=i;
            for (int j = i; j < index; j++) {
                if (ls[j].name.compareToIgnoreCase(ls[min].name)<0){
                    min=j;
                    Employee employee=ls[i];
                    ls[i]=ls[min];
                    ls[min]=employee;
                }
            }
        }
    }

    void updateAllowance(float newAllowance,String id){
        for (int i = 0; i < index; i++) {
            if (ls[i].id.compareToIgnoreCase(id)==0){//found
                Employee employee=ls[i];
                ls[i].allowance =ls[i].allowance + newAllowance;
                System.out.println("Update commission");
                System.out.println("List employees");
                System.out.println("ID\t\t Name\t Age\tSalary\t\t Allowance");
                System.out.printf("%1s %10s  %5d    ",employee.id,employee.name,employee.age);
                System.out.printf("%5s %12s\n",employee.salary,employee.allowance);
            }
        }
    }
    public static void showMenu() {
        System.out.println("-------------------- Menu ---------------------");
        System.out.println("1. Input");
        System.out.println("2. Display Employee's List");
        System.out.println("3. Find By Name");
        System.out.println("4. Sort By Name");
        System.out.println("5. Update Allowance");
        System.out.println("6. Display employee who don't have allowance");
        System.out.println("0. exit.");
        System.out.println("-----------------------------------------------");
        System.out.print("Please choose: ");
    }
    public static void Option(EmployeeManagement employeeManagement){
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    employeeManagement.inputs();
                    break;
                case "2":
                    employeeManagement.outputs();
                    break;
                case "3":
                    System.out.println("Enter employee's name to find: ");
                    String name = scanner.nextLine();
                    employeeManagement.findName(name);
                    break;
                case "4":
                    employeeManagement.Sort();
                    employeeManagement.outputs();
                    break;
                case "5":
                    System.out.println("Enter id to update");
                    String id = scanner.nextLine();
                    System.out.println("Enter new allowance");
                    float newAllowance = scanner.nextFloat();
                    employeeManagement.updateAllowance(newAllowance,id);
                    break;
                case "6":
                    employeeManagement.displayWithoutAllowance();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Option(employeeManagement);
    }
}
