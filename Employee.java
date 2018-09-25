package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("Aob")
	private Address Add;
	private String name;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Add=" + Add + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return Add;
	}
	public void setAdd(Address add) {
		Add = add;
	}

}
