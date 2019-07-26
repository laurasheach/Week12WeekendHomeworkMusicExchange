package accessories;

import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Classical", 2.00, 10.00);
    }

    @Test
    public void canGetType() {
        assertEquals("Classical", sheetMusic.getType());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(2.00, sheetMusic.getPurchasePrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(10.00, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(8.00, sheetMusic.calculateMarkup(), 0.01);
    }
}
