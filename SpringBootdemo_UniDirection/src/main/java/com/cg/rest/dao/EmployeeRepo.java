package com.cg.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.rest.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	@Query("Select e from Employee e  where e.account.accNo=:accNo")
	Employee findEmpByAccId(@Param("accNo") int accNo);
}



