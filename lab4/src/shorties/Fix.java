
package shorties;
import interfaces.Sniffable;

public class Fix extends Shorty implements Sniffable{

    public Fix(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
    }
 
    @Override
    public void sniff() {
        System.out.println(this.name + " сопит, он сейчас " + this.mood.name);
    }
}
