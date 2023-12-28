package misc;
import interfaces.CanBeCarried;
import interfaces.CanCarry;

public abstract class CarryableItem implements CanBeCarried{ 

    protected CanCarry carrier;

    public void carriedBy(CanCarry carrier) {
        this.carrier = carrier;
    }

    public CanCarry getCarrier(){
        return this.carrier;
    }
}