

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest{
    private Person person1;
    private Person person2;    

    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp(){
        person1 = new Person();
        person2 = new Person();
        person2.changeColor("red");
        person2.moveRight();
        person2.moveDown();
        person2.moveVertical(37);
        person2.changeSize(45, 120);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown(){
    }

    @Test
    public void colorTest(){
        assertEquals("black", person1.getColor());
        person1.changeColor("magenta");
        assertEquals("magenta", person1.getColor());
    }
}

