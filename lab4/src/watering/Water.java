package watering;

public class Water {
    private int waterVolume;
    private WaterMoves move = WaterMoves.STILL;
    public static final int grammsPerLiter = 1000;


    public Water(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    public void setMoveMode(WaterMoves mode) {
        this.move = mode;
    }

    public int getWaterVolume(){
        return this.waterVolume;
    }

    public void setMove(WaterMoves move){
        this.move = move;
    }

    public static class WaterDrop {
        private int waterVolume;
        private final int dropsPerLiter = 100;
        private int dropNumber;

        public WaterDrop(int waterVolume) {
            this.waterVolume = waterVolume;
            this.dropNumber = this.dropsPerLiter * this.waterVolume;
        }

        public int getDropsNumber() {
            return this.dropNumber;
        }

        public int getWaterWeight() {
            return this.waterVolume * grammsPerLiter;
        }

        @Override
        public String toString() {
            return this.getDropsNumber() + " капель,весом в " + this.getWaterWeight() + " грамм.";
        }


    }
}
