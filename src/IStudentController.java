//******4*******  interface UserController разделен на 2 специализированных - IStudentController и ITeacherController в целях реализации
//Interface Segregation Principle

import java.util.List;

public interface IStudentController {

    void createStudent(String firstName, String lastName, String middleName);
    void editStudentByFIO(String firstName, String lastName, String middleName,
                          String newFirstName, String newLastName, String newMiddleName);

    void removeStudentByFIO(String firstName, String lastName, String middleName);
    List<Student> getSortedStudentList();
    List<Student> getSortedStudentByFIO();
    List<Stream> getSortedStreams();

    void create(String firstName, String lastName, String middleName);

    void editUserByFIO(String firstName, String lastName, String middleName,
                       String newFirstName, String newLastName, String newMiddleName);

    List<Student> getAllStudents();
}
