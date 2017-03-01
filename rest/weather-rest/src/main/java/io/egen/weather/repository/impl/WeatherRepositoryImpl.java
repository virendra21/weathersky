package io.egen.weather.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import io.egen.weather.entity.Weather;
import io.egen.weather.respository.WeatherRepository;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository  {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Weather> findcity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather create(Weather weather) {
		// TODO Auto-generated method stub
		em.persist(weather);
		return weather;
	}

}


