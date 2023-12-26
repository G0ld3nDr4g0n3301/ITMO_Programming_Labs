
package interfaces;
import misc.Location;
import shorties.MoveStyle;

public interface Moveable{ 
    public void changeLocation(Location location);
    public int getCurrentSpeed();
    public MoveStyle getMovingStyle();
    public void stop();
    public void setMovingStyle(MoveStyle style);
}
