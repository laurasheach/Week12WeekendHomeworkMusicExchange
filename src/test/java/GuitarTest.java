import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, "wood", "natural", "Yamaha", "F310", 75, 115, 6);
    }



}
