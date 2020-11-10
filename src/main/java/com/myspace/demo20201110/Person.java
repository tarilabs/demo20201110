package com.myspace.demo20201110;

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Long age;

	public Person() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Long getAge() {
		return this.age;
	}

	public void setAge(java.lang.Long age) {
		this.age = age;
	}

	public Person(java.lang.String name, java.lang.Long age) {
		this.name = name;
		this.age = age;
	}

}