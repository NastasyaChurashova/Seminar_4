//******4*******  interface UserController разделен на 2 специализированных - IStudentController и ITeacherController в целях реализации
//Interface Segregation Principle

import java.util.List;

public interface ITeacherController {
    void create(String firstName, String lastName, String middleName);

    void editUserByFIO(String firstName, String lastName, String middleName,
                       String newFirstName, String newLastName, String newMiddleName);

    void createTeacher(String firstName, String lastName, String middleName);
    void editTeacherByFIO(String firstName, String lastName, String middleName,
                          String newFirstName, String newLastName, String newMiddleName);
    List<Teacher> getAllTeachers();
}
