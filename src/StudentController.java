import java.util.List;

public class StudentController implements IStudentController{

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    private final StudentView studentView = new StudentView();

    @Override
    public void createStudent(String firstName, String lastName, String middleName) {

    }

    @Override
    public void editStudentByFIO(String firstName, String lastName, String middleName, String newFirstName, String newLastName, String newMiddleName) {

    }

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
        List<Student> students = studentGroupService.getUserList();
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
        List<Student> students = studentGroupService.getUserList();
        studentView.sendOnConsole(students);
    }

    @Override
    public void editUserByFIO(String firstName, String lastName, String middleName,
                              String newFirstName, String newLastName, String newMiddleName) {
        studentGroupService.editUserByFIO(firstName, lastName, middleName,
                newFirstName, newLastName, newMiddleName);
        List<Student> students = studentGroupService.getUserList();
        studentView.sendOnConsole(students);
    }

    public List<Student> getAllStudents() {
        return studentGroupService.getUserList();
    }
}
