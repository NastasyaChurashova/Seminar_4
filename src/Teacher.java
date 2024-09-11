import java.util.Iterator;
import java.util.List;

public class Teacher extends User{

    private List<Teacher> teacherList;

    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
    }

    public Iterator<Teacher> iterator() {
        return null;
    }

    public boolean getTeacherID() {
        return true;
    }
}
