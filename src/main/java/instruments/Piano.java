package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

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

    public double calculateMarkup() {
        return getSellingPrice() - getPurchasePrice();
    }
}
