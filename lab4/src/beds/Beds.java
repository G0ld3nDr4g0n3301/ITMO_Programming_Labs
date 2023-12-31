package beds;

import misc.Location;

import watering.Hose;
import watering.Pump;
import watering.PumpWorker;
import watering.Water;

import exceptions.EmptyFieldException;

public class Beds {

    private int length;
    private int width;
    private Vegetable[][] cells;

    public Beds(int length, int width) throws EmptyFieldException {
        this.length = length;
        this.width = width;
        if (width == 0 || length == 0) {
            throw new EmptyFieldException("Нельзя создавать пустое поле");
        }

        this.cells = new Vegetable[length][width];
    }

    public Vegetable harvest(int x, int y) {
        Vegetable currentVegetable = cells[x][y];
        cells[x][y] = new Vegetable(cells[x][y].getType(), -1, 10);
        return currentVegetable;
    }

    public Vegetable getItem(int xCoord, int yCoord) {
        return this.cells[xCoord][yCoord];
    }

    public Vegetable[] getList(int coord){
        return this.cells[coord];
    }
    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void fillBeds(Vegetable vegetable) {
        Vegetable[] row = Vegetable.cloneVegetable(vegetable, this.width);

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                this.cells[i][j] = row[j];
            }
        }
    }

    public void waterBeds(int iteration_number, int waterVolume) {
        Water water = new Water(waterVolume);
        Pump pump = new Pump(Location.BEDS_FAR);
        
        PumpWorker pumpWorker1 = new PumpWorker(pump, Location.BEDS_FAR, false);
        PumpWorker pumpWorker2 = new PumpWorker(pump, Location.BEDS_FAR, true);
        
        pumpWorker1.work();
        pumpWorker2.work();
        
        Hose hose = new Hose(Location.BEDS_FAR);
        hose.applyToJob();

        for (int i = 0; i < iteration_number; i++) {
            pump.createPressure(water);
            hose.fire(water);
            for (int j = 0; j < this.length; j++) {
                for (int k = 0; k < this.width; k++) {
                    this.cells[j][k].increaseWaterLevel(0.1 * waterVolume);
                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        Beds o = (Beds) obj;
        if (o == this) {
            return true;
        }
        if (!(o instanceof Beds)) {
            return false;
        }
        o = (Beds) o;
        if (o.getLength() != this.length || o.getWidth() != this.width) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                if (this.cells[i][j] != o.cells[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += this.length * 13;
        hash += this.width * 17;
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                hash += (int) this.cells[i][j].getWaterLevel() * 23;
            }
        }
        return hash;
    }


    @Override
    public String toString() {
        return "Огород длиной в " + this.length + " и шириной в " + this.width;
    }

}
