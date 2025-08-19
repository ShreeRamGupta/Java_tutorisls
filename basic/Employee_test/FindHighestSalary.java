package basic.Employee_test;

import java.util.Comparator;
import java.util.List;

//Find the female employee with the highest salary in a list of `Employee` objects using Java 8 Streams
public class FindHighestSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Employee employee = employeeList.stream().filter(e ->e.getGender().equals("Female"))
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .findFirst().get();
        System.out.println(employee);
    }
}
