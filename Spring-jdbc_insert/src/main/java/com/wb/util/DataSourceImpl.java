package com.wb.util;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceImpl {
	
	@Autowired
	private Environment environment;
	
	public DataSourceImpl() {
		System.out.println("Datasource ... ");
	}
	@Bean
	public DataSource datasource() {
		
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		datasource.setUsername("SPRING");
		datasource.setPassword("Oradata1$");
		
		return datasource;
	}

}
