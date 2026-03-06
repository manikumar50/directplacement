package com.sample.DPApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DpAppApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(DpAppApplication.class, args);
	}
}