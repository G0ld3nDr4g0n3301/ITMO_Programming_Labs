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
    
    public String getName() {
        return this.name;
    }

    public Mood getMood() {
        return this.mood;
    }

    public Gender getGender(){
        return this.gender;
    }



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

    @Override
    public int hashCode(){
        int hash = this.name.length() * 7 + this.currentSpeed * 113;
        if (this.gender == Gender.MALE){
            return hash * 3;
        } else{
            return hash*2;
        }

    }

    @Override
    public boolean equals(Object o){
        if (this.hashCode() != o.hashCode()){
            return false;
        }
        if (this == o){
            return true;
        }
        if (!(o instanceof Shorty)) {
            return false;
        }
        if (this.name == o.getName() && this.mood == o.getMood() && this.gender == o.getGender() && this.location == o.getLocation()) {
            return true;
        }

    }

    @Override
    public String toString(){
        return "Это коротышка " + this.name + ", находится в " + this.location.getName() + ",в настроении " + this.mood.name;
    }
}
