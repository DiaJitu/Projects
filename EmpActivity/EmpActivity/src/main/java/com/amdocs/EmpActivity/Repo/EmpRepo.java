package com.amdocs.EmpActivity.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.EmpActivity.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> 
{

}
