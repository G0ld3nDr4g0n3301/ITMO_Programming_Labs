package interfaces;

import misc.CarryableItem;

public interface CanCarry {

    public CarryableItem getCarriedItem();

    public void setCarriedItem(CarryableItem item);
}
