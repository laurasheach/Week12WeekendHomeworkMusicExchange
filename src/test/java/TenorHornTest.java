import instruments.InstrumentType;
import instruments.TenorHorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TenorHornTest {

    TenorHorn tenorHorn;

    @Before
    public void before(){
        tenorHorn = new TenorHorn(InstrumentType.BRASS, "Brass", "Rose", "Coppergate", "Intermediate", 125.00, 250.00, 3);
    }

    @Test
    public void canGetValves() {
        assertEquals(3, tenorHorn.getValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Toot toot!", tenorHorn.play());
    }
}
