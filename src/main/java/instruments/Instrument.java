package instruments;

public abstract class Instrument {

    private InstrumentType instumentType;
    private String material;
    private String colour;
    private String make;
    private String model;
    private double purchasePrice;
    private double sellingPrice;

    public Instrument(InstrumentType instumentType, String material, String colour, String make, String model, double purchasePrice, double sellingPrice){
        this.instumentType = instumentType;
        this.material = material;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstumentType() {
        return instumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
