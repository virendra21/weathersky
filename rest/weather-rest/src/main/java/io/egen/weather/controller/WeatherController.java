package io.egen.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import io.egen.weather.entity.Weather;
import io.egen.weather.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@CrossOrigin(maxAge = 3600)
@RestController
@Api(tags = "weather")
@RequestMapping(value = "weather")
public class WeatherController {
	
	@Autowired
	private WeatherService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "cities")
	@ApiOperation(value = "Find All Cities", notes = "Returns a list of cities that have reported their weather in the past.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	
	
	public List<String> findcity() {
		return service.findcity();
	}
	
	
//	
//	@RequestMapping(method = RequestMethod.GET, value = "{city}")
//	public Weather findByProperty(@PathVariable("city") String City) {
//		return service.findbyproperty(City);
//	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ApiOperation(value = "Create", notes = "Accepts the weather reading from the mock weather sensor ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	public Weather create(@RequestBody Weather weather) {
		return service.create(weather);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "city")
	@ApiOperation(value = "Find Weather by City ", notes = " Return the latest weather for a given city. ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	public  Weather findByCity(@RequestParam("city") String city , @RequestParam("property") String property) {
		
			return service.findbycity(city);
		
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "property")
	@ApiOperation(value = "Find Weather by City ", notes = " Return the latest weather for a given city. ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	public  double findByProperty(@RequestParam("city") String city , @RequestParam("property") String property) {
		if(property.equals("temperature")){
			return service.findWeatherByCityTemprature(city);
		}else if(property.equals("humidity")){
			return service.findWeatherByHumidityCity(city);
		}else{
			return 0;
		}
	}
	
//	@RequestMapping(method = RequestMethod.GET)
//	@ApiOperation(value = "Find Weather by city and property ", notes = " Return the latest weather for a given city. ")
//	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
//			@ApiResponse(code = 500, message = "Internal Server Error"), })
//	public  Weather findByWeatherCity(@RequestParam("city") String city, @RequestParam("property") String property) {
//		if(property.equals("")){
//			return service.findWeatherByCityTemprature(city);
//		}else if(property.equals("")){
//			return service.findWeatherByHumidityCity(city);
//		}
//		return null;
//	}
	
	@RequestMapping(method = RequestMethod.GET, value = "hourly")
	@ApiOperation(value = "Find Hourly Weather ", notes = " Return the latest weather for a given city. ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	public  Weather findByHour(@RequestParam("city") String city) {
		return service.findByHour(city);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "hourly")
	@ApiOperation(value = "Find Daily", notes = " Return the latest weather for a given city. ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"), })
	public  Weather findByDay(@RequestParam("city") String city) {
		return service.findByDay(city);
	}
	
	

}



