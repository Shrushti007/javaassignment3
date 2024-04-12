package assignment3;

public class TestBook {

	public static void main(String[] args) {
		Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook(book2);

          System.out.println("\nAfter removing a book:");
        library.displayBooks();

	}

}
