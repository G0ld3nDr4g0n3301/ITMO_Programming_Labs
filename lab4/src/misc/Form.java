package misc;

public enum Form {
    ROUND("Круглый"),
    SQUARE("Квадратный"),
    RECTANGLE("Прямоугольный"),
    TRIANGLE("Треугольный");

    private String name;

    private Form(String name) {
        this.name = name;
    }

    public String getForm() {
        return this.name;
    }
}
