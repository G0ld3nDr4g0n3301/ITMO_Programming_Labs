import beds.Beds;
import beds.Vegetable;
import beds.VegetableType;
import misc.Broom;
import misc.Location;
import misc.Trap;
import shorties.Fix;
import shorties.Mood;
import shorties.Silly;
import shorties.Thought;

public class Main {
    public static void main(String[] args){

       Silly silly = new Silly();
       silly.shrug();
       new Trap(Location.GARDEN).damageLeg(silly.getLeg());
       silly.run();
       Fix fix = new Fix("Фикс",Mood.ANGRY);
       fix.setCarriedItem(new Broom(5));
       fix.walk();
       fix.sniff();
       silly.changeLocation(Location.BEDS_NEAR);
       fix.changeLocation(Location.BEDS_NEAR);
       silly.think(Thought.THE_VEGETABLES_SIZE);
       silly.think(Thought.WATERING_THE_BEDS);
       Beds beds = new Beds(10, 5);
       beds.fillBeds(new Vegetable(VegetableType.LUNAR_CUCUMBER, 0.5, 12));
       beds.waterBeds(3, 5);
    }
}