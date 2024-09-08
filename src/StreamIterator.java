import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;

    private final List<StudentGroup> studentGroups;

    public StreamIterator(int count, List<StudentGroup> studentGroups) {
        this.count = count;
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext()){
            return null;
        }
        return studentGroups.get(count++);
    }

    @Override
    public void remove() {
        studentGroups.remove(count - 1);
    }
}
