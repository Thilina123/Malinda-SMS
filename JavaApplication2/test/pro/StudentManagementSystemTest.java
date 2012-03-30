/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import pro.Student;
import pro.StudentManagementSystem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Malintha
 */
public class StudentManagementSystemTest {

    StudentManagementSystem sms;

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        sms = new StudentManagementSystem();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of listAllStudents method, of class StudentManagementSystem.
     */
    @Test
    public void testListAllStudents() {
        System.out.println("test listallstudents()...");
        sms.registerStudent(new Student("Vajira", "Kannangara", 140, "Main Street,Gampaha"));
        sms.listAllStudents();
    }

    /**
     * Test of registerStudent method, of class StudentManagementSystem.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("test registerstudent()...");
        sms.registerStudent(new Student("Nimal", "Rupasinghe", 150, "Ja-Ela Rd, Ganemulla"));
        sms.listAllStudents();
    }
}
