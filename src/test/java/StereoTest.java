import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StereoTest {

    Stereo stereo;

    @Before
    public void setUp() throws Exception {
        stereo = new Stereo("Panasonic");
    }

    @Test
    public void hasModel() {
        assertEquals("Panasonic", stereo.getModel());
    }


}