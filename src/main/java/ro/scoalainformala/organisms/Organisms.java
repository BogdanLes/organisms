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

    public abstract void setConsume(String cons);

    public abstract void setBrethe(String bhr);

    public abstract void setSize(String sz);

    public abstract void setReproduction(String re);


}
