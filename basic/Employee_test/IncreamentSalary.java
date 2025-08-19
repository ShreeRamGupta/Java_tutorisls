package basic.Employee_test;

import java.util.List;
import java.util.stream.Collectors;
//Increase the salary of all female employees in the "IT" department by 10% using Java 8 Streams.
public class IncreamentSalary {
    public static void main(String ...a){
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        //System.out.println(employeeList);
        List<Double> employeeListOutput = employeeList.stream()
                                    .filter(s->(s.getGender().equalsIgnoreCase("Female")&& s.getDepartment().equalsIgnoreCase("IT")))
                                    .map(s-> s.getSalary()+(s.getSalary()*10)/100)
                                    .collect(Collectors.toList());
                                    
        employeeListOutput.forEach(e->System.out.println(e));    
    }
}
