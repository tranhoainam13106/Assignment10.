package AsSignMent10.Book;

import java.util.Scanner;

public class QuanLyBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bl = new BookList();
        int choice;

        do {
            System.out.println("\n MENU");
            System.out.println("1. add book");
            System.out.println("2. output book");
            System.out.println("3. find id book");
            System.out.println("4. update id book");
            System.out.println("5. Delete id book");
            System.out.println("6. find book expensive");
            System.out.println("7. count");
            System.out.println("0. exit");
            System.out.print("choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bl.nhapBook();
                    break;
                case 2:
                    bl.displayAllBooks();
                    break;
                case 3:
                    System.out.print("Enter ID: ");
                    String idFind = sc.nextLine();
                    Book found = bl.findBookById(idFind);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("no find !");
                    }
                    break;
                case 4:
                    System.out.print("Enter id book update: ");
                    String idUpdate = sc.nextLine();
                    if (bl.updateBookById(idUpdate)) {
                        System.out.println("update thanh cong!");
                    } else {
                        System.out.println("no find!");
                    }
                    break;
                case 5:
                    System.out.print("Enter id can xoa: ");
                    String idDel = sc.nextLine();
                    if (bl.deleteBookById(idDel)) {
                        System.out.println("dalete!");
                    } else {
                        System.out.println("no find!");
                    }
                    break;
                case 6:
                    Book max = bl.findMostExpensiveBook();
                    if (max != null) {
                        System.out.println("book expensive nhat:");
                        max.displayDetails();
                        System.out.println("gia: " + max.calculatePrice());
                    } else {
                        System.out.println("Empty list!");
                    }
                    break;
                case 7:
                    System.out.println("Tong so sach: " + bl.countBooks());
                    break;
            }
        } while (choice != 0);
    }
}
