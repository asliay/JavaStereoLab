public class RecordDeck extends Component {

    private int playSpeed;
    private boolean needleSetToStart;

    public RecordDeck(String model, int playSpeed) {
        super(model);
        this.playSpeed = playSpeed;
        this.needleSetToStart = false;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public boolean isNeedleSetToStart() {
        return needleSetToStart;
    }

    public void setNeedleSetToStart() {
        needleSetToStart = true;
    }

}
