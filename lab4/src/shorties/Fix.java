package shorties;

import interfaces.Sniffable;
import misc.CarryableItem;

public class Fix extends Shorty implements Sniffable {

    public Fix(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
    }

    @Override
    public void sniff() {
        System.out.println(this.name + " сопит, он сейчас " + this.mood.name);
    }

    public void takeBroom() {
        CarryableItem broom = new CarryableItem() {
            @Override
            public String toString() {
                return "BROOOOOM";
            }
        };
        this.setCarriedItem(broom);
        System.out.println(this.getCarriedItem().getCarrier());
        System.out.println(this.getCarriedItem());
    }
}
