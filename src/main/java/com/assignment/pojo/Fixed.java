package com.assignment.pojo;

import java.math.BigDecimal;

import com.assignment.func.ISalaryCalculatorVisitor;

public class Fixed extends Employee {
	
	public EmployeeType employeeType = EmployeeType.FIXED;
	
	public Fixed(BigDecimal salary) {
		salary.setScale(2, BigDecimal.ROUND_FLOOR);
		this.setSalary(salary);
		this.setEmployeeType(EmployeeType.FIXED);
	}

	@Override
	public BigDecimal compute(ISalaryCalculatorVisitor salaryCalculator) {
		return salaryCalculator.calculate(this);		
	}

}
