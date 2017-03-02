package io.egen.weather.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import io.egen.weather.entity.Weather;
import io.egen.weather.respository.WeatherRepository;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<String> findcity() {
		TypedQuery<String> query = em.createNamedQuery("Weather.findcity", String.class);
		return query.getResultList();
	}

	@Override
	public Weather create(Weather weather) {
		em.persist(weather);
		return weather;
	}

	@Override
	public Weather findbycity(String city) {
		TypedQuery<Weather> query = em.createNamedQuery("Weather.findbycity", Weather.class);
		query.setParameter("pCity", city);

		List<Weather> weather = query.getResultList();
		if (weather != null) {
			return weather.get(0);
		} else {
			return null;
		}

	}
//
//	@Override
//	public Weather findbyproperty(String city) {
//		TypedQuery<Weather> query = em.createNamedQuery("Weather.findbyproperty", Weather.class);
//		query.setParameter("pCity", city);
//
//		List<Weather> weather = query.getResultList();
//		if (weather != null) {
//			return weather.get(0);
//		} else {
//			return null;
//		}
//
//	}

	

	
//	@Override
//	public Weather findbyCityWeather(String city, String proprty) {
//		TypedQuery<Weather> query = em.createNamedQuery("Weather.findbyhu", Weather.class);
//		query.setParameter("pCity", city);
//
//		List<Weather> weather = query.getResultList();
//		if (weather != null) {
//			return weather.get(0);
//		} else {
//			return null;
//		}
//	}

	@Override
	public double findWeatherByCityTemprature(String city) {
		// TODO Auto-generated method stub
		TypedQuery<Double> query = em.createNamedQuery("Weather.findTemperatureByCity", Double.class);
		query.setParameter("pCity", city);
		query.setMaxResults(1);
		return query.getSingleResult();

		
	}

	@Override
	public double findWeatherByHumidityCity(String city) {
		// TODO Auto-generated method stub
		TypedQuery<Double> query = em.createNamedQuery("Weather.findHumidityByCity", Double.class);
		query.setParameter("pCity", city);
		query.setMaxResults(1);
		return query.getSingleResult();
//		List<Weather> weather = query.getResultList();
//		if (weather != null) {
//			return weather.get(0);
//		} else {
//			return null;
//		}
//		return list;
	}

	@Override
	public Weather findByHour(String city) {
		TypedQuery<Weather> query = em.createNamedQuery("Weather.findHourlyAvg", Weather.class);
		query.setParameter("pCity", city);
		query.setMaxResults(1);

		List<Weather> weather = query.getResultList();
		if (weather != null) {
			return weather.get(0);
		} else {
			return null;
		}
	}

	@Override
	public Weather findByDay(String city) {
		TypedQuery<Weather> query = em.createNamedQuery("Weather.findDailyAvg", Weather.class);
	query.setParameter("pCity", city);

	List<Weather> weather = query.getResultList();
	if (weather != null) {
		return weather.get(0);
	} else {
		return null;
	}
	}
}

// @Override
// public Weather findbycity(String city) {
// TypedQuery<Weather> query = em.createNamedQuery("Weather.findbycity",
// Weather.class);
// query.setParameter("pCity", city);
// return query.getResultList();
//// List<Weather> weather= query.getResultList();
//// if(weather!=null){
//// return weather;
//// }
//// else
//// {
//// return null;
//// }
// }
