package basic.Employee_test;

import java.util.List;
//Calculate the average salary for all employees and print it.
public class AvarageSalaryEmp {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Double employeeListOutput = employeeList.stream()
                                .mapToDouble(e -> e.getSalary()).average().getAsDouble();
                                
        System.out.println("Avarage salary of Employees :"+ employeeListOutput);

    }
}
