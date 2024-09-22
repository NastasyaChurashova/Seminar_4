import java.util.List;

public class TeacherController implements ITeacherController {

    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.create(firstName, lastName, middleName);
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachers);
    }

    @Override
    public void editUserByFIO(String firstName, String lastName, String middleName,
                              String newFirstName, String newLastName, String newMiddleName) {
        teacherService.editUserByFIO(firstName, lastName, middleName,
                newFirstName, newLastName, newMiddleName);
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachers);
    }

    @Override
    public void createTeacher(String firstName, String lastName, String middleName) {

    }

    @Override
    public void editTeacherByFIO(String firstName, String lastName, String middleName, String newFirstName, String newLastName, String newMiddleName) {

    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}
