package accessories;

import behaviours.ISell;

public class Accessory implements ISell {

    private String type;
    private double purchasePrice;
    private double sellingPrice;

    public Accessory(String type, double purchasePrice, double sellingPrice){
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return this.sellingPrice -= this.purchasePrice;
    }
}
