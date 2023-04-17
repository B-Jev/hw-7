package hw7;

public class Book {
    private String nameBook;
    private Author author;
    private int yearBook;

    public Book(String nameBook, int yearBook, Author author) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
}
