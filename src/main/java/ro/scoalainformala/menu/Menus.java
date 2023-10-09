package ro.scoalainformala.menu;

public class Menus {

    public static String createMenu() {
        return """
        Select:
                        
        1 Add organism
        2 List organisms
        3 Update organism
        4 Exit
                        
        Please select one of the available options ( 1 - 4 ):
        """;
    }

    public static String addOrganism() {
        return """
        Select:
                        
        1 Add Animal(multicellular)
        2 Add Plant(multicellular)
        3 Add Fungus(multicellular)
        4 Add Bacteria(unicellular)
        5 Add Protist(unicellular)
        6 Add Archaea(unicellular)
        7 Exit
                        
        Please select one of the available options ( 1 - 7 ):
        """;
    }

}
