

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest{
    
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    
    /**
     * Default constructor for test class BookTest
     */
    public BookTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        book1 = new Book("Jujutsu Kaisen", "Gege Akutami");
        book1.setPrice(97.34);
        book2 = new Book("100 Años de Soledad", "Gabriel Garcia Marquez");
        book3 = new Book("Red, White & Royal Blue", "Casey McQuiston");
        book3.setPrice(16.15);
        book4 = new Book("The puppy chronicles", "Lilly Belfiore");
        book4.setPrice(20.00); 
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    //Q5
    @Test
    public void sold()
    {
        assertEquals("The puppy chronicles", book4.getTitle());
        assertEquals(20.0, book4.getPrice(), 0.1);
        book4.sold();
        assertEquals("The puppy chronicles(NA)", book4.getTitle());
        assertEquals(0.0, book4.getPrice(), 0.1);
    }
}


