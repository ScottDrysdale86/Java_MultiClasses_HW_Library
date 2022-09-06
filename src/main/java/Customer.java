import java.util.ArrayList;

public class Customer {

    private ArrayList<Book> borrowedList;

    public Customer(){
        borrowedList = new ArrayList<>();
    }

    public void borrowBook(Library library) {
        this.borrowedList.add(library.rentBook());
    }

    public int getBorrowedListCount(){
        return this.borrowedList.size();
    }
}
