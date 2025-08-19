package basic.Employee_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Map<String,List<Employee>> empDepList = employeeList.stream()
                                    .collect(Collectors.groupingBy(Employee::getDepartment));
        empDepList.forEach((department,employee)->{
            System.out.println("Department :"+department);
            employee.forEach(System.out::println);
            System.out.println("---------------------------------------");
        });
    }
}
