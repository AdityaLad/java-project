package com.assignment.main;

import java.math.BigDecimal;

import com.assignment.func.IJsonVisitor;
import com.assignment.func.ISalaryCalculatorVisitor;
import com.assignment.func.JsonVisitor;
import com.assignment.func.SalaryCalculatorVisitor;
import com.assignment.pojo.Commission;
import com.assignment.pojo.Employee;
import com.assignment.pojo.Fixed;
import com.assignment.pojo.Mixed;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * Hello world!
 * Simple program to compute sum of employee salaries using visitor pattern.
 *
 */
public class App {
	public static void main(String[] args) throws JsonProcessingException {
		
		//define 3 employees of each type
		Employee[] employees = { 
				new Fixed(new BigDecimal(5000)),
				new Commission(new BigDecimal(0.1), new BigDecimal(100000)),
				new Mixed(new BigDecimal(2000), new BigDecimal(0.2), new BigDecimal(50000)) };
		
		ISalaryCalculatorVisitor salaryCalculatorVisitor = new SalaryCalculatorVisitor();
		IJsonVisitor jsonVisitor = new JsonVisitor();

		BigDecimal sum = new BigDecimal(0);
		
		//compute sum of all employee salaries
		for (Employee emp : employees) {
			sum = sum.add(emp.compute(salaryCalculatorVisitor));
		}
		System.out.println("Sum of all employee salaries - " + sum);
        
		//print in json
		for (Employee emp : employees)
			emp.visit(jsonVisitor);

	}
}
