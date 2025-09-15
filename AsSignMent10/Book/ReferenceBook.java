
package AsSignMent10.Book;
import java.util.Scanner;
public class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook() {}

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nhà xuat ban: ");
        publisher = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Publisher: " + publisher);
    }

    @Override
    public boolean updateBookById(String id) {
        if (getId().equals(id)) {
            setTitle(getTitle() + " (Updated)");
            return true;
        }
        return false;
    }

    @Override
    public void displayDetails() {
        xuat();
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.10;
    }

    @Override
    public void addBook() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean updateBookById() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double calculate() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

