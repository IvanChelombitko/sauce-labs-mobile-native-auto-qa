package ua.solvd.sl.model;

public enum MenuItem {
    ALL_ITEMS("test-ALL ITEMS"),
    WEBVIEW("test-WEBVIEW"),
    DRAWING("test-DRAWING"),
    RESET_APP_STATE("test-RESET APP STATE");

    private final String accessibilityId;

    MenuItem(String accessibilityId) {
        this.accessibilityId = accessibilityId;
    }

    public String getAccessibilityId() {
        return accessibilityId;
    }
}