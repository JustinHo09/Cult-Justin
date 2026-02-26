import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeaterTest{
    private Heater heater1;

    /**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp(){
        heater1 = new Heater(4);
        heater1.setTemperature(73.2);
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
    public void increase5(){
        heater1.setTemperature(68.0);
        assertEquals(68, heater1.getTemperature(), 0.1);
        heater1.raiseTemperature(5);
        assertEquals(73, heater1.getTemperature(), 0.1);
    }
}

