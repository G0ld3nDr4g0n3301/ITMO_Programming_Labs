package shorties;
import interfaces.Acheable;

public class Leg implements Acheable{

    protected boolean isAching;

    @Override
    public void ache() {
        this.isAching = true;
        System.out.println("Нога болит.");
    }
}
