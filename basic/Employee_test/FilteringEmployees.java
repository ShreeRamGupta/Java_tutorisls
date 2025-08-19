package basic.Employee_test;

import java.util.List;

import java.util.stream.Collectors;

public class FilteringEmployees {
    public static void main(String ...a){
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List<Employee> employeeListOutput = employeeList.stream()
        .filter(s-> (s.getGender().equalsIgnoreCase("male")&& s.getDepartment().equalsIgnoreCase("Engineering")))
        .collect(Collectors.toList());

        employeeListOutput.forEach(e -> System.out.println(e.getName()));
    }
}
