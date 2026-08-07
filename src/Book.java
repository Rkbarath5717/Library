public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    Book(int bookId, String title, String author){
        this.bookId=bookId;
        this.author=author;
        this.title=title;
        this.available=true;
    }
    public void displayBook(){
        System.out.println(bookId+" - "+ title+" - "+author);

        if (available){
            System.out.println("Available");
        }
        else {
            System.out.println("Borrowed");
        }
    }
}
