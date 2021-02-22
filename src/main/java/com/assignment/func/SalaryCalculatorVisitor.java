package com.assignment.func;

import java.math.BigDecimal;

import com.assignment.pojo.Commission;
import com.assignment.pojo.Fixed;
import com.assignment.pojo.Mixed;

public class SalaryCalculatorVisitor implements ISalaryCalculatorVisitor {

	//return fixed salary component
	public BigDecimal calculate(Fixed emp) {
		return emp.getSalary().setScale(2, BigDecimal.ROUND_FLOOR);
	}

	//apply commission percentage on sales volume amount
	public BigDecimal calculate(Commission emp) {
		return emp.getCommission().multiply(emp.getVolume()).setScale(2, BigDecimal.ROUND_FLOOR);
	}

	//apply commission percentage on sales volume amount and add fixed salary component
	public BigDecimal calculate(Mixed emp) {
		return emp.getSalary().add(emp.getCommission().multiply(emp.getVolume())).setScale(2, BigDecimal.ROUND_FLOOR);
	}

}
