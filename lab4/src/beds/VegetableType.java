package beds;
import interfaces.CanIncreaseVolume;

public enum VegetableType implements CanIncreaseVolume {
    EARTH_CUCUMBER("Огурец земной"){
        public int getIncreasedVolume(int baseVolume){
            return baseVolume * 20 + 1;
        }
    },
    EARTH_TOMATO("Помидор земной"){
        public int getIncreasedVolume(int baseVolume){
            return baseVolume * 20;
        }
    },
    LUNAR_CUCUMBER("Огурец лунный"){
        public int getIncreasedVolume(int baseVolume){
            return baseVolume + 1;
        }
    },
    LUNAR_TOMATO("Помидор лунный"){
        public int getIncreasedVolume(int baseVolume){
            return baseVolume;
        }
    },
    LUNAR_STRAWBERRY("Лунная клубника"){
        public int getIncreasedVolume(int baseVolume){
            return baseVolume * 5;
        }
    };

    String name;



    VegetableType(String name) {
        this.name = name;
    }
}
