package misc;

import beds.Vegetable;
import exceptions.BasketVolumeExceededException;

public class Basket extends CarryableItem {
    private int capacity;
    private Form form;
    public Vegetable[] cells;

    public Basket(Form form, int capacity) {
        this.capacity = capacity;
        this.form = form;
        this.cells = new Vegetable[this.capacity];
    }

    public void put(int index, Vegetable value) throws BasketVolumeExceededException {
        if (index == this.capacity) {
            throw new BasketVolumeExceededException("Превышен лимит корзины");
        } else {
            this.cells[index] = value;
        }
    }
}
