package watering;

import interfaces.Workable;
import misc.Location;
import shorties.Shorty;

public class Hose {

    private Location location;
    private Shorty worker;

    public Hose(Location location) {
        this.location = location;
    }

    public void fire(Water water) {
        water.setMove(WaterMoves.FALLING);
        Water.WaterDrop drops = new Water.WaterDrop(water.getWaterVolume());
        System.out.println("Вода падает вниз." + drops);
    }

    public void applyToJob() {

        class HoseWorker extends Shorty implements Workable {

            private final Hose hose;

            public HoseWorker(Hose hose) {
                this.hose = hose;
            }

            @Override
            public void work() {
                if (this.location == this.hose.location) {
                    worker = this;
                }
            }
        }
        HoseWorker hoseWorker = new HoseWorker(this);
        hoseWorker.work();
    }

}
