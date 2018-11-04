package com.wb.container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wb.controller.EmployeeController;
import com.wb.entity.Employee;

public class App 
{
	public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setEmployeeID(466);
        employee.setName("GMK");
        employee.setSalary(1255.54d);
        
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(EmployeeController.class);
        EmployeeController controller = container.getBean(EmployeeController.class);
        controller.save(employee);
        
        
        container.close();
        
    }
}
