package co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.controller;


import co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.model.Employee;
import co.za.thehubzatech.TheHubZa.Time.Sheet.Work.Sheet.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository EmployeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return EmployeeRepository.findAll();
    }
}
