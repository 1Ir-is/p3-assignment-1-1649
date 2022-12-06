package QLNV;
import java.util.Scanner;

public class QLNV {
    static NV[] ls = new NV[100];
    static int index = 0;

    public void inputs(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            NV nv = new NV();
            nv.nhapThongTin();
            ls[index] = nv;
            index++;
            System.out.println("Ban co muon tiep tuc? (y/n)");
            choice = scanner.next();
        }while (choice.equalsIgnoreCase("y"));
    }

    public void outputs(){
        for (int i = 0; i<index;i++){
            NV nv = ls[i];
            nv.hienThiThongTin();
        }
    }

    public void displayWithoutCommission(){
            for (int i = 0; i<index;i++){
                NV nv = ls[i];
                if (nv.commission == 0) {
                    nv.hienThiThongTin();
                }
            }
    }

    public void findName(String name){
        for (int i = 0; i<index; i++){
            NV x = ls[i];
            if (name.compareToIgnoreCase(x.name) == 0){
                x.hienThiThongTin();
            }
        }
    }

    public void Sort(){
        System.out.println("sort by name");
        for (int i = 0; i < index; i++) {
            int min=i;
            for (int j = i; j < index; j++) {
                if (ls[j].name.compareToIgnoreCase(ls[min].name)<0){
                    min=j;
                    NV nv =ls[i];
                    ls[i]=ls[min];
                    ls[min]=nv;
                }
            }
        }
    }


    public static void showMenu() {
        System.out.println("-------------- Menu ---------------");
        System.out.println("1. Nhap Danh Sach");
        System.out.println("2. Hien thi Danh Sach");
        System.out.println("3. Tim Kiem Theo Ten");
        System.out.println("4. Sap Xep Theo Ten");
        System.out.println("5. In Danh Sach Khong Co Phu Cap");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void Option(QLNV ql){
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        boolean exit = false;
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    ql.inputs();
                    break;
                case "2":
                    ql.outputs();
                    break;
                case "3":
                    System.out.println("Nhap ten nhan vien can tim: ");
                    String name = scanner.nextLine();
                    ql.findName(name);
                    break;
                case "4":
                    ql.Sort();
                    ql.outputs();
                    break;
                case "5":
                    ql.displayWithoutCommission();
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
        QLNV ql = new QLNV();
        Option(ql);
    }
}
