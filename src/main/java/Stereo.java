public class Stereo {

    private String model;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private CassettePlayer cassettePlayer;

    public Stereo(String model) {
        this.model = model;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.cassettePlayer = cassettePlayer;
    }


    public String getModel() {
        return this.model;
    }

}
