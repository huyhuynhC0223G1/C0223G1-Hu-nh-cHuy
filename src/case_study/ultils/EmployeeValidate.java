package case_study.ultils;

public class EmployeeValidate {
    private static final String REGER_EMPLOYEE_ID = "^NV-\\d{4}$";
    private static final String REGER_EMPLOYEE_NAME = "^([A-Z][a-z]+|([A-Z])([a-z]+)(\\s[A-Z][a-z]+){0,})$";
    private static final String REGER_EMPLOYEE_IDENTITYCARD = "(\\d{9}|\\d{12})$";
    private static final String REGER_EMPLOYEE_NUMBERPHONE = "^0\\d{9}$";
    private static final String REGER_EMPLOYEE_WAGE = "^[1-9]\\d+$";


    public static boolean checkEmployeeId(String id) {
        return id.matches(REGER_EMPLOYEE_ID) ? true : false;
    }

    public static boolean checkEmployeeName(String name) {
        return name.matches(REGER_EMPLOYEE_NAME) ? true : false;
    }

    public static boolean checkEmployeeIdentityCard(String identityCard) {
        return identityCard.matches(REGER_EMPLOYEE_IDENTITYCARD) ? true : false;
    }

    public static boolean checkEmployeeNumberPhone(String numberPhone) {
        return numberPhone.matches(REGER_EMPLOYEE_NUMBERPHONE) ? true : false;
    }

    public static boolean checkEmployeeWage(String wage) {
        return wage.matches(REGER_EMPLOYEE_WAGE) ? true : false;
    }
}
