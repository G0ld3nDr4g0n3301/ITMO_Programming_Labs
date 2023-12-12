package beds;

import misc.Location;
import watering.Hose;
import watering.HoseWorker;
import watering.Pump;
import watering.PumpWorker;
import watering.Water;

public class Beds {
    
    private int length;
    private int width;
    private Vegetable[][] cells;

    public Beds(int length, int width) {
        this.length = length;
        this.width = width;

        this.cells = new Vegetable[length][width];
    }

    public void fillBeds(Vegetable vegetable) {
        Vegetable[] row = Vegetable.cloneVegetable(vegetable, this.width);
        for (int i = 0;i< length;i++) {
            for (int j = 0;j < width; j++) {
                this.cells[i][j] = row[j];
            }
        }
    }

    public void waterBeds(int iteration_number,int waterVolume) { 
        Water water = new Water(waterVolume);
        Pump pump = new Pump(Location.BEDS_FAR);
        PumpWorker pumpWorker1 = new PumpWorker(pump, Location.BEDS_FAR, false);
        PumpWorker pumpWorker2 = new PumpWorker(pump, Location.BEDS_FAR ,true);
        pumpWorker1.work();
        pumpWorker2.work();
        Hose hose = new Hose(Location.BEDS_FAR);
        HoseWorker worker = new HoseWorker(hose);
        worker.work();

        for (int i = 0; i < iteration_number; i++) {
            pump.createPressure(water);
            hose.fire(water);
            for (int j = 0;j< this.length;j++) {
                for (int k = 0;k< this.width;k++) {
                    this.cells[j][k].increaseWaterLevel(0.1*waterVolume);
                }
            }
        }
    }

}
