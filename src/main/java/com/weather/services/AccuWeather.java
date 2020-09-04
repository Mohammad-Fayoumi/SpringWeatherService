package com.weather.services;

import com.weather.services.search.SearchService;
import com.weather.services.timezone.TimeZoneService;
import org.springframework.stereotype.Component;

import java.util.Objects;
//Default bean id will be class name with small letter (accuWeather).
@Component
public class AccuWeather implements WeatherService {
  TimeZoneService timeZoneService = null;
  SearchService searchService = null;
  
  public AccuWeather() {
    System.out.println("Inside no-arg constructor");
  }
  
  public AccuWeather(TimeZoneService timeZoneService) {
    this.timeZoneService = timeZoneService;
  }
  
  public void setSearchService(SearchService searchService) {
    this.searchService = searchService;
  }
  
  public SearchService getSearchService() {
    return searchService;
  }
  
  public String getWeatherTimeZone() {
    return this.timeZoneService.getTimeZone();
  }
  
  @Override
  public float getBarometer() {
    System.out.println("Provide Barometer form " + getClass().getName());
    return 0;
  }
  
  @Override
  public float getInsideTemperature() {
    System.out.println("Provide Inside Temperature form " + getClass().getName());
    return 0;
  }
  
  @Override
  public float getOutsideTemperature() {
    System.out.println("Provide Outside Temperature form " + getClass().getName());
    return 0;
  }
  
  @Override
  public long getInsideHumidity() {
    System.out.println("Provide Inside Humidity form " + getClass().getName());
    return 0;
  }
  
  @Override
  public long getOutsideHumidity() {
    System.out.println("Provide Outside Humidity form " + getClass().getName());
    return 0;
  }
  
  @Override
  public float getRainRate() {
    System.out.println("Provide Rain Rate form " + getClass().getName());
    return 0;
  }
  
  @Override
  public long getWindDirection() {
    System.out.println("Provide Wind Direction form " + getClass().getName());
    return 0;
  }
  
  @Override
  public long getWindSpeed() {
    System.out.println("Provide Wind Speed form " + getClass().getName());
    return 0;
  }
  
  @Override
  public void startupWeatherServiceStuff() {
    System.out.println("Startup Accu weather service stuff");
  }
  
  @Override
  public void destroyWeatherServiceStuff() {
    System.out.println("Destroy Accu weather service stuff");
  }
}
