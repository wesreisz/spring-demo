package com.wesleyreisz.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExployeeRESTController {

    private static List<EmployeeVO> employees = new ArrayList<>();

    {
        EmployeeVO emp1 = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
        EmployeeVO emp2 = new EmployeeVO(2, "Wes", "Reisz", "wes@wesleyreisz.com");
        EmployeeVO emp3 = new EmployeeVO(3, "Kim", "Reisz", "kim@wesleyreisz.com");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
    }

    @GetMapping(value = "/employees")
    public List<EmployeeVO> getAllEmployees(){
        return employees;
    }

    @GetMapping(value = "/employees/{id}")
    public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id){
        int ind = employees.indexOf(new EmployeeVO(id));
        if (ind != -1) {
            return new ResponseEntity<EmployeeVO>(employees.get(ind), HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
