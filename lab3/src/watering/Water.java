package watering;
public class Water {
    protected int waterVolume;
    protected WaterMoves move = WaterMoves.STILL;

    public Water(int waterVolume){
        this.waterVolume = waterVolume;
    }

    public void setMoveMode(WaterMoves mode) {
        this.move = mode;
    }
}
