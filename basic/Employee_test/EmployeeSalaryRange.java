package basic.Employee_test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Group employees into different salary ranges (e.g., 0-10k, 10k-20k, 20k-30k, 30k-50k) using Java 8 Streams
public class EmployeeSalaryRange {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();
        
        
        Map<String, List<Employee>> salaryRangeGroup = employeeList.stream()
                    .collect(Collectors.groupingBy(employee -> getSalaryRange(employee.getSalary())));

        //Print the result
        salaryRangeGroup.forEach((range, employeeList1) ->{
            System.out.println("Salary Range :"+ range);
            employeeList1.forEach(employee -> System.out.println("   "+ employee));
            System.out.println("----------------------------");
        });
    }

    private static String getSalaryRange(double salary){
        if(salary < 10000){
            return "0 - 10k";
        }else if(salary < 20000){
            return "10k - 20k";
        }else if(salary < 30000){
            return "20k - 30K";
        }else if(salary < 50000){
            return "30k - 50k";
        }else{
            return "50k";
        }
    }
}


