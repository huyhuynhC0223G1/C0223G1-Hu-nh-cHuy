package ss10_dsa.bai_tap.quanlisinhvien;

public class Person {
    public int id;
    public String name;
    public String dayOfBirth;
    public String gender;
    public String classes;

    public Person(int id, String name, String dayOfBirth, String gender, String classes) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.classes = classes;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name +
                ", dayOfBirth='" + dayOfBirth +
                ", gender='" + gender +
                ", classes='" + classes ;

    }
}
