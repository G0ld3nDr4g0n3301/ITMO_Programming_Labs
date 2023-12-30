import beds.Beds;
import beds.Vegetable;
import beds.VegetableType;

import exceptions.StatisticsFailException;
import interfaces.Damageable;
import java.util.Scanner;

import misc.Basket;
import misc.Form;
import misc.Location;


import shorties.Harvester;
import shorties.Fix;
import shorties.Silly;
import shorties.Mood;
import shorties.Thought;
import shorties.Shorty;


public class Main {
    public static void main(String[] args) throws StatisticsFailException {

        Silly silly = new Silly();
        silly.shrug();
        Damageable trap = new Damageable() {
            private Location location = Location.GARDEN;

            @Override
            public void damageHuman(Shorty shorty){
                if (this.location == shorty.getLocation()) {
                    System.out.println("Капкан травмировал " + shorty.getName());
                    shorty.gotDamaged();   
                }
            }
        };

        trap.damageHuman(silly);
        silly.run();

        Fix fix = new Fix("Фикс", Mood.ANGRY);
        fix.takeBroom();
        fix.takeBroom();
        fix.walk();
        fix.sniff();

        silly.changeLocation(Location.BEDS_NEAR);
        fix.changeLocation(Location.BEDS_NEAR);

        try {
            silly.think(Thought.THE_VEGETABLES_SIZE);
        } catch (StatisticsFailException sfe) {
            System.out.println(sfe.getMessage());
            silly.setMood(Mood.ASTONISHED);
        }
        System.out.println(silly);

        silly.think(Thought.WATERING_THE_BEDS);

        Beds beds = new Beds(10, 5);
        Vegetable test_vegetable = new Vegetable(VegetableType.LUNAR_CUCUMBER, 0.5, 12);
        beds.fillBeds(test_vegetable);
        beds.waterBeds(3, 5);

        System.out.println(silly);
        System.out.println(fix);
        System.out.println(silly.hashCode() + fix.hashCode());

        Beds strawberry_beds = new Beds(6, 4);
        Vegetable strawberry = new Vegetable(VegetableType.LUNAR_STRAWBERRY, 4, 10);
        strawberry_beds.fillBeds(strawberry);

        Basket basket = new Basket(Form.ROUND, 6);
        Harvester nick = new Harvester(basket, strawberry_beds, "Nick", Location.BEDS_STRAWBERRY);
 
        System.out.println("Введите число клубник,которые рабочий соберет в корзину: ");
        Scanner input = new Scanner(System.in);
        int workIters = input.nextInt();
        input.close();

        nick.setWorkIterationsNumber(workIters);
        nick.work();
        
        for (Vegetable i : basket.getBasketCells()) {
            System.out.println(i);
        }

        //Beds test = new Beds(0,0);

    }
}