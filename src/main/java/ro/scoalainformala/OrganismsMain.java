package ro.scoalainformala;

import java.util.Scanner;

import ro.scoalainformala.menu.Menus;
import ro.scoalainformala.organisms.*;

public class OrganismsMain {
    public static void main(String[] args) {

        int i = 0;
        //database
        int k = 18; // the number of records in the database max 25
        Organisms[] org = new Organisms[25];
        org[0] = new Animals("Dog");
        org[1] = new Animals("Cat");
        org[2] = new Animals("Snake");
        org[3] = new Plants("Rose");
        org[4] = new Plants("Oak");
        org[5] = new Plants("Tulip");
        org[6] = new Funghi("Penny Bun");
        org[7] = new Funghi("Agaricus");
        org[8] = new Funghi("Chanterelle");
        org[9] = new Bacteria("Bacillus");
        org[10] = new Bacteria("Vibrio");
        org[11] = new Bacteria("Brucella");
        org[12] = new Protist("Forams");
        org[13] = new Protist("Radiolaria");
        org[14] = new Protist("Kombu");
        org[15] = new Archaea("Euryarchaeota");
        org[16] = new Archaea("Lokiarchaeota");
        org[17] = new Archaea("Proteoarchaeota");


        String item = "0";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(Menus.createMenu());
            item = s.nextLine();

            if ("1".equals(item)) {
                //Add organism
                String selOrg = "0";
                do {
                    System.out.print(Menus.addOrganism());
                    selOrg = s.nextLine();
                    String newName = "Organism";
                    if ("1".equals(selOrg) || "2".equals(selOrg) || "3".equals(selOrg) || "4".equals(selOrg) || "5".equals(selOrg) || "6".equals(selOrg)) {
                        System.out.print("Enter the name of the organism: ");
                        newName = s.nextLine();
                        k++;
                    }

                    if ("1".equals(selOrg)) {
                        org[k - 1] = new Animals(newName);
                        String consume = "organic matter";
                        String breathe = "oxigen";
                        String v = "";
                        System.out.print("Enter what the organism consumes(default: organic matter): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setConsume(v);
                        }
                        System.out.print("Enter what the organism breathes(default: oxigen): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setBrethe(v);
                        }
                    } else if ("2".equals(selOrg)) {
                        org[k - 1] = new Plants(newName);
                        String consume = "sunlight and nutrients";
                        String breathe = "carbon dioxide";
                        String v = "";
                        System.out.print("Enter what the organism consumes(default: sunlight and nutrients): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setConsume(v);
                        }
                        System.out.print("Enter what the organism breathes(default: carbon dioxide): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setBrethe(v);
                        }
                    } else if ("3".equals(selOrg)) {
                        org[k - 1] = new Funghi(newName);
                        String consume = "carbon and nitrogen";
                        String breathe = "oxigen";
                        String v = "";
                        System.out.print("Enter what the organism consumes(default: carbon and nitrogen): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setConsume(v);
                        }
                        System.out.print("Enter what the organism breathes(default: oxigen): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setBrethe(v);
                        }
                    } else if ("4".equals(selOrg)) {
                        org[k - 1] = new Bacteria(newName);
                        String size = "smaller than 1mm";
                        String breed = "cell division";
                        String v = "";
                        System.out.print("Enter the size of the organism(default: smaller than 1mm): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setSize(v);
                        }
                        System.out.print("Enter how the organism breeds(default: cell division): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setReproduction(v);
                        }
                    } else if ("5".equals(selOrg)) {
                        org[k - 1] = new Protist(newName);
                        String size = "smaller than 1mm";
                        String breed = "sexualy/asexualy";
                        String v = "";
                        System.out.print("Enter the size of the organism(default: smaller than 1mm): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setSize(v);
                        }
                        System.out.print("Enter how the organism breeds(default: sexualy/asexualy): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setReproduction(v);
                        }
                    } else if ("6".equals(selOrg)) {
                        org[k - 1] = new Archaea(newName);
                        String size = "smaller than 1mm";
                        String breed = "cell division";
                        String v = "";
                        System.out.print("Enter the size of the organism(default: smaller than 1mm): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setSize(v);
                        }
                        System.out.print("Enter how the organism breeds(default: cell division): ");
                        v = s.nextLine();
                        if (v.length() > 0) {
                            org[k - 1].setReproduction(v);
                        }
                    } else if ("7".equals(selOrg)) {
                        System.out.println("Process aborted!");
                    } else {
                        System.out.println("Wrong option!");
                    }
                } while (!"7".equals(selOrg));

            } else if ("2".equals(item)) {
                //list organisms
                for (i = 0; i < k; i++) {
                    System.out.print(org[i].toString() + "\n");
                    org[i].move();
                }

            } else if ("3".equals(item)) {
                //update organism

            } else if ("4".equals(item)) {
                System.out.println("Goodby!");
            } else {
                System.out.println("Wrong option!");
            }

        } while (!"4".equals(item));
    }
}
/*
1 Add organism
        2 List organisms
        3 Update organism
        4 Exit
          */