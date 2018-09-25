package com.aj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aj.beans.Employee;

public class test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/aj/config/Config.xml");
		Employee e=(Employee)context.getBean("Eobj");
		System.out.println(e);

	}

}
