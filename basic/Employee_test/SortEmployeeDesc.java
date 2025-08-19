package basic.Employee_test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeDesc {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<Employee> employeeListOutput = employeeList.stream()
                            .sorted(Comparator.comparing(Employee::getSalary).reversed())
                            .collect(Collectors.toList());
        employeeListOutput.forEach(e -> System.out.println(e.getName()+" "+ e.getSalary()) );
    }
}
