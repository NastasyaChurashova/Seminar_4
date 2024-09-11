import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
        List<Student> students = studentGroupService.getStudentList();
        studentView.sendOnConsole(students);
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Stream> getSortedStreams() {
        return streamService.getSortedStudentGroups();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.create(firstName, lastName, middleName);
        List<Student> students = studentGroupService.getStudentList();
        studentView.sendOnConsole(students);
    }

    @Override
    public void editUserByFIO(String firstName, String lastName, String middleName,
                              String newFirstName, String newLastName, String newMiddleName) {
        studentGroupService.editUserByFIO(firstName, lastName, middleName,
                newFirstName, newLastName, newMiddleName);
        List<Student> students = studentGroupService.getStudentList();
        studentView.sendOnConsole(students);
    }

    public List<Student> getAllStudents() {
        return studentGroupService.getStudentList();
    }
}
