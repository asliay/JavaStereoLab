import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void setUp() {
        cdPlayer = new CDPlayer("Philips");
    }

    @Test
    public void hasModel() {
        assertEquals("Philips", cdPlayer.getModel());
    }

    @Test
    public void startsOff() {
        assertFalse(cdPlayer.isOnOrOff());
    }

    @Test
    public void canTurnOn() {
        cdPlayer.switchOn();
        assertTrue(cdPlayer.isOnOrOff());
    }

    @Test
    public void hasShuffleMode() {
        assertEquals("Shuffle mode is on", cdPlayer.shuffleMode());
    }

    @Test
    public void canConnectToStereo() {
        Stereo stereo = new Stereo("Sony");
        assertEquals("I am connected to Sony", cdPlayer.connect(stereo));
    }

    @Test
    public void canPlayPause() {
        assertEquals("Play/ Pause Logic Goes Here!", cdPlayer.playPause());
    }

    @Test
    public void canRewindAndForward() {
        assertEquals("You are either going back or forward!", cdPlayer.rewindFastForward());
    }
}
