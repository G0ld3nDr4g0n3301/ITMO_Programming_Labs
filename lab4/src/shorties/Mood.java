package shorties;

public enum Mood {
    ANGRY("Сердитый"),
    ADMIRING("Любуется"),
    PENSIVE("Задумчивый");

    private String name;

    Mood(String mood) {
        this.name = mood;
    }
    
    public String getName(){
        return this.name;
    }
}
