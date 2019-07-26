package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    private int noOfDrums;

    public Drums(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice, int noOfDrums) {
        super(instumentType, material, colour, make, model, purchasePrice, sellingPrice);
        this.noOfDrums = noOfDrums;
    }

    public int getNoOfDrums() {
        return noOfDrums;
    }

    public String play() {
        return "Boom. Tish!";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
