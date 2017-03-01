package io.egen.weather.service;

import java.util.List;

import io.egen.weather.entity.Weather;

public interface WeatherService {
	
	public List<Weather> findcity(String city);

	public Weather create(Weather weather);

}
