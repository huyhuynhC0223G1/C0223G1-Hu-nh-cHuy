package case_study.model;

public abstract class Facility {
//    Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê
    private String code;
    private String nameService;
    private String erea;
    private String tax;
    private String numberPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String code, String nameService, String erea, String tax, String numberPeople, String rentalType) {
        this.code = code;
        this.nameService = nameService;
        this.erea = erea;
        this.tax = tax;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getErea() {
        return erea;
    }

    public void setErea(String erea) {
        this.erea = erea;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(String numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility: " +
                "code='" + code + '\'' +
                ", nameService='" + nameService + '\'' +
                ", erea='" + erea + '\'' +
                ", tax='" + tax + '\'' +
                ", numberPeople='" + numberPeople + '\'' +
                ", rentalType='" + rentalType + '\'';
    }
}
