package io.egen.weather.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wind {

	@Id
	private String id;

	private double speed;
	private double degree;
	

	public Wind() {
		this.id = UUID.randomUUID().toString();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double getDegree() {
		return degree;
	}


	public void setDegree(double degree) {
		this.degree = degree;
	}

	
	
}
