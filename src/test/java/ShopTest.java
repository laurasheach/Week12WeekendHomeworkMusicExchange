import accessories.Accessory;
import accessories.DrumSticks;
import accessories.SheetMusic;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    DrumSticks drumSticks;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(InstrumentType.STRING, "Wood", "Natural", "Yamaha", "F310", 75.00, 115.00, 6);
        piano = new Piano(InstrumentType.PERCUSSION, "Wood", "Black", "Weinberg", "G55", 1250.00, 2995.00, "Baby Grand");
        drumSticks = new DrumSticks("Wood", 5.00, 10.00);
        sheetMusic = new SheetMusic("Classical", 2.00, 10.00);
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

    @Test
    public void canCalculatePotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(drumSticks);
        shop.addItemToStock(sheetMusic);
        assertEquals(1798, shop.getPotentialProfit(), 0.01);
    }

    @Test
    public void canAddSaleToTill() {
        shop.addCashToTill(guitar.getSellingPrice());
        assertEquals(1115, shop.getTill(), 0.01);
    }

    @Test
    public void canRemoveCashFromTill() {
        shop.removeCashFromTill(sheetMusic.getPurchasePrice());
        assertEquals(998, shop.getTill(), 0.01);
    }

    @Test
    public void canSellInstrumentItem() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.sellInstrumentItem(piano);
        assertEquals(1, shop.getStockCount());
        assertEquals(3995, shop.getTill(), 0.01);
    }

    @Test
    public void canSellAccessoryItem() {
        shop.addItemToStock(sheetMusic);
        shop.addItemToStock(drumSticks);
        shop.sellAccessoryItem(sheetMusic);
        assertEquals(1, shop.getStockCount());
        assertEquals(1010, shop.getTill(), 0.01);
    }

    @Test
    public void canPurchaseInstrumentItem() {
        shop.purchaseInstrument(guitar);
        assertEquals(1, shop.getStockCount());
        assertEquals(925, shop.getTill(), 0.01);
    }

    @Test
    public void canPurchaseAccessoryItem() {
        shop.purchaseAccessory(drumSticks);
        assertEquals(1, shop.getStockCount());
        assertEquals(995, shop.getTill(), 0.01);
    }
}
