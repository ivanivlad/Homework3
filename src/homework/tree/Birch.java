package homework.tree;

public class Birch extends Deciduous {
    public Birch(int age) {
        super(age);
    }

    @Override
    public void flowering() {
        super.flowering();
        System.out.println("источаю аллергены");
    }
}
