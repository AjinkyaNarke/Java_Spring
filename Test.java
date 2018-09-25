package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Employee;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext con=new ClassPathXmlApplicationContext("Config/Appconfig.xml");
		Employee e=(Employee)con.getBean("Eobj");
		System.out.println(e);
		
		// TODO Auto-generated method stub

	}

}
