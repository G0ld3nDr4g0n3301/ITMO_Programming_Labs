package misc;
import interfaces.CanBeCarried;

public abstract class CarryableItem implements CanBeCarried{ 

    protected Object carrier;
    protected int weight;

    public void carriedBy(Object carrier) {
        this.carrier = carrier;
    }
}