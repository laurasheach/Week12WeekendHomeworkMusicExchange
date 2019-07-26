package accessories;

import behaviours.ISell;

public class DrumSticks extends Accessory implements ISell {


    public DrumSticks(String type, double purchasePrice, double sellingPrice) {
        super(type, purchasePrice, sellingPrice);
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
