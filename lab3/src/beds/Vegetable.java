package beds;
public class Vegetable {
    
    protected VegetableType type;
    protected VegetableStages stage;
    protected int baseVolume;
    protected int volume;
    protected double waterLevel = 0;

    public void increaseWaterLevel(double d) {
        this.waterLevel = this.waterLevel + d;
    }

    public int increaseBaseVolume(int baseVolume) {
        switch (this.type) {
            case LUNAR_TOMATO:
                return baseVolume;
            case LUNAR_CUCUMBER:
                return baseVolume + 1;
            case EARTH_TOMATO:
                return baseVolume * 20;
            case EARTH_CUCUMBER:
                return baseVolume * 20 + 1;
            default:
                return 0;
        }
    }

    public Vegetable(VegetableType type, double waterLevel, int baseVolume){
        this.type = type;
        this.waterLevel = waterLevel;
        this.baseVolume = this.increaseBaseVolume(baseVolume);
        this.volume = this.baseVolume;
        this.checkGrowth();
    }

    public static Vegetable[] cloneVegetable(Vegetable vegetable, int amount){
        Vegetable[] vegetableClones = new Vegetable[amount];
        for (int i = 0;i<amount;i++) {
            vegetableClones[i] = vegetable;
        }
        return vegetableClones;
    }


    public void checkGrowth(){
        if (this.stage != VegetableStages.OVERGROW && this.stage != VegetableStages.NONE) {
            
            switch ( (int) this.waterLevel / 1) {
            
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

    public int getVolume(){
        return this.volume;
    }




}
