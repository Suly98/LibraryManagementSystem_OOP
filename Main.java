public class Main {
    public static void main(String[] args){
        Library library = new Library();
        Book book1 = new Book("The Dark", "J.R. MAck");

        Borrower borrower1 = new Borrower("Suly alhudifi");

        library.addBook(book1);
        library.addBorrower(borrower1);

        library.borrowBook(book1,borrower1);

        library.returnBook(book1);
    }
}
