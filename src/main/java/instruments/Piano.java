package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String style;

    public Piano(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice, String style) {
        super(instumentType, material, colour, make, model, purchasePrice, sellingPrice);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public String play() {
        return "Plonkity plonk!";
    }
}
