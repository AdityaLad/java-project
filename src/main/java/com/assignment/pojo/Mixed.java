package com.assignment.pojo;

import java.math.BigDecimal;

import com.assignment.func.ISalaryCalculatorVisitor;

public class Mixed extends Employee {
	
	public Mixed(BigDecimal salary, BigDecimal commission, BigDecimal volume) {
		this.setSalary(salary.setScale(2, BigDecimal.ROUND_FLOOR));
		this.setCommission(commission.setScale(2, BigDecimal.ROUND_FLOOR));
		this.setVolume(volume.setScale(2, BigDecimal.ROUND_FLOOR));
		this.setEmployeeType(EmployeeType.MIXED);
	}

	@Override
	public BigDecimal compute(ISalaryCalculatorVisitor salaryCalculator) {
		return salaryCalculator.calculate(this);		
	}

}
