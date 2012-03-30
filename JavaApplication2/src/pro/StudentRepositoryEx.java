package pro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryEx implements StudentRepository {

    private Map<Long, Student> studentsDb;

    public StudentRepositoryEx() {
        studentsDb = new HashMap<Long, Student>();
    }

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {
        if (studentsDb.containsValue(stu)) {
            studentsDb.remove(stu.getRegNumber());
        } else {
            System.out.println("not available");
        }
    }

    @Override
    public Student findStudent(long regNumber) {
        if (studentsDb.containsKey(regNumber)) {
            return studentsDb.get(regNumber);
        } else {
            return null;
        }
    }

    @Override
    public void updateStudent(Student stu) {
        if (studentsDb.keySet().contains(stu.getRegNumber())) {
            studentsDb.remove(stu.getRegNumber());
            studentsDb.put(stu.getRegNumber(), stu);
        } else {
            System.out.println("not avaiable");
        }
    }

    @Override
    public List<Student> findAllStudents() {
        ArrayList<Student> stuList = new ArrayList<Student>();
        for (long i : studentsDb.keySet()) {
            stuList.add(studentsDb.get(i));
        }
        return stuList;
    }
}
