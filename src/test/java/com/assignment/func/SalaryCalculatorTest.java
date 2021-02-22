package com.assignment.func;

import java.math.BigDecimal;

import com.assignment.pojo.Commission;
import com.assignment.pojo.Fixed;
import com.assignment.pojo.Mixed;

import junit.framework.TestCase;

public class SalaryCalculatorTest extends TestCase {

	public void testFixedCalculator() {
		SalaryCalculatorVisitor sub = new SalaryCalculatorVisitor();
		Fixed emp = new Fixed(new BigDecimal(1000));
		BigDecimal actual = emp.compute(sub);
		BigDecimal expected = (new BigDecimal(1000)).setScale(2, BigDecimal.ROUND_FLOOR);
		assertEquals(expected, actual);
	}

	public void testMixedCalculator() {
		SalaryCalculatorVisitor sub = new SalaryCalculatorVisitor();
		Mixed emp = new Mixed(new BigDecimal(1000), new BigDecimal(0.2), new BigDecimal(10000));
		BigDecimal actual = emp.compute(sub);
		BigDecimal expected = (new BigDecimal(1000)).add((new BigDecimal(0.2).multiply(new BigDecimal(10000))))
				.setScale(2, BigDecimal.ROUND_FLOOR);
		assertEquals(expected, actual);
	}
	
	public void testCommissionCalculator() {
		SalaryCalculatorVisitor sub = new SalaryCalculatorVisitor();
		Commission emp = new Commission(new BigDecimal(0.2), new BigDecimal(10000));
		BigDecimal actual = emp.compute(sub);
		BigDecimal expected = (new BigDecimal(0.2).multiply(new BigDecimal(10000)))
				.setScale(2, BigDecimal.ROUND_FLOOR);
		assertEquals(expected, actual);
	}

}
