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
    public Vegetable[][] cells;

    public Beds(int length, int width) {
        this.length = length;
        this.width = width;

        this.cells = new Vegetable[length][width];
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
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

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Beds)){
            return false;
        }
        o = (Beds) o;
        if (o.getLength() != this.length || o.getWidth() != this.width) {
            return false;
        }
        for (int i = 0; i < this.length; i++){
            for (int j = 0; j < this.width; j++){
                if (this.cells[i][j] != o.cells[i][j]){
                    return false;
                }
            }
        }
        return true;
        
    }

    @Override
    public int hashCode(){
        int hash = 0;
        hash += this.length * 13;
        hash += this.width * 17;
        for (int i = 0; i < this.length; i++){
            for (int j = 0; j < this.width; j++){
                hash += (int) this.cells[i][j].waterLevel * 23;
            }
        }
        return hash;
    }


    @Override
    public String toString(){
        return "Огород длиной в " + this.length + " и шириной в " + this.width;
    }

}
