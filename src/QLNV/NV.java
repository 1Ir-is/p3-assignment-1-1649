package QLNV;

import java.util.Scanner;

public class NV {
    String id, name;
    int age;
    float salary,commission;
    NV(){}
    NV(String id, String name, int age, float salary, float commission){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.commission = commission;
    }

    // Ham lay thong tin ten sinh vien
    public String getName(){
        return name;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        System.out.println("Nhap luong: ");
        salary = scanner.nextFloat();
        System.out.println("Nhap phu cap: ");
        commission = scanner.nextFloat();
    }

    public void hienThiThongTin(){
        System.out.println("-------- DANH SACH NHAN VIEN --------");
        System.out.println("\tId: " + id);
        System.out.println("\tTen: " + name);
        System.out.println("\tTuoi: " + age);
        System.out.println("\tLuong: " + salary);
        System.out.println("\tPhu Cap: " + commission);
    }
}

