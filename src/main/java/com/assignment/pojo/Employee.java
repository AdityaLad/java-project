package com.assignment.pojo;

import java.math.BigDecimal;

import com.assignment.func.IJsonVisitor;
import com.assignment.func.ISalaryCalculatorVisitor;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class Employee {
	
	private EmployeeType employeeType; 
	
	//a fixed salary component
	private BigDecimal salary = new BigDecimal(0);
	
	//a commission its value expected to be in 0-1
	private BigDecimal commission = new BigDecimal(0.0);
	
	//the sale volume on which commission will be applied
	private BigDecimal volume = new BigDecimal(0.0);
	
	//to be overridden by the extended employee class
	public BigDecimal compute(ISalaryCalculatorVisitor salaryCalculator) {
		return new BigDecimal(0.0);		
	}
	
	public void visit(IJsonVisitor jsonVisitor) throws JsonProcessingException {
		jsonVisitor.visit(this);
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
}
