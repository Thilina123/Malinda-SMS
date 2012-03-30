package pro;

import org.springframework.context.support.*;

public class SmsStarter {

    public static void main(String[] args) {
       
        StudentManagementSystem smsystem;        
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-content.xml");
        context.start();
        
        //load the bean from spring
        smsystem=(StudentManagementSystem)context.getBean("smsystem");
        
        smsystem.listAllStudents();
        
        Student std1=(Student)context.getBean("stud1");
        Student std2=(Student)context.getBean("stud2");
        Student std3=(Student)context.getBean("stud3");
        
        smsystem.registerStudent(std1);
        smsystem.registerStudent(std2);
        smsystem.registerStudent(std3);
        
        smsystem.listAllStudents();
        
    }
}
