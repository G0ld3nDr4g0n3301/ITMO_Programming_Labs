
package watering;
import misc.Location;

public class Pump {
    
    private Location location;
    private PumpWorker[] workers;

    public Pump(Location location){
        this.location = location;
        this.workers = new PumpWorker[2];
    }

    public void createPressure(Water water){
        water.setMoveMode(WaterMoves.RUNNING);
        System.out.println("Вода течет по шлангу.");
    }

    public void applyToJob(PumpWorker worker, boolean position){
        if (this.location == worker.getLocation()){
            if (position) {
                this.workers[0] = worker;
            } else {
                this.workers[1] = worker;
            }
    }
    }
}
