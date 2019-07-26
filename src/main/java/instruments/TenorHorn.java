package instruments;

import behaviours.IPlay;

public class TenorHorn extends Instrument implements IPlay {

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
}
