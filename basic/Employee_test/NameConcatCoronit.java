package basic.Employee_test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.*;
public class NameConcatCoronit {
    public static void main(String ...args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        
        employeeList.stream()
                    .map(emp ->{
                        long years = ChronoUnit.YEARS.between(emp.getDateOfJoining(), LocalDate.now());
                        return emp.getName() + "has been with the company for "+ years + "  years.";
                    })
                    .forEach(System.out::println);
    }
}
