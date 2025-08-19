package basic.Employee_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Group the employees by their gender and print the result using the groupingBy collector.
public class GroupByGender {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        
        Map<String,List<Employee>> employeeListOutput = employeeList.stream()
                                    .collect(Collectors.groupingBy(s ->s.getGender()));
        
                                    
        employeeListOutput.forEach((k,v)->{
            System.out.println("Gender :"+k);
            v.forEach(System.out::println);
            System.out.println("--------------------------------");
        });

    }
}
