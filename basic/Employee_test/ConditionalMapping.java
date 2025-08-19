package basic.Employee_test;

import java.util.List;

import java.util.stream.Collectors;

//Create a list of employees’ names who have a salary greater than
// 20,000 and are in the “Sales” department using Java 8 Streams.
public class ConditionalMapping {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<String> namesInSalesWithHighSalary = employeeList.stream()
                                                .filter(employee -> employee.getSalary()>20000)
                                                .filter(employee ->"Sales".equals(employee.getDepartment()))
                                                .map(Employee::getName)
                                                .collect(Collectors.toList());
        System.out.println("Employee in sales with salary grater then 20,000 :"+namesInSalesWithHighSalary);
    }
    
}
