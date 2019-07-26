import accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Guitar Strings", 3.00, 6.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Guitar Strings", accessory.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(3.00, accessory.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(6.00, accessory.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.00, accessory.calculateMarkup(),0.01);
    }
}
