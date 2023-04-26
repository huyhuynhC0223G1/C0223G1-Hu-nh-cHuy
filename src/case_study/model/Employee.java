package case_study.model;

public class Employee extends Person {
    private String level;
    private String location;

    private String wage;

    public Employee(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9) {
    }

    public Employee(String id, String name, String dayOfBirth, String gender, String identityCard, String numberPhone, String email, String level, String location, String wage, String level1, String location1, String wage1) {
        super(id, name, dayOfBirth, gender, identityCard, numberPhone, email, level, location, wage);
        this.level = level1;
        this.location = location1;
        this.wage = wage1;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getInfoToCsv() {
        return super.getId() + "," + super.getName() + "," + super.getDayOfBirth() + "," + super.getGender() + "," + super.getIdentityCard() + "," + super.getNumberPhone() + "," + "," + super.getEmail() + "," + getLevel() + "," +getLocation() +getWage();
    }
}


