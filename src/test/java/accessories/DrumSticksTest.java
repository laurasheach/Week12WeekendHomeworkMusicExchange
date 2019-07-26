package accessories;

import accessories.Accessory;
import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Wood", 5.00, 10.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Wood", drumSticks.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(5.00, drumSticks.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(10.00, drumSticks.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, drumSticks.calculateMarkup(),0.01);
    }
}
