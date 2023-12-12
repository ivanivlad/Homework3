package homework.phonefactory;

public class Camera {
    private final String vendorCode;
    private final int zoom;
    private final boolean hasFlash;

    public Camera(String vendorCode, int zoom, boolean hasFlash) {
        this.vendorCode = vendorCode;
        this.zoom = zoom;
        this.hasFlash = hasFlash;
    }

    public Camera(String vendorCode, int zoom) {
        this.vendorCode = vendorCode;
        this.zoom = zoom;
        this.hasFlash = false;
    }

    @Override
    public String toString() {
        return "Camera("
                + "'" + vendorCode + '\''
                + ", " + zoom + "x"
                + (hasFlash ? " есть вспышка" : "")
                + ')';
    }
}
