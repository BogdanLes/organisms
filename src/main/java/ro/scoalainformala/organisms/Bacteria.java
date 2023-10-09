package ro.scoalainformala.organisms;

import java.util.Objects;

public class Bacteria extends Unicellular {

    private String size = "smaller than 1mm";
    private String reproduction = "cell division";

    public Bacteria(String aName) {
        super(aName);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String sc) {
        size = sc;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String sb) {
        reproduction = sb;
    }

    public void move() {
        System.out.println(getGroupName() + " can move locally.");
    }

    @Override
    public String toString() {
        return """
                \nGroup name: """ + getGroupName() + """
                \nClass:  """ + getOrgClass() + """
                \nSize: """ + size + """
                \nReproduction: """ + reproduction + """
                """;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Bacteria) {
            Bacteria other = (Bacteria) obj;
            if (this.getGroupName().toLowerCase().equals(other.getGroupName().toLowerCase())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroupName());
    }

    public void setConsume(String cons) {
    }

    public void setBrethe(String bhr) {
    }

}
