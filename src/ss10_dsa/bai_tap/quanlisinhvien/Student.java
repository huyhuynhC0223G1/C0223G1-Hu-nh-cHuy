package ss10_dsa.bai_tap.quanlisinhvien;

import java.util.Date;

public class Student extends Person {
    private int point;
    public Student(int id, String name, String dayOfBirth, String gender, String classes, int point) {
        super(id, name, dayOfBirth, gender, classes);
        this.point=point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student" +
                "id=" + id +
                ", name='" + name +
                ", dayOfBirth='" + dayOfBirth +
                ", gender='" + gender +
                ", classes='" + classes +
                ", point= " + point;
    }
    public void add(){

    }
}
