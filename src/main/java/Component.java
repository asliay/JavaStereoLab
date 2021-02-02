public abstract class Component implements IConnect {

    private String model;
    private boolean onOrOff;

    public Component(String model) {
        this.model = model;
        this.onOrOff = false;
    }

    public void switchOn() {
        this.onOrOff = true;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isOnOrOff() {
        return this.onOrOff;
    }

    @Override
    public String connect(Stereo stereo) {
        return "I am connected to " + stereo.getModel();
    }
}
