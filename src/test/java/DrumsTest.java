import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, "Wood", "Wine Red", "Mirage", "Raven", 100.00, 199.00, 5);
    }

    @Test
    public void getNoOfDrums() {
        assertEquals(5, drums.getNoOfDrums());
    }

    @Test
    public void canPlay() {
        assertEquals("Boom. Tish!", drums.play());
    }
}
