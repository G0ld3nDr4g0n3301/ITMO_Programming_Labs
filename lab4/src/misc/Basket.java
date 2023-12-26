package misc;

import beds.Vegetable;

public class Basket extends CarryableItem {
    private int capacity;
    private Form form;
    public Vegetable[] cells; 

    public Basket(Form form, int capacity){
        this.capacity = capacity;
        this.form = form;
        this.cells = new Vegetable[this.capacity];
    }
    
}
