package io.egen.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.weather.entity.Weather;
import io.egen.weather.service.WeatherService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value = "weather")
public class WeatherController {
	
	@Autowired
	private WeatherService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public Weather create(@RequestBody Weather weather) {
		return service.create(weather);
	}
	
	

}



