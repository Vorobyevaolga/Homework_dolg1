public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int yearBook;

    public Book(String nameBook, Author nameAuthor, int yearBook) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAutor() {
        return this.nameAuthor;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
