package basic.Employee_test;

import java.util.List;
import java.util.stream.Collectors;

//Filter and retrieve all employees who are older than 30 years and 
// have a salary greater than 30,000 using Java 8 Streams.
public class SeniorEmployee {
    public static void main(String[] args) {
        List <Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        List <Employee> employeeListOutput = employeeList.stream()
                                            .filter(s-> s.getAge()>30 && s.getSalary() >30000)
                                            .collect(Collectors.toList());
        
        employeeListOutput.forEach(e->System.out.println(e));

    }
}
