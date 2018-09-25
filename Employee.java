package com.aj.beans;

import java.util.Map;
import java.util.Set;

public class Employee {

	private int Eid;
	private Set<String> Ename;
	private Map<String,String> MonSal;
	private Address Aobj;
	public void setEid(int eid) {
		Eid = eid;
	}
	public void setEname(Set<String> ename) {
		Ename = ename;
	}
	public void setMonSal(Map<String, String> monSal) {
		MonSal = monSal;
	}
	public void setAobj(Address aobj) {
		Aobj = aobj;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", MonSal=" + MonSal + ", Aobj=" + Aobj + "]";
	}
	
}
