import java.util.List;

public class TeacherController implements UserController<Teacher>{

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

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}
