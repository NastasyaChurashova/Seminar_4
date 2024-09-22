//*****2****  Open-closed principle:
// Логика сортировки реализована таким образом, что может нарушать принцип открытости/закрытости (OCP), так как для добавления нового механизма сортировки потребуется изменять класс UserSorter или его потомков.
// Вместо этого можно сделать сортировку более гибкой и позволяя подключать новые стратегии сортировки без изменения базового класса => создан интерфейс Стратегия сортировки - SortStrategy.
// В итоге, UserSorter закрыт для модификации и открыт для расширения.


import java.util.List;

// класс создан в целях реализации Single responsibility principle
public class UserSorter<T extends User> {
    private final SortStrategy<T> sortStrategy;

    public UserSorter() {
        this.sortStrategy = new DefaultSortStrategy<>();
    }

    // Set a custom sorting strategy
    public UserSorter(SortStrategy<T> sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public List<T> sortUsers(List<T> users) {
        return sortStrategy.sort(users);
    }
}