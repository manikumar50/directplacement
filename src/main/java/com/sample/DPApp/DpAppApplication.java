package com.sample.DPApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DpAppApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DpAppApplication.class, args);
		System.out.println("hello");
	}
}