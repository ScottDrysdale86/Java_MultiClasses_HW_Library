import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("The Gruffallo", "Julia Donaldson", "Children");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canGetCapacityCount(){
        assertEquals(10, library.getCapacityCount());
    }

    @Test
    public void canRentBook(){
        library.addBook(book);
        library.rentBook();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void checkGenreTotal() {
        library.addBook(book);
        library.getGenresMap();
        assertEquals(1, library.getGenreFreq("Children"));
    }
}
