package com.assignment.func;

import java.math.BigDecimal;

import com.assignment.pojo.Commission;
import com.assignment.pojo.Fixed;
import com.assignment.pojo.Mixed;

public interface ISalaryCalculatorVisitor {
	public BigDecimal calculate(Fixed emp);
	public BigDecimal calculate(Commission emp);
	public BigDecimal calculate(Mixed emp);
}
