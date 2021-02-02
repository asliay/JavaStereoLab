public class CassettePlayer extends Component implements IPlayPauseRewindForward{

    public CassettePlayer(String model) {
        super(model);
    }

    public String makeMixTape() {
        return "Great mixtape!";
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
