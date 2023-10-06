package ro.scoalainformala.organisms;

public abstract class Multicellular extends Organisms {

    private String orgClass = "multicellular";

    public Multicellular(String mn) {
        super(mn);
    }

    public String getOrgClass() {
        return orgClass;
    }

}
