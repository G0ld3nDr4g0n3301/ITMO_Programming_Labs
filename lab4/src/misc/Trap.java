package misc;

import shorties.Shorty;

public class Trap {
    public Location location = Location.GARDEN;

    public Trap(Location location) {
        this.location = location;
    }

    public void damageHuman(Shorty shorty) {
        System.out.println("Капкан травмировал " + shorty.getName());
        shorty.gotDamaged();
    }
}
