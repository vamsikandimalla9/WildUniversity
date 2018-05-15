package com.example.bean;

public class Student {

	private String uno;
	private String name;

	public Student(String uno, String name) {
		super();
		this.uno = uno;
		this.name = name;
	}

	public String getUno() {
		return uno;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [uno=" + uno + ", name=" + name + "]";
	}

}
