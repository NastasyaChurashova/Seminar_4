import java.util.Iterator;
import java.util.List;

public class TeacherService extends UserService<Teacher> {
    public List<Teacher> getAllTeachers() {
        return users;
    }

    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = users.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)
                    && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }
}
