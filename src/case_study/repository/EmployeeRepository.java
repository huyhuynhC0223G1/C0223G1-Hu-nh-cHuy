package case_study.repository;

import case_study.model.Employee;
import case_study.ultils.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_FILE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getEmployyeStaff() {
        employeeList = ReadAndWriteFileEmployee.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        return employeeList;
    }

    @Override
    public void addEmployyeStaff(Employee employee) {
        employeeList = ReadAndWriteFileEmployee.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        employeeList.add(employee);
        ReadAndWriteFileEmployee.writeEmployeeListToFile(employeeList, EMPLOYEE_FILE_PATH);
    }

    @Override
    public void editEmployeeStaff(String id, Employee employee) {
        employeeList = ReadAndWriteFileEmployee.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        ReadAndWriteFileEmployee.writeEmployeeListToFile(employeeList.set(id, employee));
        ReadAndWriteFileEmployee.writeEmployeeListToFile(employeeList, EMPLOYEE_FILE_PATH);
    }

    @Override
    public boolean checkEmployee(String id) {
        for (Employee s : employeeList) {
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
