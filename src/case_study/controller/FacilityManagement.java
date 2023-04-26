package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    public void facilityMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("-------------Facility Menu-------------\n" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n" +
                    "Mời bạn chọn chức năng: ");
            choice = input.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("4"));
    }
}
