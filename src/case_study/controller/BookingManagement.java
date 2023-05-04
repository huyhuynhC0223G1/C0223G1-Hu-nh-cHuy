package case_study.controller;

import java.util.Scanner;

public class BookingManagement {
    public void bookingMenu() {
        Scanner input = new Scanner(System.in);
        String choice = "0";
        do {
            System.out.print("-------------Booking Menu-------------\n" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new contracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n" +
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
                case "5":
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Bạn chon sai chức năng.");
            }
        } while (!choice.equals("6"));
    }
}

