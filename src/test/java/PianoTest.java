import enums.InstrumentType;
import item.instrument.Guitar;
import item.instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Piano 1", 100.00, 200.00, 48);
    }

    @Test
    public void getNoOfKeys() {
        assertEquals(48, piano.getnoOfKeys());
    }

    @Test
    public void playPiano() {
        assertEquals("Play Piano", piano.play());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

}
