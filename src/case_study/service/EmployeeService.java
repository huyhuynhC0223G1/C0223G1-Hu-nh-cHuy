package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService{
    Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void dislayStaff() {
        List<Employee> employeeList = employeeRepository.getEmployyeStaff();
        for (Employee s: employeeList){
            System.out.println(s);
        }
    }
//2.Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email, Trình độ, Vị trí, lương
    @Override
    public void addNewStaff() {
        System.out.println("Nhập id nhân viên:");
        String idStaff= scanner.nextLine();
        System.out.println("Nhập tên nhân viên:");
        String nameStaff= scanner.nextLine();
        System.out.println("Nhập ngày sinh nhân viên:");
        String dayOfBirthStaff= scanner.nextLine();
        System.out.println("Nhập giới tính nhân viên:");
        String gennerStaff= scanner.nextLine();
        System.out.println("Nhập số CMNH nhân viên:");
        String identityCardStaff= scanner.nextLine();
        System.out.println("Nhập số điện thoại nhân viên:");
        String numberphoneStaff= scanner.nextLine();
        System.out.println("Nhập email nhân viên:");
        String emailStaff= scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên:");
        String levelStaff= scanner.nextLine();
        System.out.println("Nhập vị trí nhân viên:");
        String locationStaff= scanner.nextLine();
        System.out.println("Nhập lương nhân viên:");
        String wageStaff= scanner.nextLine();
        Employee newemployee= new Employee(idStaff,nameStaff,dayOfBirthStaff, gennerStaff, identityCardStaff, numberphoneStaff, emailStaff, levelStaff, locationStaff, wageStaff);
        employeeRepository.addEmployyeStaff(newemployee);
        System.out.println("Thêm mới nhân viên thành công " + newemployee.getName());
    }

    @Override
    public void editStaff() {

    }
}
