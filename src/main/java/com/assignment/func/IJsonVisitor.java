package com.assignment.func;

import com.assignment.pojo.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IJsonVisitor {
	public void visit(Employee emp) throws JsonProcessingException;
}
