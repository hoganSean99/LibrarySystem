import Book.Book;
import Book.MacBeth;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

class MacBethTest {


        Book book = new MacBeth();

        @Test
        void testOnLoan () {
            assertEquals("This Book is on loan!", book.onLoan());
        }

    }