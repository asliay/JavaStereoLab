import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setUp() throws Exception {
       recordDeck = new RecordDeck("Sony", 33);
    }

    @Test
    public void hasPlaySpeed() {
        assertEquals(33, recordDeck.getPlaySpeed());
    }

    @Test
    public void needleStartsFalse() {
        assertFalse(recordDeck.isNeedleSetToStart());
    }

    @Test
    public void setNeedleSetToStart() {
        recordDeck.setNeedleSetToStart();
        assertTrue(recordDeck.isNeedleSetToStart());
    }

    @Test
    public void canConnectToStereo() {
        Stereo stereo = new Stereo("Sony");
        assertEquals("I am connected to Sony", recordDeck.connect(stereo));
    }
}