//*******2********* класс создан в целях реализации Open-closed principle

import java.util.Collections;
import java.util.List;

public class DefaultSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public List<T> sort(List<T> users) {
        Collections.sort(users);
        return users;
    }
}