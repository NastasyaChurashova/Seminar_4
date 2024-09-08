import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    private List<Student> studentList;

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
