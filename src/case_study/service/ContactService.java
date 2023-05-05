package case_study.service;

import case_study.model.Contract;
import case_study.repository.ContactRepository;
import case_study.ultils.BookingValidate;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ContactService implements IContactService {
    private ContactRepository contactRepository = new ContactRepository();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void dislay() {
        List<Contract> contractList = contactRepository.showCotract();
        for (Contract c : contractList) {
            System.out.println(c);
        }
    }

    //    số hợp đồng, mã booking, số tiền cọc trước, tổng số tiền thanh toán.
//int contractNumber, String idBooking, String reservationAmount, String totalPaymentAmount
    @Override
    public void addNewContract() {
        int contractNumber;
        do {
            System.out.print("Nhập số hợp đồng");
            contractNumber = Integer.parseInt(scanner.nextLine());
        } while (contractNumber < 0);

        String idBooking;
        do {
            System.out.print("Nhập mã booking");
            idBooking = scanner.nextLine();
        } while (!BookingValidate.checkBookingCode(idBooking));
        System.out.print("Nhập số tiền cọc trước");
        String reservationAmount = scanner.nextLine();

        System.out.print("Nhập số tiền thanh toán");
        String totalPaymentAmount = scanner.nextLine();
        Contract newcontract = new Contract(contractNumber, idBooking, reservationAmount, totalPaymentAmount);
        contactRepository.addNewContract(newcontract);
        System.out.println("Nhập thành công contract " + newcontract.getContractNumber());
    }

    @Override
    public void editContract() {
        System.out.println("Mời bạn nhập số hợp đồng cần sửa");
        int editContractNumber = scanner.nextInt();
        List<Contract> contracts = contactRepository.showCotract();
        int checkIdEdit = contactRepository.checkContract(editContractNumber);
        if (checkIdEdit >= 0) {
            boolean flag = true;
            Contract contract = contracts.get(checkIdEdit);
            do {
                System.out.print("Danh sách sửa\n" +
                        "1.Mã booking\n" +
                        "2.Số tiền cọc trước\n" +
                        "3.Số tiền thanh toán\n" +
                        "Mời bạn chọn mục muốn sửa:");
                String choiceedit = scanner.nextLine();
                switch (choiceedit) {
                    case "1":
                        String editIdBooking;
                        do {
                            System.out.print("Nhập mã booking");
                            editIdBooking = scanner.nextLine();
                            contract.setIdBooking(editIdBooking);
                        } while (!BookingValidate.checkBookingCode(editIdBooking));
                        break;
                    case "2":
                        System.out.print("Nhập số tiền cọc trước");
                        String reservationAmount = scanner.nextLine();
                        contract.setReservationAmount(reservationAmount);
                    case "3":
                        System.out.print("Nhập số tiền thanh toán");
                        String totalPaymentAmount = scanner.nextLine();
                        contract.setTotalPaymentAmount(totalPaymentAmount);
                }
            } while (flag);
            contactRepository.editContract(editContractNumber, contract);
        } else {
            System.out.println("Không tìm thấy hợp đồng");
        }
        this.dislay();
    }
}
