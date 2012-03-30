package pro;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import pro.Student;
import pro.StudentRepositoryEx;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentRepositoryTest {

    StudentRepositoryEx rep;

    public StudentRepositoryTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        rep = new StudentRepositoryEx();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSaveStudent() {
        Student st2 = new Student("Chathura", "Gamage", 1000, "Colombo");
        rep.saveStudent(st2);
        Student st = rep.findStudent(1000);
        assertEquals(st2, st);
    }

    @Test
    public void deleteStudent() {
        Student st = new Student("Chathura", "Gamage", 1500, "Colombo");
        rep.saveStudent(st);
        rep.deleteStudent(st);
        Student st1 = rep.findStudent(1500);
        assertEquals(null, st1);
    }

    @Test
    public void findStudent() {
        Student st2 = new Student("Appu", "hami", 1200, "Maiyangane");
        rep.saveStudent(st2);
        Student st = rep.findStudent(1200);
        assertEquals(st2, st);
    }

    @Test
    public void updateStudent() {
        Student st2 = new Student("Malintha", "Prasan", 1200, "Maiyangane");
        rep.saveStudent(st2);
        Student st3 = new Student("Rajiv", "Liyanage", 1200, "Mihinthale");
        rep.updateStudent(st3);
        Student st = rep.findStudent(1200);
        assertEquals(st, st3);
    }

    @Test
    public void findAllStudents() {
        Student st1 = new Student("Malintha", "Prasan", 1200, "Maiyangane");
        Student st2 = new Student("Shihan", "Pradeep", 1210, "Kurunegala");

        rep.saveStudent(st1);
        rep.saveStudent(st2);

        List<Student> list = rep.findAllStudents();
        
        assertEquals(st1, list.get(0));
        assertEquals(st2, list.get(1));

    }
}
