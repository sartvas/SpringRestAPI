
package com.zaurtregulov.spring.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import com.zaurtregulov.spring.rest.entity.Employee;
import com.zaurtregulov.spring.rest.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class MyRestController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    } 
    
    @GetMapping("/employees/{id}")
   public Employee getEmployee(@PathVariable int id){
       Employee employee = employeeService.getEmployee(id);
       return employee;
   }
   
    @PostMapping("/employees")
   public Employee addNewEmployee(@RequestBody Employee employee){
       employeeService.saveEmployee(employee);
       return employee;
               
   }
    
}
