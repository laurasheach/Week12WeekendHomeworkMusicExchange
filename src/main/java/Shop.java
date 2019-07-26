import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private double till;
    private ArrayList<ISell> stock;

    public Shop(){
        this.till = 1000.00;
        this.stock = new ArrayList<ISell>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }
}
