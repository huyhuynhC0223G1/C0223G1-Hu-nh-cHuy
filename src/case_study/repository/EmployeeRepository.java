package case_study.repository;

import case_study.model.Employee;
import case_study.ultils.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_FILE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getEmployyeStaff() {
        employeeList = ReadAndWriteFileEmployee.readEmployeeListFromFile(EMPLOYEE_FILE_PATH);
        return employeeList;
    }

    @Override
    public void addEmployyeStaff(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteFileEmployee.writeEmployeeListToFile(employeeList, EMPLOYEE_FILE_PATH);
    }

    @Override
    public boolean editEmployyeStaff() {
        return false;
    }
}
