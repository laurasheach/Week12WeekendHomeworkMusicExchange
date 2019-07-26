package instruments;

import instruments.InstrumentType;
import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentType.STRING, "Wood", "Golden Brown", "Hidersine", "Nobile", 900.00, 1800.00, "Stradivari");
    }

    @Test
    public void canGetType() {
        assertEquals("Stradivari", violin.getType());
    }

    @Test
    public void canPlay() {
        assertEquals("Screeeeeech!", violin.play());
    }
}
