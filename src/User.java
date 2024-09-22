//*****3**** Для реализации принципа Liskov Substitution Principle (LSP): getTeacherID() и getStudentID(),
// которые возвращают специфичные идентификаторы для конкретных классов,
// не должны находиться в базовом классе User. Новое поле - userId; методы: setUserId, getUserId

public class User {

    private String firstName;

    private String lastName;

    private String middleName;

    private long userId; // Общий идентификатор для всех пользователей


    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
