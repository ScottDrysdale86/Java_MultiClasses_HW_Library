public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String _title, String _author, String _genre ){
        this.title = _title;
        this.author = _author;
        this.genre = _genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }
}
