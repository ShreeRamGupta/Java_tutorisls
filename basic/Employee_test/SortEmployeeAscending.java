package basic.Employee_test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Sort a list of ‘Employee’ objects by their salaries in Ascending order using Java 8 Streams
public class SortEmployeeAscending {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<Employee> employeeListOutput = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        employeeListOutput.forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
    }
    
    
}
