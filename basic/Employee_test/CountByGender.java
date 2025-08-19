package basic.Employee_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Count the number of employees for each gender using the groupingBy and counting collectors.
public class CountByGender {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Map<String,Long> employeeListOutput = employeeList.stream()
                            .collect(Collectors.groupingBy(s ->s.getGender(),Collectors.counting()));
        
        employeeListOutput.forEach((k,v)->{
            System.out.println("Gender :"+k + "  and Count :"+v);
        });
    }
    
                        
}
