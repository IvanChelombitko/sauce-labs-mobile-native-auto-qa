package ua.solvd.sl.model;

public enum User {
    STANDARD("standard_user", "secret_sauce"),
    LOCKED_OUT("locked_out_user", "secret_sauce");

    private final String username;
    private final String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}