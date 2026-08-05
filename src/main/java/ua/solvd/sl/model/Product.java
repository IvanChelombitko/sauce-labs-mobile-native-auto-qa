package ua.solvd.sl.model;

public enum Product {
    BACKPACK("Sauce Labs Backpack"),
    BIKE("Sauce Labs Bike Light"),
    JACKET("Sauce Labs Fleece Jacket");

    private final String title;

    Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}