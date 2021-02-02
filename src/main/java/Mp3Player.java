public class Mp3Player implements IConnect {

    private String model;
    private int battery;

    public Mp3Player(String model, int battery) {
        this.model = model;
        this.battery = battery;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public String connect(Stereo stereo) {
        return "I am connected to " + stereo.getModel();
    }

}
