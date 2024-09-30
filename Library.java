import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void listAvailableBooks() {
        System.out.println("--- Available Books ---");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.printBookInfo();
            }
        }
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    user.borrowBook(title);
                    System.out.println(user.getName() + " borrowed: " + title);
                    return;
                } else {
                    System.out.println("Sorry, the book is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
