import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp() {
        radio = new Radio("Hitachi");
    }

    @Test
    public void hasModel() {
        assertEquals("Hitachi", radio.getModel());
    }

    @Test
    public void canTune() {
        String stationTune = radio.tune("Classic FM");
        assertEquals("Classic FM", stationTune);
    }

    @Test
    public void startsOff() {
        assertFalse(radio.isOnOrOff());
    }

    @Test
    public void canTurnOn() {
        radio.switchOn();
        assertTrue(radio.isOnOrOff());
    }

    @Test
    public void canConnectToStereo() {
        Stereo stereo = new Stereo("Sony");
        assertEquals("I am connected to Sony", radio.connect(stereo));
    }
}
