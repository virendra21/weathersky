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
	@Transactional(readOnly = true)
	public List<String> findcity() {	
		return repository.findcity();
	}

	@Override
	@Transactional
	public Weather create(Weather weather) {
		// TODO Auto-generated method stub
		return repository.create(weather);
	}

	@Override
	public Weather findbycity(String city) {
		// TODO Auto-generated method stub
		return repository.findbycity(city);
	}
//
//	@Override
//	public Weather findbyproperty(String city) {
//		// TODO Auto-generated method stub
//		return repository.findbyproperty(city);
//	}

	@Override
	public double findWeatherByCityTemprature(String city) {
		// TODO Auto-generated method stub
		return repository.findWeatherByCityTemprature(city);
	}

	@Override
	public double findWeatherByHumidityCity(String city) {
		// TODO Auto-generated method stub
		return repository.findWeatherByHumidityCity(city);
	}

	@Override
	public Weather findByHour(String city) {
		// TODO Auto-generated method stub
		return repository.findByHour(city);
	}

	@Override
	public Weather findByDay(String city) {
		return repository.findByDay(city);
	}

}
