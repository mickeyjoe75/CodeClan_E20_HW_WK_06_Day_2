import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Books books;

    @Before
    public void setUp(){
        library = new Library();
        books = new Books();
    }

    @Test
    public void getBookCount(){
        library.booksCount();
        assertEquals(0,library.booksCount());
    }
}
