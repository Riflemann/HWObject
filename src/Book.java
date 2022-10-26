public class Book {
    private String title;
    private int year;
    private Object author;

    public Book(int year, String title, Object Author) {
        this.author = (Author) Author;
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
