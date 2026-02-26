import java.util.ArrayList;

/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class LabClass{
    private String instructor;
    private ArrayList<Student> students;
    private int capacity;
    private int credits;
    private int duration;

    /**
     * Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public LabClass(String teacher, int maxNumberOfStudents, int cred){
        instructor = teacher;
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
        credits = cred;
        duration = 50;
    }

    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent){
        if(students.size() == capacity) {
            System.out.println(
                "The class is full, you cannot enrol.");
            return;
        }

        if (isEnrolled(newStudent)) {
            System.out.println(
                "You cannot enrol twice.");
            return;
        }

        students.add(newStudent);
        newStudent.addCredits(credits);
    }

    /**
     * Add a student to this LabClass.
     */
    public void dropStudent(Student dropping){
        students.remove(dropping);
    }

    /**
     * Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents(){
        return students.size();
    }

    public boolean isEnrolled(Student maybe){
        return students.contains(maybe);
    }

    public Student findName(String name){
        return students.parallelStream()
        .filter(s -> s.getName().contains(name))
        .findFirst()
        .orElse(null);
    }

    public Student findID(String id){
        return students.parallelStream()
        .filter(s -> s.getStudentID().contains(id))
        .findFirst()
        .orElse(null);
    }

    //Q8
    public void setCapacity(int num)
    {
        capacity = num;
    }

    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void printList(){
        System.out.println("Instructor: " + instructor);
        System.out.println("Class list:");
        for(Student student : students) {
            student.print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }
}
