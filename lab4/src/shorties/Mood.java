package shorties;

public enum Mood {
    ANGRY("Сердитый"),
    ADMIRING("Любуется"),
    PENSIVE("Задумчивый");

    String name;

    Mood(String mood) {
        this.name = mood;
    }
}
