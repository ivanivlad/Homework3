package homework.phonefactory;

public enum OsType {
    ANDROID("Android"), IOS("iOs");
    private final String presentation;

    OsType(String presentation) {
        this.presentation = presentation;
    }

    @Override
    public String toString() {
        return presentation;
    }
}
