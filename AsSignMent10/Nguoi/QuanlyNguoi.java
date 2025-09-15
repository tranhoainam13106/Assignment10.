package AsSignMent10.Nguoi;

import java.util.Scanner;

public class QuanlyNguoi {
    public static void main(String[] args) {
        PersonList pl = new PersonList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. add person");
            System.out.println("2. output list");
            System.out.println("3. update cmnd");
            System.out.println("4. Delete cmnd");
            System.out.println("5. find name");
            System.out.println("6. exit");
            System.out.print("choice: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    pl.themDanhSach(new Nguoi());
                    break;
                case "2":
                    pl.xuatDanhSach();
                    break;
                case "3":
                    System.out.print("Enter cmnd: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine().trim());
                        pl.updatePerson(id);
                    } catch (NumberFormatException e) {
                        System.out.println("cmnd not valid.");
                    }
                    break;
                case "4":
                    System.out.print("nahp so cmnd cua nguoi can xoa: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine().trim());
                        pl.deletePerson(id);
                    } catch (NumberFormatException e) {
                        System.out.println("CMND not valid.");
                    }
                    break;
                case "5":
                    System.out.print("enter name and key name: ");
                    String name = sc.nextLine().trim();
                    pl.searchByName(name);
                    break;
                case "6":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("choise not vaild.");
            }
        }
    }
}
