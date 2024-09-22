import java.util.Iterator;
import java.util.List;

public class TeacherService extends UserService<Teacher> {
    private List<Teacher> teacherList;

    public List<Teacher> getUserList() {
        return users;
    }

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName)
                    && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }
}
