package io.egen.weather.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.egen.weather.entity.Weather;
import io.egen.weather.respository.WeatherRepository;
import io.egen.weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	WeatherRepository repository;

	@Override
	public List<Weather> findcity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Weather create(Weather weather) {
		// TODO Auto-generated method stub
		return repository.create(weather);
	}

}
