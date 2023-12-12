package homework.phonefactory;

public class Motherboard {
    private final String vendorCode;
    private final int width;
    private final int height;
    private final int length;

    public Motherboard(String vendorCode, int width, int height, int length) {
        this.vendorCode = vendorCode;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Motherboard("
                + "'" + vendorCode + '\''
                + ", размер(" + width
                + "x" + height
                + "x" + length
                + "))";
    }
}
