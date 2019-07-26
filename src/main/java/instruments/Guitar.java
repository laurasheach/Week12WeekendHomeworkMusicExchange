package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;

    public Guitar(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice, int noOfStrings) {
        super(instumentType, material, colour, make, model, purchasePrice, sellingPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "Struuuuuum!";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
