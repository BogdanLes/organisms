package ro.scoalainformala.organisms;

import java.util.Objects;

public class Funghi extends Multicellular {

    private String consume = "carbon and nitrogen";
    private String breathe = "oxigen";

    public Funghi(String aName) {
        super(aName);
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String sc) {
        consume = sc;
    }

    public String getBrethe() {
        return breathe;
    }

    public void setBrethe(String sb) {
        breathe = sb;
    }

    public void move() {
        System.out.println(getGroupName() + " can not move.");
    }

    @Override
    public String toString() {
        return """
                \nGroup name: """ + getGroupName() + """
                \nClass:  """ + getOrgClass() + """
                \nConsumes: """ + consume + """
                \nBreathes: """ + breathe + """
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
        if (obj instanceof Funghi) {
            Funghi other = (Funghi) obj;
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

    public void setSize(String sz) {
    }

    public void setReproduction(String re) {
    }

}
