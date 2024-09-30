import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Book array
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "12345"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "67890"));

        // User array
        library.addUser(new User("Khai", 25));
        library.addUser(new User("Mai", 30));

        String option;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. List available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. View borrowed books, due dates, and overdue status");
            System.out.println("5. Exit");
            System.out.print("\nChoose an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    library.listAvailableBooks();
                    break;

                case "2":
                    System.out.println("Select user:");
                    for (int i = 0; i < library.getUsers().size(); i++) {
                        System.out.println((i + 1) + ". " + library.getUsers().get(i).getName());
                    }
                    int userIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    User borrower = library.getUsers().get(userIndex);

                    System.out.print("Enter the title of the book to borrow: ");
                    String bookTitle = scanner.nextLine();
                    library.borrowBook(borrower, bookTitle);
                    break;

                case "3":
                    System.out.println("Select user:");
                    for (int i = 0; i < library.getUsers().size(); i++) {
                        System.out.println((i + 1) + ". " + library.getUsers().get(i).getName());
                    }
                    userIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    User returner = library.getUsers().get(userIndex);

                    System.out.print("Enter the title of the book to return: ");
                    String returnBookTitle = scanner.nextLine();
                    returner.returnBook(returnBookTitle);
                    break;

                case "4":  
                    System.out.println("Select user:");
                    for (int i = 0; i < library.getUsers().size(); i++) {
                        System.out.println((i + 1) + ". " + library.getUsers().get(i).getName());
                    }
                    userIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    User userToViewDetails = library.getUsers().get(userIndex);

                    userToViewDetails.printBorrowedBooks();

                    userToViewDetails.checkDueDates();

                    userToViewDetails.checkOverdueBooks();
                    break;

                case "5":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (!option.equals("5"));

        scanner.close();
    }
}
