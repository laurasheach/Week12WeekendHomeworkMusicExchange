import accessories.Accessory;
import accessories.DrumSticks;
import behaviours.ISell;
import instruments.Guitar;
import instruments.Instrument;

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

    public double getPotentialProfit() {
        double profit = 0;
        for(ISell stock : this.stock){
            profit += stock.calculateMarkup();
        }
        return profit;
    }

    public double addCashToTill(double sale){
        return this.till += sale;
    }

    public double removeCashFromTill(double purchase){
        return this.till -= purchase;
    }

    public void sellInstrumentItem(ISell stock){
        Instrument instrument = (Instrument) stock;
        removeItemFromStock(stock);
        addCashToTill(instrument.getSellingPrice());
    }

    public void sellAccessoryItem(ISell stock){
        Accessory accessory = (Accessory) stock;
        removeItemFromStock(stock);
        addCashToTill(accessory.getSellingPrice());
    }

    public void purchaseInstrument(ISell stock) {
        Instrument instrument = (Instrument) stock;
        addItemToStock(stock);
        removeCashFromTill(instrument.getPurchasePrice());
    }

    public void purchaseAccessory(ISell stock) {
        Accessory accessory = (Accessory) stock;
        addItemToStock(stock);
        removeCashFromTill(accessory.getPurchasePrice());
    }
}
