
package AsSignMent10.Book;
import java.util.Scanner;

public abstract class Book implements IBook {
    private String id;
    private String title;
    private double basePrice;

    public Book() {}

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    // Getter Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

    // nhập thông tin chung
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter tieu de: ");
        title = sc.nextLine();
        System.out.print("Enter gia goc: ");
        basePrice = sc.nextDouble();
        sc.nextLine();
    }

    // xuất thông tin chung
    public void xuat() {
        System.out.println("ID: " + id + " | Title: " + title + " | Base Price: " + basePrice);
    }

    public void addBook(Book book) {}

    public boolean updateBookById(String id) { return false; }

    @Override
    public void displayDetails() {
        xuat(); // gọi phương thức xuất chung
    }

    public abstract double calculatePrice();
}
