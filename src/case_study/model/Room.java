package case_study.model;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String code, String nameService, String erea, String tax, String numberPeople, String rentalType, String freeServiceIncluded) {
        super(code, nameService, erea, tax, numberPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServiceIncluded='" + freeServiceIncluded + '\'';
    }
}
