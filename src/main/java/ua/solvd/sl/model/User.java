package ua.solvd.sl.model;

public enum User {
    STANDARD("standard_user", "secret_sauce", "John", "Doe", "12345"),
    LOCKED_OUT("locked_out_user", "secret_sauce", "Jeremy", "Soule", "54321");

    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String zipCode;

    User(String username, String password, String firstName, String lastName, String zipCode) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }
}