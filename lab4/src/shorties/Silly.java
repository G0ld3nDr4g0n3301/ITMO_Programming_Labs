package shorties;

import beds.Vegetable;
import beds.VegetableType;
import exceptions.StatisticsFailException;
import interfaces.Limpable;
import interfaces.Thoughtable;
import misc.Location;

public class Silly extends Shorty implements Limpable, Thoughtable {

    public Silly() {
        this.name = "Незнайка";
        this.location = Location.GARDEN;
    }

    public void shrug() {
        this.mood = Mood.PENSIVE;
        System.out.println(this.name);
        System.out.println("Пожал плечами(настроение: " + this.mood.getName() + ")");
    }

    @Override
    public void run() {
        if (this.getAcheState()) {
            System.out.println("Бежать не получится. Нога болит.");
            this.limp();
        } else {
            super.run();
        }
    }

    @Override
    public void walk() {
        if (this.getAcheState()) {
            System.out.println("Идти не получится.Нога болит.");
            this.limp();
        } else {
            super.walk();
        }
    }

    @Override
    public void limp() {
        this.currentSpeed = baseSpeed;
        System.out.println(this.name + " Хромает.");
        this.currentMovingStyle = MoveStyle.LIMP;
    }

    @Override
    public void think(Thought thought) throws StatisticsFailException{
        System.out.println(this.name + " задумался: ");
        switch (thought) {
            case THE_VEGETABLES_SIZE:

                Vegetable TomL = new Vegetable(VegetableType.LUNAR_TOMATO, 6, 50);
                Vegetable TomE = new Vegetable(VegetableType.EARTH_TOMATO, 6, 1);
                Vegetable CucL = new Vegetable(VegetableType.LUNAR_CUCUMBER, 6, 50);
                Vegetable CucE = new Vegetable(VegetableType.EARTH_CUCUMBER, 6, 1);

                float difference = (TomE.getVolume() / TomL.getVolume() + CucE.getVolume() / CucL.getVolume()) / 2;

                if (difference < 1) {
                    throw new StatisticsFailException("Ошибка статистики,лунные овощи больше земных");
                }

                System.out.println("Земные овощи в среднем в " + difference + " раз больше,чем лунные.");
                break;
            case PROGRAMMING_LABS:
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                System.out.println("ДЕДЛАЙНЫ");
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;

            case WATERING_THE_BEDS:
                this.setMood(Mood.ADMIRING);
                System.out.println(this.name + " любуется поливом грядок.");
        }
    }
}
