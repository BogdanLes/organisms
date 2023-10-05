package ro.scoalainformala;

import java.util.Scanner;
import ro.scoalainformala.menu.Menus;


public class OrganismsMain {
    public static void main(String[] args) {
            String item = "0";
            Scanner s = new Scanner(System.in);
            do {
                System.out.print(Menus.createMenu());


            }while(!"4".equals(item));
        }
}