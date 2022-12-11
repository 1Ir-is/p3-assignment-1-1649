package SearchHistory;

import java.util.Scanner;

public class Program {
    static SearchHistory history = new SearchHistory();
    public static void showMenu() {
        System.out.println("-------------- Menu ---------------");
        System.out.println("1. Search");
        System.out.println("2. Show search history");
        System.out.println("3. Show the latest search");
        System.out.println("4. Delete the latest search");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    public static void Option(){
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.print("Please search here: ");
                    System.out.print("*some search result*");
                    history.push(scanner.nextLine());
                    break;
                case "2":
                    history.print();
                    break;
                case "3":
                    System.out.println(history.peek());
                    break;
                case "4":
                    System.out.println("Deleted "+history.pop());
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

    public static void main(String[] args){
        Option();
    }

}
