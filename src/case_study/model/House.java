package case_study.model;

public class House extends Facility{
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String code, String nameService, String erea, String tax, String numberPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(code, nameService, erea, tax, numberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}