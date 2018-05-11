import item.instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Instrument;

import static org.junit.Assert.assertEquals;

public class GuitarTest{

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Guitar 1", 100.00, 200.00, 7);
    }

    @Test
    public void getNoOfStrings() {
        assertEquals(7, guitar.getNoOfStrings());
    }

    @Test
    public void playguitar() {
        assertEquals("Play Guitar", guitar.play());
    }
}
