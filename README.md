# Lab 3 Programming

## Important Note:
Sometimes,my program can break the Dependency inversion Principle.That's because,at the moment,when i wrote this program, i haven't known that we can use interfaces as argument type. So,i hope that you would forgive me for that mistake.For now, i just don't have enough time to redact my code,because there are lots of other things to do.
## Packages

Now i will tell you about packages my program contains.
### interfaces
It's a package containing interfaces(pretty obvious, i think)
### misc
Some other classes, that can't be defined to anouther directories.
### beds
Contains only the Beds themselves, and Vegetable-related classes.
### shorties
Abstract class for Shorties, to inherited classes, and some Enums
### watering
Watering system classes, such as Worker,Pump, states of water, e.t.c.

## Classes

### interfaces.Moveable
Declarates methods of changing location(argument - enum Location.if something can move - it can change locations), getter for current object speed, getter for moving style(which must return a shories.MoveStyle enum) and stop() method,which initially, just stops the object. 
### interfaces.Limpable
limp() - (хромать). Inherit of Moveable interface. Lowers user speed

### interfaces.Runable
run()  Inherit of Moveable interface. Increases user speed.

### interfaces.Walkable
walk()  Inherit of Moveable interface. Standart speed.


### interfaces.Workable
work().Very different functionality, depends on child implementation. Mainly created for Worker classes.

### interfaces.Thoughtable
think(Thought) - takes an enum value, and starts internal processes.

### interfaces.Sniffable
sniff() - (сопеть). Just represents an action.Functionality depends on implementation.For my implementation in class Fix, just lowers mood(sets it to Mood.ANGRY)

### interfaces.CanCarry
declarates a getter and a setter for currently carried item.takes and returns CarryableItem abstract class inheritors. I decided not to add a carry() method,which would set the variable, because of incapsulation reasons. I don't think,that this method can be public.

### interfaces.CanBeCarried
carriedBy(Object) - setter for a "carrier" variable.

### interfaces.Acheable
ache() - just starts some inner reactions, if overrided

### misc.Broom
CarryableItem inheritor. Broom(int weight) does merely nothing.Sorry, my creativity turned off here.

### misc.CarryableItem
abstract class,which implenents CanBeCarried. Has protected Object carrier, which is set  by overrided carriedBy method. Also has a useless variable weight.Sorry.

### misc.Location
enum, has a 3 values, which have their own values(strings). There are 3 of them:
GARDEN, BEDS_FAR, BEDS_NEAR

### misc.Trap
has a location(enum Location) and a method damageLeg, which causes leg.ache();(if we need to expand our logic and create a trap,which damages a hand - we can add a new method here, the old one won't be affected). At the begginig I wanted to create an abstract class "BodyPart" and take it as an argument to method Damage, but i actually hadn't enought time that month,so i just ended up with this "temporary" solution.

### shorties.Shorty
An abstract class, parent class for all shorties(even for PumpWorkers, they're shorties too.).Implements CanCarry(shortie can carry a CarryableItem), Runable and Walkable(Limpable ain't included by default,because not every shortie will get their leg injured,so you must implement Limpable in your own inherited class). So shortie has a gender,which is set to MALE by default,because there is no females in my piece of tale. Also, every shortie has a leg,which is created automatically.I've created this field just to implement the logic of injuring a part of body, causing a problems with moving speed, so this field is a bit useless and it is a kind of crutch.
Also any shortie has a mood.

The implementation of hashCode in my class just multiplies the name length and current speed by some simple numbers,and uses the Gender modifier.

The implementation of equals is also simple:
hash comparing, then
isMyself test, then
hasTheSameClass test, then i've added a type casting, but it causes some issues when i'm trying to use javac. My code still compiles using IDEA or VS Code, but javac does ignore the "obj = (Shortie) obj;" string,and just tells me,that i'm stupid. I've googled,how to ignore compiling errors,but i haven't found anything useful.

And toString method prints the name, location, and current mood of shortie.


### shorties.Silly
The main character of the story,has unique ability: shrug()  (пожать плечами),which sets mood to PENSIVE (задумчивый).(i think that it was rather stupid move to make this ability unique for this shortie, but i'll just let it be as it is now)  
This class also implements Limpable and Thoughtable.
When he thinks about something, he's performing different actions,depending on a thought, and a logic, that is written in switch-case block,right after comparison of enum values.e.g. after silly.think(Thought.THE_VEGETABLES_SIZE); he will create a bunch of vegetables of different types,and then compare them and calculate the statistics.

If he'd be damaged by a trap, his leg will ache,and he wouldn't be able to run or walk,only to limp,

### shorties.Fix
The only difference between Fix and Shorty - the sniff() method. It prints the current mood.

### watering.Hose
Hose's(шланг,брандспойт) most interesting methods is applyToJob(HoseWorker),which compares the location of worker, and location of Hose itself.If they're similar - the person is applied.
And the second method is fire(Water) (there is a bit of meaning game here, but when i named it,i meant "to shoot something",not that fire,which is burning) this method changes Water state from RUNNING to FALLING.

### watering.Pump
Similar to Hose,but workers number can be set up to 2,and water state changing from STILL to RUNNING.Now i think,that i could have made an abstraction here... Just like "Working object" or "Working space" or smth like that

### watering.HoseWorker
implements Workable. Can't be created without it's working space.

### beds.Beds
Beds(грядки) have width and height, a fillBeds(Vegetable) method. and a special method for watering beds.Earlier i wished to make WaterSystem abstract class,which can water everythig,that implements a special method "canBeWatered"(только не надо эту фразу в переводчиках с отключённой цензурой переводить). But,unfortunately, i ran out of time.
Also this method overrides standard Object methods.(hashCode,equals,toString).



# The end.

That's it! If you know, how to ignore the javac compiler noncritical errors,please, tell me about it,because i can't figure out, how to run my code without changing it.I believe,that some option in javac like "-IgnoreNonCritical" exsists.Thank you for reading,goodbye!




















