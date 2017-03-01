package io.egen.weather.entity;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Weather {

	@Id
	private String id;

	private String city;
	private String description;
	private double humidity;
	private double pressure;
	private double temperature;
	private String timestamp;
	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date time;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@OneToOne(cascade = {CascadeType.ALL})
	private Wind wind; 

	public Weather() {
		this.id = UUID.randomUUID().toString();
	}

//	public Date getTime() {
//		return time;
//	}

//	public void setTime(Date time) {
//		
////		this.time = time;
//		this.time = new Date();
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}



	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}
	

	
}
