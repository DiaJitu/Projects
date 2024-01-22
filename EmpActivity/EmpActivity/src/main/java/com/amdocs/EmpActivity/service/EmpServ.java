package com.amdocs.EmpActivity.service;

import java.util.List;

import com.amdocs.EmpActivity.entity.Employee;

public interface EmpServ 
{
	public Employee saveEmp(Employee emp);
	public List<Employee> getAllEmps();
    void deleteIt(int id);
    public Employee viewEmp(int id);
	void updateEmp(int id, Employee updateEmp);
}
