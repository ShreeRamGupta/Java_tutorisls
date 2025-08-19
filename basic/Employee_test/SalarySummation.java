package basic.Employee_test;

import java.util.List;

//Calculate the total salary of all female employees in a list of `Employee` objects using Java 8 Streams.
public class SalarySummation {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Double totaSalary = employeeList.stream()
                            .filter(e->e.getGender().equals("Female"))
                            .map(e->e.getSalary())
                            .reduce(0.0,(a,b)->a+b);
        System.out.println(totaSalary);
    }
}
