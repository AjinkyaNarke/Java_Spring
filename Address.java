package com.aj.beans;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Address {

	private int Pcode;
	private String street;
	private List<String> Resident1;
	public void setPcode(int pcode) {
		Pcode = pcode;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setResident1(List<String> resident1) {
		Resident1 = resident1;
	}
	@Override
	public String toString() {
		return "Address [Pcode=" + Pcode + ", street=" + street + ", Resident1=" + Resident1 + "]";
	}
	
}
