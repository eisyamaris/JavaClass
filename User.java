import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class User {
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks;
    private Map<String, LocalDate> borrowedBooksDueDates;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
        this.borrowedBooksDueDates = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void borrowBook(String bookTitle) {
        borrowedBooks.add(bookTitle);
        borrowedBooksDueDates.put(bookTitle, LocalDate.now().plusDays(14)); 
    }

    public void returnBook(String bookTitle) {
        if (borrowedBooks.remove(bookTitle)) {
            borrowedBooksDueDates.remove(bookTitle);
            System.out.println(bookTitle + " returned successfully.");
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    public void printBorrowedBooks() {
        System.out.println("Borrowed books by " + name + ":");
        for (String book : borrowedBooks) {
            System.out.println("- " + book);
        }
    }

    public void checkDueDates() {
        for (Map.Entry<String, LocalDate> entry : borrowedBooksDueDates.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Due Date: " + entry.getValue());
        }
    }

    public void checkOverdueBooks() {
        LocalDate today = LocalDate.now();
        System.out.println("Overdue books for " + name + ":");
        for (Map.Entry<String, LocalDate> entry : borrowedBooksDueDates.entrySet()) {
            LocalDate dueDate = entry.getValue();
            if (today.isAfter(dueDate)) {
                long daysOverdue = today.toEpochDay() - dueDate.toEpochDay();
                System.out.println("Book: " + entry.getKey() + ", Overdue by: " + daysOverdue + " days.");
            }
        }
    }
}
