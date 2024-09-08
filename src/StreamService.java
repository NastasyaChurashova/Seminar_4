import java.util.List;

public class StreamService {
    private List<Stream> studentGroups;

    public List<Stream> getSortedStudentGroups() {
        studentGroups.sort(new StreamComparator());
        return studentGroups;
    }
}