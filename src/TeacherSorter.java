//******1******* класс создан в целях реализации single responsibility principle

import java.util.ArrayList;
import java.util.List;

public class TeacherSorter extends UserSorter<Teacher>{

    private TeacherService teacherService;

    public TeacherSorter() {
        super();  // Use default sort strategy
    }

    public TeacherSorter(SortStrategy<Teacher> sortStrategy) {
        super(sortStrategy);  // Use custom sort strategy
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = new ArrayList<>(teacherService.getUserList());
        return sortUsers(teacherList);  // Use the strategy for sorting
    }
}
