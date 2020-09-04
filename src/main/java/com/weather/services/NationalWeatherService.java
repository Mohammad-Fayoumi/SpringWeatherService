package com.weather.services;

import com.weather.services.search.SearchService;
import com.weather.services.timezone.TimeZoneService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 *  The prototype scoped beans MUST implement the DisposableBean interface. This interface defines a "destroy()" method.
 */

@Component("annNationalWeather")
public class NationalWeatherService implements WeatherService, DisposableBean {
  TimeZoneService timeZoneService = null;
  SearchService searchService = null;
  
  public NationalWeatherService() {
    System.out.println("Inside no-arg constructor");
  }
  
  public NationalWeatherService(TimeZoneService timeZoneService) {
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
    System.out.println("Startup National weather service stuff");
  }
  
  @Override
  public void destroyWeatherServiceStuff() {
    System.out.println("Destroy National weather service stuff");
  }
  
  @Override
  public void destroy() throws Exception {
    System.out.println("Destroy method for the prototype beans YoYo.");
  }
}
