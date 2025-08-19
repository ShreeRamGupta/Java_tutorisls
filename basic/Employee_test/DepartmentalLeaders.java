package basic.Employee_test;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
//Find the employee with the highest salary in each department using Java 8 Streams.
public class DepartmentalLeaders {
    public static void main(String[] args) {
        List<Employee> employeeList  = EmployeeDataGenerator.generateSampleData();

        Map<String,Employee> highestSalaryInEachDepartment = employeeList.stream()
                                                .collect(Collectors.toMap(
                                                    Employee::getDepartment,
                                                    e-> e, 
                                                    (e1,e2)-> e1.getSalary() >= e2.getSalary() ? e1:e2
                                                    ));
        highestSalaryInEachDepartment.forEach((department,employee)-> 
                                    System.out.println("Department :"+department +", Highest salary employee :" +employee.getName()));
        
    }
}
