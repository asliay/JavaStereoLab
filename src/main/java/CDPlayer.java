public class CDPlayer extends Component implements IPlayPauseRewindForward{

    public CDPlayer(String model) {
        super(model);
    }

    public String shuffleMode() {
        return "Shuffle mode is on";
    }

    @Override
    public String playPause() {
        return "Play/ Pause Logic Goes Here!";
    }

    @Override
    public String rewindFastForward() {
        return "You are either going back or forward!";
    }
}
