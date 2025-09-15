package AsSignMent10.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    // add book
    public void addBook(Book book) {
        bookList.add(book);
    }

    public void nhapBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("chon 1 loai sach (text book, referenceBook)");
        int choice = sc.nextInt();
        sc.nextLine();

        Book b;
        if (choice == 1) {
            b = new TextBook();
        } else {
            b = new ReferenceBook();
        }
        b.nhap();
        addBook(b);
    }

    // update id book
    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b.updateBookById(id);
            }
        }
        return false;
    }

    // delete id book
    public boolean deleteBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                bookList.remove(b);
                return true;
            }
        }
        return false;
    }

    // find id book
    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    // output
    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty ");
        } else {
            for (Book b : bookList) {
                b.displayDetails();

            }
        }
    }

    //tim gia cao nhat
    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }

        Book max = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > max.calculatePrice()) {
                max = b;
            }
        }
        return max;
    }

    // dem so luong sach
    public int countBooks() {
        return bookList.size();
    }
}
