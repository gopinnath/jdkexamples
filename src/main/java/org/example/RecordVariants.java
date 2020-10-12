package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class RecordVariants {

    // Approach 1
    public record Employee(Integer id, String name, String department, String designation, Double salary)   {
        // Default hashcode,toString and equals method are provided.
    }

    // Approach 2
    public record Shipment<T>(T container, String partyName, String source, String destination)   {
        // Default hashcode,toString and equals method are provided.
    }

    // Approach 3
    public record Box(String content,Double value)   {
        // Default hashcode,toString and equals method are provided.
    }

    private List<Employee> employeeList;

    public void setEmployees(List<Employee> employeeList)   {
        this.employeeList = employeeList;
    }
    public List<Employee> getEmployeeByDepartment(String department)   {
        return employeeList.stream().filter(emp -> emp.department.equals(department)).collect(Collectors.toList());
    }

    public Employee getEmployeeById(Integer id)   {
        return employeeList.stream().filter(emp -> emp.id == id).findFirst().orElseGet(null);
    }
}
