import org.junit.Test;
import Book.*;
import Behaviour.*;

import static junit.framework.TestCase.assertEquals;

public class MerchantOfVeniceTest {

    Book book = new MerchantOfVenice();

    @Test
    public void testDisplay () {
        assertEquals("Merchant of Venice", book.display());
    }

    @Test
    public void testOnLoan () {
        assertEquals("This Book is in the Library", book.onLoan());
    }

    @Test
    public void testGenre () {
        assertEquals("This is a play", book.Genre());
    }

}
