package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    List<Employee> getEmployyeStaff();

    void addEmployyeStaff(Employee employee);

    void editEmployeeStaff(String id, Employee employee);

    boolean checkEmployee(String id);
}
