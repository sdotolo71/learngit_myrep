package com.example.base.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("L1")
@Scope(value="singleton")
public class Laptop {

	private int idlap;
	private String brand;
	private String name;
	public int getIdlap() {
		return idlap;
	}
	public void setIdlap(int idlap) {
		this.idlap = idlap;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [idlap=" + idlap + ", brand=" + brand + ", name=" + name + "]";
	}
	public Laptop() {
		super();
		System.out.println("laptop construction call");
	}
	
	
	
}
