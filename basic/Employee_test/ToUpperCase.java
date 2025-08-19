package basic.Employee_test;

import java.util.List;
import java.util.stream.Collectors;
//Transform the names of all employees to uppercase using the map operation in streams.
public class ToUpperCase {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<String> employeeListOutput = employeeList.stream()
                            .map(e -> e.getName().toUpperCase())
                            .collect(Collectors.toList());
        
        employeeListOutput.forEach(System.out::println);
    }
}
