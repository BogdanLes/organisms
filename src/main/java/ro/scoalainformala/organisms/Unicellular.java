package ro.scoalainformala.organisms;

public abstract class Unicellular extends Organisms {
    private String orgClass = "unicellular";

    public Unicellular(String un) {
        super(un);
    }

    public String getOrgClass() {
        return orgClass;
    }

}
