package misc;

public enum Form {
    ROUND("Круглый"),
    SQUARE("Квадратный"),
    RECTANGLE("Прямоугольный"),
    TRIANGLE("Треугольный");

    public String name;

    private Form(String name) {
        this.name = name;
    }
}
