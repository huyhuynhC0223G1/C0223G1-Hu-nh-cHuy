package ss10_dsa.bai_tap.quanlisinhvien;

public class Teacher extends Person {
    private String specialize;

    public Teacher(int id, String name, String dayOfBirth, String gender, String classes, String specialize) {
        super(id, name, dayOfBirth, gender, classes);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", id=" + id +
                ", name='" + name +
                ", dayOfBirth='" + dayOfBirth +
                ", gender='" + gender +
                ", classes='" + classes +
                ", specialize='" + specialize ;
    }
}
