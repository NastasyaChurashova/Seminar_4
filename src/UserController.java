public interface UserController<T extends User>  {
    void create(String firstName, String lastName, String middleName);

    void editUserByFIO(String firstName, String lastName, String middleName,
                       String newFirstName, String newLastName, String newMiddleName);
}
