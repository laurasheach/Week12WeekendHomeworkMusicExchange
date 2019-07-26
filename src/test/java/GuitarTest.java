import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Natural", "Yamaha", "F310", 75.00, 115.00, 6);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstumentType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Natural", guitar.getColour());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("F310", guitar.getModel());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(75, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(115, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Struuuuuum!", guitar.play());
    }
}
