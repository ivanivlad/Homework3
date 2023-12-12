package homework.tree;

public abstract class Deciduous extends Tree {
    private boolean hasLeaves;

    public Deciduous(int age) {
        super(age);
        hasLeaves = false;
    }

    public void flowering() {
        hasLeaves = true;
        System.out.println("цвету и листья появились");
    }

    public void fallLeaves() {
        hasLeaves = false;
        System.out.println("листья опали");
    }

    public boolean isHasLeaves() {

        return hasLeaves;
    }
}
