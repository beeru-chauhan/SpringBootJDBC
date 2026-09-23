package com.beeru.model;

public class Employee {
	
private Integer id;

private String name;

private String city;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

}
