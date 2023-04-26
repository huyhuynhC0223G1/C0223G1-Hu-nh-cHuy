package case_study.controller;

import java.util.Scanner;

public class CustomerManagement {
    public void costomerMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.println("-------------Costomer Menu-------------\n" +
                    "1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
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
