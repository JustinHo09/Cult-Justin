import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * LabTest - create a sample lab class.
 *
 * @author  Esteban Parra Rodriguez
 * @version 01-20-2024
 */
public class LabTest{
    private LabClass labClass1;
    private LabClass labClass2;
    private Student student1;
    private Student student2;
    private Student student3;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        System.out.print('\f');
        student1 = new Student("Katy", "K034");
        student1.addCredits(30);
        student2 = new Student("Carlos", "C002");
        student2.addCredits(40);
        student3 = new Student("Zeus", "Z231");
        student3.addCredits(20);

        labClass1 = new LabClass("Bill", 4, 3);
        labClass1.enrollStudent(student2);
        labClass1.enrollStudent(student3);
        labClass1.printList();
        
        labClass2 = new LabClass("Esteban", 28, 4);
    }
}
