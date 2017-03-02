package io.egen.weather.service;

import java.util.List;

import io.egen.weather.entity.Weather;

public interface WeatherService {
	
	public List<String> findcity();
	public Weather findbycity(String city);
	public double findWeatherByCityTemprature(String city);
	public double findWeatherByHumidityCity(String city);
	public Weather create(Weather weather);
	public Weather findByHour(String city);
	public Weather findByDay(String city);

}
