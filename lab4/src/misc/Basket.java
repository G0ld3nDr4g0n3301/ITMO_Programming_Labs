package misc;

public class Basket extends CarryableItem {
    private int capacity;
    private Form form;

    public Basket(Form form, int capacity){
        this.capacity = capacity;
        this.form = form;
    }
}
