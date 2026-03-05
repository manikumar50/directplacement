package com.sample.DPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
class Employee
{
	private Integer id;
	private String name;

	public Employee() {
	}

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}





@SpringBootApplication
public class DpAppApplication
{
//	@Autowired // field injection
	private SampleClass obj; //  SampleClass

//	@Autowired // constructor injection
//	DpAppApplication(SampleClass obj)
//	{
//		this.obj = obj;
//	}

//	@Autowired // setter injection
//	public void setObj(SampleClass obj) {
//		this.obj = obj;
//	}

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(DpAppApplication.class, args);

		Employee employee = context.getBean(Employee.class);

		System.out.println(employee);

		employee.setId(101);
		employee.setName("sample name");

		System.out.println(employee);


		Employee employee1 = context.getBean(Employee.class);
		System.out.println(employee1);


//		DpAppApplication dpObj = context.getBean(DpAppApplication.class);

//		dpObj.obj.add();

		//		Mysql mysql = new Mysql();
//		Postgresql postgresql = new Postgresql();
//
//		GetConnection getConnection = new GetConnection(postgresql);
//		getConnection.getConnection();
	}
}