package com.wilmir.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	private String name;
	private int id;
	private int points;

	
	public Alien() {
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}


	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + ", points=" + points + "]";
	}
	
	
	
	
	
}
