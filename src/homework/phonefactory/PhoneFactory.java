package homework.phonefactory;

public class PhoneFactory {
    public void assemble(Samsung phone) {
        phone.installMotherBoard(new Motherboard("j-108",  10, 12, 13));
        phone.installCamera(new Camera("Samsung", 20));
        phone.installOs(OsType.ANDROID);
    }

    public void assemble(Iphone phone) {
        phone.installMotherBoard(new Motherboard("7uik",  15, 12, 13));
        phone.installCamera(new Camera("iphone", 15, true));
        phone.installOs(OsType.IOS);
    }
}
