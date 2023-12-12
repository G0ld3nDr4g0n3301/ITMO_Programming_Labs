package shorties;

import interfaces.CanCarry;
import interfaces.Runable;
import interfaces.Walkable;
import misc.CarryableItem;
import misc.Location;

abstract public class Shorty implements CanCarry, Runable, Walkable{
    
    protected String name;
    protected Location location;
    protected Gender gender = Gender.MALE;
    protected Leg leg = new Leg();
    static protected int baseSpeed = 5;
    protected int currentSpeed = baseSpeed * 2;
    protected CarryableItem carriedItem;
    protected MoveStyle currentMovingStyle = MoveStyle.STAND;
    protected Mood mood;
    
    @Override
    public void setCarriedItem(CarryableItem item) {
        this.carriedItem = item;
    }

    @Override
    public CarryableItem getCarriedItem(){
        return this.carriedItem;
    }

    @Override
    public MoveStyle getMovingStyle(){
        return this.currentMovingStyle;
    }

    @Override
    public int getCurrentSpeed(){
        return this.currentSpeed;
    }

    @Override
    public void changeLocation(Location location) {
        this.location = location;
        System.out.println(this.name + " пришёл в " + this.location.getName());
    }

    public Location getLocation(){
        return this.location;
    }

    @Override
    public void run(){
        System.out.println(this.name + " Бежит");
        this.currentSpeed = baseSpeed * 3;
        this.currentMovingStyle = MoveStyle.RUN;
    }

    @Override
    public void walk(){
        System.out.println(this.name + " идёт");
        this.currentSpeed = baseSpeed * 2;
        this.currentMovingStyle = MoveStyle.WALK;
    }

    @Override
    public void stop(){
        System.out.println(this.name + " Остановился");
        this.currentSpeed = 0;
        this.currentMovingStyle = MoveStyle.STAND;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Leg getLeg(){
        return this.leg;
    }
}
