package ro.scoalainformala;

import java.util.Scanner;
import ro.scoalainformala.menu.Menus;
import ro.scoalainformala.organisms.*;

public class OrganismsMain {
    public static void main(String[] args) {

        int i = 0;
        //database
        int k = 3; // the number of records in the database max 25
        Organisms[] org = new Organisms[25];
        org[0] = new Animals("Dog");
        org[1] = new Animals("Cat");
        org[2] = new Animals("Snake");


        String item = "0";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print(Menus.createMenu());
            item = s.nextLine();

            if("1".equals(item)) {
                //Add organism

            } else if("2".equals(item)) {
                //list organisms
                for(i = 0; i < k; i++) {
                    System.out.print(org[i].toString() + "\n");
                    org[i].move();
                }

            } else if("3".equals(item)) {
                //update organism

            } else if("4".equals(item)) {
                System.out.println("Goodby!");
            } else {
                System.out.println("Wrong option!");
            }

        }while(!"4".equals(item));
    }
}
/*
1 Add organism
        2 List organisms
        3 Update organism
        4 Exit
          */