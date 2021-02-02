import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CassettePlayerTest {

    CassettePlayer cassettePlayer;

    @Before
    public void setUp() throws Exception {
        cassettePlayer = new CassettePlayer("Coomber");
    }

    @Test
    public void getModel() {
        assertEquals("Coomber", cassettePlayer.getModel());
    }

    @Test
    public void startsOff() {
        assertFalse(cassettePlayer.isOnOrOff());
    }

    @Test
    public void canTurnOn() {
        cassettePlayer.switchOn();
        assertTrue(cassettePlayer.isOnOrOff());
    }

    @Test
    public void canCreateMixTape() {
        assertEquals("Great mixtape!", cassettePlayer.makeMixTape());
    }

    @Test
    public void canConnectToStereo() {
        Stereo stereo = new Stereo("Sony");
        assertEquals("I am connected to Sony", cassettePlayer.connect(stereo));
    }

    @Test
    public void canPlayPause() {
        assertEquals("Play/ Pause Logic Goes Here!", cassettePlayer.playPause());
    }

    @Test
    public void canRewindAndForward() {
        assertEquals("You are either going back or forward!", cassettePlayer.rewindFastForward());
    }
}