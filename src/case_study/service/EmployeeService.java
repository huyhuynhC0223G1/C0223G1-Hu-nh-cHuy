package case_study.service;

import case_study.controller.EmployeeManagement;
import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.ultils.EmployeeValidate;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void dislayStaff() {
        List<Employee> employeeList = employeeRepository.getEmployyeStaff();
        for (Employee s : employeeList) {
            System.out.println(s);
        }
    }

    //2.Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    @Override
    public void addNewStaff() {
        String idStaff = null;
        do {
            System.out.println("Nhập id nhân viên: NV-YYYY");
            idStaff = scanner.nextLine();
        } while (!EmployeeValidate.checkEmployeeId(idStaff));
        String nameStaff = null;
        do {
            System.out.println("Nhập tên nhân viên:");
            nameStaff = scanner.nextLine();
        } while (!EmployeeValidate.checkEmployeeName(nameStaff));

        System.out.println("Nhập ngày sinh nhân viên:");
        String dayOfBirthStaff = scanner.nextLine();

        System.out.println("Chọn giới tính nhân viên: \n" +
                "1. Nam\n" +
                "2. Nữ");
        String choice = scanner.nextLine();
        String genderStaff = null;
        if (choice.trim().equals("1")) {
            genderStaff = "Nam";
        } else if (choice.trim().equals("2")) {
            genderStaff = "Nữ";
        }
        String identityCardStaff = null;
        do {
            System.out.println("Nhập số CMNH nhân viên:");
            identityCardStaff = scanner.nextLine();
        } while (!EmployeeValidate.checkEmployeeIdentityCard(identityCardStaff));
        String numberphoneStaff = null;
        do {
            System.out.println("Nhập số điện thoại nhân viên:");
            numberphoneStaff = scanner.nextLine();
        } while (!EmployeeValidate.checkEmployeeNumberPhone(numberphoneStaff));

        System.out.println("Nhập email nhân viên:");
        String emailStaff = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên:\n" +
                "1.Trung cấp.\n" +
                "2.Cao đẳng.\n" +
                "3.Đại học\n" +
                "4.Sau đại học");

        String levelStaff = null;
        boolean flag = true;
        do {
            String choiceLevel = scanner.nextLine();
            switch (choiceLevel) {
                case "1":
                    flag = false;
                    levelStaff = "Trung cấp";
                    break;
                case "2":
                    flag = false;
                    levelStaff = "Cao đẳng";
                    break;
                case "3":
                    flag = false;
                    levelStaff = "Đại học";
                    break;
                case "4":
                    flag = false;
                    levelStaff = "Sau đại học";
                    break;
                default:
                    System.out.println("mời bạn chọn lại.");
            }
        } while (flag);

        System.out.println("Nhập vị trí nhân viên:\n" +
                "1.Lễ tân\n" +
                "2.Phục vụ\n" +
                "3.Chuyên viên\n" +
                "4.Giám sát\n" +
                "5.Quản lý\n" +
                "6.Giám đốc");
        String locationStaff = null;
        do {
            String choiceLocation = scanner.nextLine();
            switch (choiceLocation) {
                case "1":
                    flag = false;
                    locationStaff = "Lễ tân";
                    break;
                case "2":
                    flag = false;
                    locationStaff = "Phục vụ";
                    break;
                case "3":
                    flag = false;
                    locationStaff = "Chuyên viên";
                    break;
                case "4":
                    flag = false;
                    locationStaff = "Giám sát";
                    break;
                case "5":
                    flag = false;
                    locationStaff = "Quản lý";
                    break;
                case "6":
                    flag = false;
                    locationStaff = "Giám đốc";
                    break;
            }
        } while (flag);
        String wageStaff = null;
        do {
            System.out.println("Nhập lương nhân viên:");
            wageStaff = scanner.nextLine();
        } while (!EmployeeValidate.checkEmployeeWage(wageStaff));
        Employee newemployee = new Employee(idStaff, nameStaff, dayOfBirthStaff, genderStaff, identityCardStaff, numberphoneStaff, emailStaff, levelStaff, locationStaff, wageStaff);
        employeeRepository.addEmployyeStaff(newemployee);
        System.out.println("Thêm mới nhân viên thành công " + newemployee.getName());
    }

    @Override
    public void editStaff() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        System.out.println("Mời bạn nhập id cần sửa: NV-YYYY");
        String idStaff = scanner.nextLine();
        List<Employee> employees = employeeRepository.getEmployyeStaff();
        int size = employeeRepository.getEmployyeStaff().size();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i <= size; i++) {
            if (employeeRepository.checkEmployee(idStaff)) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            Employee employee = employees.get(index);
            System.out.println("Mời bạn chọn thông tin cần sửa:\n" +
                    "1.Tên nhân viên\n" +
                    "2.Ngày sinh nhân viên\n" +
                    "3.Giới tính nhân viên\n" +
                    "4.Số CMNH nhân viên\n" +
                    "5.Số điện thoại nhân viên\n" +
                    "6.Email nhân viên\n" +
                    "7.Trình độ nhân viên\n" +
                    "8.Vị trí nhân viên\n" +
                    "9.Lương nhân viên\n" +
                    "10.Exit\n");
            do {
                String choiedit = scanner.nextLine();
                switch (choiedit) {
                    case "1":
                        flag = false;
                        String editNameStaff = null;
                        do {
                            System.out.println("Nhập tên nhân viên:");
                            editNameStaff = scanner.nextLine();
                            employee.setName(editNameStaff);
                        } while (!EmployeeValidate.checkEmployeeName(editNameStaff));
                        break;
                    case "2":
                        flag = false;
                        System.out.println("Nhập ngày sinh nhân viên:");
                        String editDayOfBirthStaff = scanner.nextLine();
                        employee.setDayOfBirth(editDayOfBirthStaff);
                        break;
                    case "3":
                        flag = false;
                        System.out.println("Chọn giới tính nhân viên:\n" +
                                "1. Nam\n" +
                                "2. Nữ");
                        String choice = scanner.nextLine();
                        String editGenderStaff = null;
                        if (choice.trim().equals("1")) {
                            editGenderStaff = "Nam";
                        } else if (choice.trim().equals("2")) {
                            editGenderStaff = "Nữ";
                        }
                        employee.setGender(editGenderStaff);
                        break;
                    case "4":
                        flag = false;
                        String editIdentityCardStaff = null;
                        do {
                            System.out.println("Nhập số CMNH nhân viên:");
                            editIdentityCardStaff = scanner.nextLine();
                            employee.setIdentityCard(editIdentityCardStaff);
                        } while (!EmployeeValidate.checkEmployeeIdentityCard(editIdentityCardStaff));
                        break;
                    case "5":
                        flag = false;
                        String editNumberphoneStaff = null;
                        do {
                            System.out.println("Nhập số điện thoại nhân viên:");
                            editNumberphoneStaff = scanner.nextLine();
                            employee.setNumberPhone(editNumberphoneStaff);
                        } while (!EmployeeValidate.checkEmployeeNumberPhone(editNumberphoneStaff));
                        break;
                    case "6":
                        flag = false;
                        System.out.println("Nhập email nhân viên:");
                        String editEmailStaff = scanner.nextLine();
                        employee.setEmail(editEmailStaff);
                        break;
                    case "7":
                        flag = false;
                        System.out.println("Nhập trình độ nhân viên:\n" +
                                "1.Trung cấp.\n" +
                                "2.Cao đẳng.\n" +
                                "3.Đại học\n" +
                                "4.Sau đại học");

                        String editLevelStaff = null;
                        boolean flagedit = true;
                        do {
                            String choiceLevel = scanner.nextLine();
                            switch (choiceLevel) {
                                case "1":
                                    flagedit = false;
                                    editLevelStaff = "Trung cấp";
                                    break;
                                case "2":
                                    flagedit = false;
                                    editLevelStaff = "Cao đẳng";
                                    break;
                                case "3":
                                    flagedit = false;
                                    editLevelStaff = "Đại học";
                                    break;
                                case "4":
                                    flagedit = false;
                                    editLevelStaff = "Sau đại học";
                                    break;
                                default:
                                    System.out.println("mời bạn chọn lại.");
                            }
                        } while (flagedit);
                        employee.setLevel(editLevelStaff);
                        break;
                    case "8":
                        flag = false;
                        boolean flageditloca = true;
                        System.out.println("Nhập vị trí nhân viên:\n" +
                                "1.Lễ tân\n" +
                                "2.Phục vụ\n" +
                                "3.Chuyên viên\n" +
                                "4.Giám sát\n" +
                                "5.Quản lý\n" +
                                "6.Giám đốc");
                        String editLocationStaff = null;
                        do {
                            String choiceLocation = scanner.nextLine();
                            switch (choiceLocation) {
                                case "1":
                                    flageditloca = false;
                                    editLocationStaff = "Lễ tân";
                                    break;
                                case "2":
                                    flageditloca = false;
                                    editLocationStaff = "Phục vụ";
                                    break;
                                case "3":
                                    flageditloca = false;
                                    editLocationStaff = "Chuyên viên";
                                    break;
                                case "4":
                                    flageditloca = false;
                                    editLocationStaff = "Giám sát";
                                    break;
                                case "5":
                                    flageditloca = false;
                                    editLocationStaff = "Quản lý";
                                    break;
                                case "6":
                                    flageditloca = false;
                                    editLocationStaff = "Giám đốc";
                                    break;
                                default:
                                    System.out.println("Mời bạn chọn lại.");
                            }
                        } while (flageditloca);
                        employee.setLocation(editLocationStaff);
                        break;
                    case "9":
                        flag = false;
                        String editWageStaff = null;
                        do {
                            System.out.println("Nhập lương nhân viên:");
                            editWageStaff = scanner.nextLine();
                        } while (!EmployeeValidate.checkEmployeeWage(editWageStaff));
                        employee.setWage(editWageStaff);
                        break;
                    case "10":
                        flag = true;
                        employeeManagement.employeeMenu();
                        break;
                }
            } while (flag);
            employeeRepository.editEmployeeStaff(idStaff, employee);
        } else {
            System.out.println("Không tìm thấy nhân viên cần sửa");
        }

        this.dislayStaff();
    }
}


