package com.amdocs.EmpActivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.EmpActivity.Repo.EmpRepo;
import com.amdocs.EmpActivity.entity.Employee;

@Service
public class EmpServImpl implements EmpServ 
{
	@Autowired
	EmpRepo empr;


	public EmpServImpl(EmpRepo empr) 
	{
		super();
		this.empr = empr;
	}

	@Override
	public Employee saveEmp(Employee emp) 
	{
		return empr.save(emp);
	}
		
	@Override
	public List<Employee> getAllEmps() 
	{
		// TODO Auto-generated method stub
		return empr.findAll();
	}

	@Override
	public void deleteIt(int id)
	{
		// TODO Auto-generated method stub
		empr.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee viewEmp(int id) 
	{
		// TODO Auto-generated method stub
		return empr.getById(id);
	}

	@Override
	public void updateEmp(int id, Employee updateEmp)
	{
		empr.deleteById(id);
		empr.save(updateEmp);
	}



}
