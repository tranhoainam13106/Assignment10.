package AsSignMent10.Book;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Subject: " + subject);
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
        return getBasePrice() * 1.05;
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
