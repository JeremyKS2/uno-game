/**
 * Enumeration for card colors in Uno game
 */
public enum CardColor {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green"),
    YELLOW("Yellow"),
    WILD("Wild");

    private final String displayName;

    CardColor(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}