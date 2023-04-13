package ss10_dsa.bai_tap.quanlisinhvien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("1. Thêm mới giảng viên và học sinh.");
        System.out.println("2. Xóa giảng viên và học sinh.");
        System.out.println("3. Xem danh sách giảng viên và học sinh.");
        System.out.println("4. Thoát.");
        Student student = new Student(1, "Ken", "1/1/1999", "nam", "C02", 15);
        System.out.println(student);
        if (number == 1) {
            Teacher teacher = new Teacher(1, "John", "2/2/1985", "nam", "C02", "a");
        }
    }
}
