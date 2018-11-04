package com.wb.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class jdbcTemplateImpl {

	@Autowired
	private DataSource dataSource;
	
	public jdbcTemplateImpl() {
		System.out.println("jdbc Template ....");
	}
	@Bean
	public JdbcTemplate jdbctemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		return jdbcTemplate;
	}
	
}
