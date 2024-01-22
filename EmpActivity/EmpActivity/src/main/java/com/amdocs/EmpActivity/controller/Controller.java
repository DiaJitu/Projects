package com.amdocs.EmpActivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.EmpActivity.entity.Employee;
import com.amdocs.EmpActivity.service.EmpServ;

@RestController
public class Controller 
{
	@Autowired
	private EmpServ empservice;
	
	@PostMapping("/add")
	public String add(@RequestBody Employee emp)
	{
		empservice.saveEmp(emp);
		return "Student added succesfully";
	}
	@GetMapping("/getAll")
	public List<Employee> getAllEmps()
	{
		return empservice.getAllEmps();
	}
	@DeleteMapping("/delete/{id}")
	public String DeleteEmp( @PathVariable("id") int id)
	{
		empservice.deleteIt(id);
		return "Student deleted successfully";
	}
	@GetMapping("/getByID/{id}")
	public Employee getEmpByID(@RequestParam int id)
	{
		return empservice.viewEmp(id);
	}
	@PutMapping("/update/{id}")
    public String updateEmp(@PathVariable int id, @RequestBody Employee updateEmp) 
	{
        empservice.updateEmp(id, updateEmp);
        return "Student updated successfully";
	}
	
}
