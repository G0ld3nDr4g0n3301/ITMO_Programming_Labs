package misc;
import shorties.Leg;

public class Trap {
    public Location location = Location.GARDEN;

    public Trap(Location location){
        this.location = location;
    }

    public void damageLeg(Leg leg) {
        System.out.println("Капкан травмировал ногу");
        leg.ache();
    }
}
