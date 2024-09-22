//****5*****  интерфейс создан в целях реализации принципа Dependency inversion: классы StudentController и TeacherController
// будут зависеть от абстракций (IStudentService, ITeacherService), а не от конкретных реализаций сервисов.
// Это позволит легче заменять или расширять функциональность сервисов.

import java.util.List;

public interface ITeacherService {
    void create(String firstName, String lastName, String middleName);
    void editByFIO(String firstName, String lastName, String middleName,
                   String newFirstName, String newLastName, String newMiddleName);
    List<Teacher> getAllTeachers();
}

