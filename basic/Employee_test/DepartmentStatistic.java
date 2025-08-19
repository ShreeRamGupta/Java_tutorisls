package basic.Employee_test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentStatistic {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataGenerator.generateSampleData();

        Map<String, DoubleSummaryStatistics> departmentStatistics = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summarizingDouble(Employee::getSalary)));
                    
        Map<String,Long> femaleCountByDepartment = employeeList.stream()
                    .filter(employee-> "Female".equals(employee.getGender()))
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        
        departmentStatistics.forEach((department, stats)->{
            System.out.println("Department :"+ department);
            System.out.println("Total Salary : "+ stats.getSum());
            System.out.println("Average Salary :"+ stats.getAverage());
            System.out.println("Numbers of female employee :"+ femaleCountByDepartment.getOrDefault(department,0L));
            System.out.println("------------------------------");
        });
    }
}
