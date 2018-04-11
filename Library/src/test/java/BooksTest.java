import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BooksTest {

    Books books;

    @Before
    public void setUp(){
        books = new Books();
    }

    @Test
    public void canAddBook(){
        assertEquals(0,books.addBooks())
    }

}
