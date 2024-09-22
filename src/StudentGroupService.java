import java.util.Iterator;
import java.util.List;

public class StudentGroupService extends UserService<Student>{

    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        Iterator<Student> iterator = users.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)
                    && student.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public List<Student> getUserList() {
        return users;
    }
}
