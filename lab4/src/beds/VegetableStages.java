package beds;

public enum VegetableStages {
    NONE("не посажен"),
    RECENTLY_PLANTED("недавно посажен"),
    PLANTED("посажен"),
    GROW_BEGINNING("начинает расти"),
    GROW_MIDDLE("растёт"),
    GROW_MAX("зрелый"),
    OVERGROW("перезрелый");


    String name;

    VegetableStages(String name) {
        this.name = name;
    }
}
