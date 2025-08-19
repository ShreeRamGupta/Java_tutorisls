package basic.Employee_test;

import java.time.LocalDate;
import java.util.List;

//Filter and print the employees who joined the company after a specific date.
public class FilteringEmplyeeJoinDate {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        //define the specific date to filter on

        LocalDate filterDate = LocalDate.of(2019, 1, 1);

        System.out.println("Employee who joined after "+ filterDate+ " :");

        employeeList.stream()
                .filter(emp -> emp.getDateOfJoining().isAfter(filterDate))
                .forEach(emp -> System.out.println(emp.getName()+ " joined on " + emp.getDateOfJoining()));
        
    }
}
