package basic.Employee_test;

import java.util.List;
import java.util.stream.Collectors;
//Create a list of names (Strings) from a list of `Employee` objects using Java 8 Streams
public class ExtractingNames {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<String> employeeName = employeeList.stream()
                                .map(e ->e.getName())
                                .collect(Collectors.toList());
        employeeName.forEach(System.out::println);
    }
    
    
}
