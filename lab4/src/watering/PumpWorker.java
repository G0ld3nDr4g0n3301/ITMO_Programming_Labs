package watering;

import interfaces.Workable;
import misc.Location;
import shorties.Shorty;


public class PumpWorker extends Shorty implements Workable {

    private boolean position;
    private Pump pump;


    @Override
    public void work() {
        this.pump.applyToJob(this, false);
    }

    public PumpWorker(Pump pump, Location location, boolean position) {
        this.pump = pump;
        this.location = location;
        this.position = position;
    }

}
