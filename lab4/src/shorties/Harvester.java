package shorties;


import beds.Beds;
import beds.VegetableStages;
import exceptions.BasketVolumeExceededException;
import interfaces.Crowlable;
import interfaces.Workable;
import misc.Basket;
import misc.Location;
import beds.Vegetable;
import beds.VegetableType;

public class Harvester extends Shorty implements Workable, Crowlable {
    private Basket basket;
    // Поля,на которых он работает
    private Beds fields;
    private int numberOfVegetablesToHarvest = 0;

    public Harvester(Basket basket, Beds beds, String name, Location location) {
        this.basket = basket;
        this.fields = beds;
        this.name = name;
        this.location = location;
        this.basket.carriedBy(this);
    }

    public void setWorkIterationsNumber(int iters) {
        this.numberOfVegetablesToHarvest = iters;
    }


    @Override
    public void crawl() {
        this.setMovingStyle(MoveStyle.CRAWL);
        System.out.println(this.name + " Крадэтса як мишь!");
    }

    @Override
    public void work(){
        this.crawl();
        int currentCell = 0;
        for (int i = 0; i < this.numberOfVegetablesToHarvest; i++) {
            int xCoord = currentCell / this.fields.getList(0).length;
            int yCoord = currentCell % this.fields.getList(0).length;
            if (this.fields.getItem(xCoord,yCoord).getStage() == VegetableStages.GROW_MAX) {
                try {
                    this.basket.put(currentCell, this.fields.harvest(xCoord, yCoord));
                } catch (BasketVolumeExceededException bvee) {
                    System.out.println(bvee.getMessage());
                    // Опустошаем корзину. Просто чтобы не повадно было.
                    for (int j = 0; j < this.basket.getBasketCells().length;j++){
                        this.basket.put(j, null);
                    }
                    bvee.printStackTrace();
                    break;

                }
            }
            currentCell++;
        }
    }

}
