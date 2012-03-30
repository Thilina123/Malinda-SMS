package pro;

public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem() {
        this.repo = new StudentRepositoryEx();
    }

    public void listAllStudents() {

        for (Student st : repo.findAllStudents()) {
            if (st != null) {
                System.out.println(st.getRegNumber() + "\t" + st.getFirstName() + " " + st.getLastName() + "\t" + st.getAddress());
            }
        }
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
    }

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }
}
