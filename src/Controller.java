import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StreamService streamService = new StreamService();

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Stream> getSortedStreams() {
        return streamService.getSortedStudentGroups();
    }
}
