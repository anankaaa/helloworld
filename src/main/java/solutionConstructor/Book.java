package solutionConstructor;

public class Book {
    private String author;
    private String title;
    private String regNumber;

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getTitle() {
        return title;
    }

    public void register(String regNumber){
        this.regNumber=regNumber;
    }
}
