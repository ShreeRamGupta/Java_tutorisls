package basic.Employee_test;

import java.util.List;
import java.util.Map;
//Calculate the average salary for employees in each department using Java 8 Streams.
import java.util.stream.Collectors;


public class DepartmentWiseAvgSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Map<String,Double> employeeName = employeeList.stream()
                                        .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Department wise average salary :");
        employeeName.forEach((k,v)->System.out.println(k+" "+v));                                  
    }
}
