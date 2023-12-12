package homework.phonefactory;

public abstract class Phone {
    private final String model;
    private OsType osType;
    private Motherboard motherboard;
    private Camera camera;

    public Phone(String model) {
        this.model = model;
    }

    public void installMotherBoard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void installCamera(Camera camera) {
        this.camera = camera;
    }

    public void installOs(OsType os) {
        this.osType = os;
    }

    @Override
    public String toString() {
        return "Model:" + model + "\n"
                + osType + "\n"
                + motherboard + "\n"
                + camera;
    }
}
