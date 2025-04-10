package com.example.demo.model;

public class Service {
private String id;
private String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Service(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
