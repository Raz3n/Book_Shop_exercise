import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;
    private Library library;

    @Before
    public void before() {
        library = new Library(4);
        book = new Book("Tiamats Wrath", "James S Corey", "Sci FI");
        book2 = new Book("Leviathan Wakes", "James S Corey", "Sci Fi");
        book3 = new Book("Nemisis Games", "James S Corey", "Sci Fi");
        book4 = new Book("Persepolis Rising", "James S Corey", "Sci Fi");

    }

    @Test
    public void numOfBooks(){
        library.addBook(book);

        assertEquals(1,library.numOfBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1,library.numOfBooks());
    }

    @Test
    public void canNotAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book4);


        assertEquals(4,library.numOfBooks());

    }


}
