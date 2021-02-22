package com.assignment.pojo;

import java.math.BigDecimal;

import com.assignment.func.ISalaryCalculatorVisitor;

public class Commission extends Employee {
	
	public Commission(BigDecimal commission, BigDecimal volume) {
		this.setCommission(commission.setScale(2, BigDecimal.ROUND_FLOOR));
		this.setVolume(volume.setScale(2, BigDecimal.ROUND_FLOOR));
		this.setEmployeeType(EmployeeType.COMMISSION);
	}
	
	@Override
	public BigDecimal compute(ISalaryCalculatorVisitor salaryCalculator) {
		return salaryCalculator.calculate(this);		
	}
}
