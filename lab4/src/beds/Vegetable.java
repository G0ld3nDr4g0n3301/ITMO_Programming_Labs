package beds;

public class Vegetable {

    private VegetableType type;
    private VegetableStages stage;
    private int baseVolume;
    private int volume;
    private double waterLevel = 0;

    public void increaseWaterLevel(double d) {
        this.waterLevel = this.waterLevel + d;
    }

    public int increaseBaseVolume(int baseVolume) {
        return this.type.getIncreasedVolume(baseVolume);
    }

    public Vegetable(VegetableType type, double waterLevel, int baseVolume) {
        this.type = type;
        this.waterLevel = waterLevel;
        this.baseVolume = this.increaseBaseVolume(baseVolume);
        this.volume = this.baseVolume;
        this.checkGrowth();
    }

    public static Vegetable[] cloneVegetable(Vegetable vegetable, int amount) {
        Vegetable[] vegetableClones = new Vegetable[amount];
        for (int i = 0; i < amount; i++) {
            vegetableClones[i] = vegetable;
        }
        return vegetableClones;
    }


    public void checkGrowth() {
        if (this.stage != VegetableStages.OVERGROW && this.stage != VegetableStages.NONE) {

            switch ((int) this.waterLevel) {

                case -1:
                    this.stage = VegetableStages.NONE;
                    break;
                case 0:
                    this.stage = VegetableStages.RECENTLY_PLANTED;
                    break;
                case 1:
                    this.stage = VegetableStages.PLANTED;
                    this.volume = this.baseVolume + 2;
                    break;
                case 2:
                    this.stage = VegetableStages.GROW_BEGINNING;
                    this.volume = this.baseVolume + 5;
                    break;
                case 3:
                    this.stage = VegetableStages.GROW_MIDDLE;
                    this.volume = this.baseVolume * 2;
                    break;
                case 4:
                    this.stage = VegetableStages.GROW_MAX;
                    this.volume = this.baseVolume * 3;
                    break;
                case 5:
                    this.stage = VegetableStages.OVERGROW;
                    this.volume = this.baseVolume * 10;
                    break;
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public VegetableType getType() {
        return this.type;
    }

    public VegetableStages getStage() {
        return this.stage;
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        Vegetable o = (Vegetable) obj;
        if (o == this) {
            return true;
        }
        if (!(o instanceof Vegetable)) {
            return false;
        }
        if (this.type != o.getType() || this.stage != o.getStage()) {
            return false;
        }
        if (this.volume == o.getVolume() && this.waterLevel == o.getWaterLevel()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = this.baseVolume * 41 + this.volume * 29 + ((int) this.waterLevel * 83);
        return hash;
    }

    @Override
    public String toString() {

        return "Это овощ " + this.type.getName() + " в стадии " + this.stage.name + " у него " + this.waterLevel + " воды.";
    }


}
