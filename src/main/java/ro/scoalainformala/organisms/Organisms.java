package ro.scoalainformala.organisms;

public abstract class Organisms {
    private String groupName;

    public Organisms(String on) {
        groupName = on;
    }

    public String getGroupName() {
        return groupName;
    }

    public abstract void move();

}
