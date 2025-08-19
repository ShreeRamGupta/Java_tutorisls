package basic.Employee_test;

import java.util.List;
import java.util.stream.Collectors;
//Concatenate the names of all employees in the list into a single comma-separated string using Java 8 Streams.
public class NameConcatenation {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        
        String concatenatedName = employeeList.stream()
                        .map(Employee::getName)
                        .collect(Collectors.joining(","));

        System.out.println("Concatenated Names :"+ concatenatedName);
    }
}
