import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserService <T extends User>{
    public List<T> users = new ArrayList<>();

    public void create(String firstName, String lastName, String middleName) {
        T user = (T) new User(firstName, lastName, middleName);
        users.add(user);
    }

    // Получить всех пользователей
    public List<T> getAllUsers() {
        return users;
    }

    public void editUserByFIO(String firstName, String lastName, String middleName,
                              String newFirstName, String newLastName, String newMiddleName) {
        for (T user : users) {
            if (user.getFirstName().equals(firstName) &&
                    user.getLastName().equals(lastName) &&
                    user.getMiddleName().equals(middleName)) {

                user.setFirstName(newFirstName);
                user.setLastName(newLastName);
                user.setMiddleName(newMiddleName);
                System.out.println("User updated successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }

    public void removeUserByFIO(String firstName, String lastName, String middleName) {
        Iterator<T> iterator = users.iterator();
        while (iterator.hasNext()) {
            T user = iterator.next();
            if (user.getFirstName().equals(firstName) &&
                    user.getLastName().equals(lastName) &&
                    user.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }
}
