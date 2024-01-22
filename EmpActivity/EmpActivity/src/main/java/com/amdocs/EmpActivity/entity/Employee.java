package com.amdocs.EmpActivity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int id;
	private String name;
	private String address;
	private String gen;
	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", gen=" + gen + "]";
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getGen() 
	{
		return gen;
	}
	public void setGen(String gen)
	{
		this.gen = gen;
	}
	public Employee(int id, String name, String address, String gen) 
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gen = gen;
	}
}
