
public class Book {

    private String title;
    private String author;
    private Boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // to mark the book as borrowed
    public void borrow() {
        this.isBorrowed = true;
    }

    // to mark the book as returned
    public void returnBook(){
        this.isBorrowed = false;
    }

    public Boolean isBorrowed() {
        return this.isBorrowed;
    }

    public String toString(){
        return title + " by " + author;
    }

}


