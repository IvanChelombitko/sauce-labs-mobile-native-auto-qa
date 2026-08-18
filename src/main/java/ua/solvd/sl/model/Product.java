package ua.solvd.sl.model;

public enum Product {
    BACKPACK("Sauce Labs Backpack", "$29.99"),
    BIKE("Sauce Labs Bike Light", "$9.99"),
    JACKET("Sauce Labs Fleece Jacket", "$49.99"),
    ONESIE("Sauce Labs Onesie", "$7.99");

    private final String title;
    private final String price;

    Product(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
}