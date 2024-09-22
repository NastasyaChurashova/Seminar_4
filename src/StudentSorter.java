//******1******* класс создан в целях реализации single responsibility principle

import java.util.ArrayList;
import java.util.List;

public class StudentSorter extends UserSorter<Student>{

    private StudentGroupService studentGroupService;

    public StudentSorter() {
        super();  // default sort strategy
    }

    public StudentSorter(SortStrategy<Student> sortStrategy) {
        super(sortStrategy);  // custom sort strategy
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroupService.getUserList());
        return sortUsers(studentList);  // Use the strategy for sorting
    }
}
