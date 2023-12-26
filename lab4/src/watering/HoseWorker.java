
package watering;
import interfaces.Workable;
import shorties.Shorty;

public class HoseWorker extends Shorty implements Workable {
    
    private Hose hose;

    public HoseWorker(Hose hose) {
        this.location = hose.location;
        this.hose = hose;

    }
    @Override
    public void work(){
        this.hose.applyToJob(this);
    }

}