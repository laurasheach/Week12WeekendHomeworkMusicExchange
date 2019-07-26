package instruments;

import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.PERCUSSION, "Wood", "Black", "Weinberg", "G55", 1250.00, 2995.00, "Baby Grand");
    }

    @Test
    public void canGetStyle() {
        assertEquals("Baby Grand", piano.getStyle());
    }

    @Test
    public void canPlay() {
        assertEquals("Plonkity plonk!", piano.play());
    }
}
