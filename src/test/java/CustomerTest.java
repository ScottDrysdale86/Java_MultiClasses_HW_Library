import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Library library;
    private Book book;
    private Customer customer;

    @Before
    public void before() {
        library = new Library(10);
        book = new Book("The Gruffallo", "Julia Donaldson", "Children");
        library.addBook(book);
        customer = new Customer();
    }

    @Test
    public void canGetBorrowedCount() {
        assertEquals(0, customer.getBorrowedListCount());
    }

    @Test
    public void canAddBookToBorrowedList(){
        customer.borrowBook(library);
        assertEquals(1, customer.getBorrowedListCount());
    }
}
