
public class Book {

    private int id;
    private String title;
    private String author;
    private Boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id + "\n" +
                "title='" + title + "\n" +
                "author='" + author + "\n" +
                "isBorrowed=" + isBorrowed +
                '}';
    }

//    public static void main(String[] args) {
//        Book book = new Book(27, "The Dark Truth", "Suly");
//
//        book.isBorrowed = true;
//        System.out.println(book.toString());
//    }

}

