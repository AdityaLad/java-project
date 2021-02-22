package com.assignment.func;

import com.assignment.pojo.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonVisitor implements IJsonVisitor {

	public void visit(Employee emp) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(emp);
        System.out.println(jsonString);
	}

}
