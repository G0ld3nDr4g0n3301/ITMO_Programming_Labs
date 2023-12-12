
package watering;

import misc.Location;

public class Hose {
    
    public Location location;
    private HoseWorker worker;

    public Hose(Location location) {
        this.location = location;
    }

    public void fire(Water water) {
        water.move = WaterMoves.FALLING;
        System.out.println("Вода падает вниз.");
    }

    public void applyToJob(HoseWorker worker){
        if (this.location == worker.getLocation()){
           this.worker = worker;
    }
    }

}
