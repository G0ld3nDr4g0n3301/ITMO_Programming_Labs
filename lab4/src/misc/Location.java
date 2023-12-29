package misc;

public enum Location {
    GARDEN("Сад"),
    BEDS_NEAR("Ближние грядки"),
    BEDS_FAR("Дальние грядки"),
    BEDS_STRAWBERRY("Грядки с клубникой");

    private String name;

    private Location(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
