//*******2********* класс создан в целях реализации Open-closed principle

import java.util.Comparator;
import java.util.List;

public class ComparatorSortStrategy<T> implements SortStrategy<T> {
    private final Comparator<T> comparator;

    public ComparatorSortStrategy(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public List<T> sort(List<T> users) {
        users.sort(comparator);
        return users;
    }
}
