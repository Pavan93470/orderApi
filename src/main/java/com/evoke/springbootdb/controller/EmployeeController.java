package com.evoke.springbootdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	JdbcTemplate jdbc;

	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("INSERT INTO public.employeesdetails(\r\n" + "	id, name, salary, role)\r\n"
				+ "	VALUES (10, 'roja', 2000, 'dev');");
		return "successfully";

	}
}
