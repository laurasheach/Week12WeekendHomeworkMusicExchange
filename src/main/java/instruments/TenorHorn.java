package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class TenorHorn extends Instrument implements IPlay, ISell {

    private int valves;

    public TenorHorn(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice, int valves) {
        super(instumentType, material, colour, make, model, purchasePrice, sellingPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play() {
        return "Toot toot!";
    }

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
