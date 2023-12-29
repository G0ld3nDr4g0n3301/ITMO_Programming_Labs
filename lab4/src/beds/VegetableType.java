package beds;

public enum VegetableType {
    EARTH_CUCUMBER("Огурец земной"),
    EARTH_TOMATO("Помидор земной"),
    LUNAR_CUCUMBER("Огурец лунный"),
    LUNAR_TOMATO("Помидор лунный"),
    LUNAR_STRAWBERRY("Лунная клубника");

    String name;

    VegetableType(String name) {
        this.name = name;
    }
}
