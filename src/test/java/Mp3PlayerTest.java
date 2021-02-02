import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Mp3PlayerTest {

    Mp3Player ipod;

    @Before
    public void setUp() throws Exception {
       ipod = new Mp3Player("Apple", 1);
    }

    @Test
    public void getModel() {
        assertEquals("Apple", ipod.getModel());
    }

    @Test
    public void getBattery() {
        assertEquals(1, ipod.getBattery());
    }

    @Test
    public void connect() {
        Stereo stereo = new Stereo("Sony");
        assertEquals("I am connected to Sony", ipod.connect(stereo));
    }
}