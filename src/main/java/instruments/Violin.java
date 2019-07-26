package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Violin extends Instrument implements IPlay, ISell {

    private String type;

    public Violin(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice, String type) {
        super(instumentType, material, colour, make, model, purchasePrice, sellingPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "Screeeeeech!";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
