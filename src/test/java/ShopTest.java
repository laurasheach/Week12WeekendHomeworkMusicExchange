import accessories.Accessory;
import accessories.DrumSticks;
import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumSticks drumSticks;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Natural", "Yamaha", "F310", 75.00, 115.00, 6);
        drumSticks = new DrumSticks("Wood", 5.00, 10.00);
    }

    @Test
    public void canGetTillBalance() {
        assertEquals(1000.00, shop.getTill(), 0.01);
    }

    @Test
    public void stockStartsAt0() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumSticks);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumSticks);
        shop.removeItemFromStock(drumSticks);
        assertEquals(1, shop.getStockCount());
    }
}
