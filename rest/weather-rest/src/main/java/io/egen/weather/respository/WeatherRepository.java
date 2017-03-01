package io.egen.weather.respository;

import java.util.List;

import io.egen.weather.entity.*;

public interface WeatherRepository {

	public List<Weather> findcity(String city);

	public Weather create(Weather weather);


}
