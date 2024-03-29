import java.util.ArrayList;
import java.util.List;

public class Library { // this will have two collection to hold books and borrowers
    private List<Book> books = new ArrayList<>();
    private List<Borrower> borrowers = new ArrayList<>();

    //to add book
    public void addBook(Book book){
        books.add(book);
    }

    //to add borrower
    public void addBorrower(Borrower borrower){
        borrowers.add(borrower);
    }


    //to allow users borrow books that are not yet borrowed!
    public void borrowBook(Book book, Borrower borrower){
        if (!book.isBorrowed()) {
            book.borrow();
            System.out.println(borrower.getName() + " has borrowed " + book.toString());

        }else {
            System.out.println("Sorry, " + book.toString() + " is already borrowed!");
        }
    }

    //to return book to library
    public void returnBook(Book book){
        if(book.isBorrowed()){
            book.returnBook();
            System.out.println(book.toString() + " has returned!");
        } else{
            System.out.println(book.toString() + " was not yet borrowed!");
        }
    }
}
