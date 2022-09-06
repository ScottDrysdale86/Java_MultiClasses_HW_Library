import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    private HashMap<String, Integer> genreMap;


    public Library(int _capacity){
        this.books = new ArrayList<>();
        this.capacity = _capacity;
        this.genreMap = new HashMap<>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(this.capacity > this.getBookCount()) {
            this.books.add(book);
        }
    }

    public int getCapacityCount() {
        return this.capacity;
    }

    public Book rentBook(){
        return this.books.remove(0);

    }

    public void getGenresMap(){
        for (int i = 0; i < this.getBookCount(); i++) {
            Book book = this.books.get(i);
            String genre = book.getGenre();
            this.genreMap.putIfAbsent(genre, 0);
            Integer temp = this.genreMap.get(genre);
            this.genreMap.replace(genre, temp+1);
        }
    }

    public int getGenreFreq(String genre) {
        return this.genreMap.get(genre);

    }
}

