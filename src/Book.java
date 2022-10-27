public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(int year, String title, Author author) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return (Author) this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
