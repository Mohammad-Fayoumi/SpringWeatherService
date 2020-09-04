package com.weather.services;

import com.weather.services.search.SearchService;
import com.weather.services.timezone.TimeZoneService;
import org.springframework.stereotype.Component;

@Component("annWorldWeather")
public class WorldWeatherService implements WeatherService {
  private TimeZoneService timeZoneService = null;
  private SearchService searchService = null;
  
  // Inject literal values.
  private String emailAddress;
  private String apiEndPoint;
  private String apiKey;
  
  public WorldWeatherService() {
    System.out.println("Inside no-arg constructor");
  }
  
  public WorldWeatherService(TimeZoneService timeZoneService) {
    this.timeZoneService = timeZoneService;
  }
  
  public String getApiKey() {
    return apiKey;
  }
  
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  
  public String getEmailAddress() {
    return emailAddress;
  }
  
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public String getApiEndPoint() {
    return apiEndPoint;
  }
  
  public void setApiEndPoint(String apiEndPoint) {
    this.apiEndPoint = apiEndPoint;
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
    System.out.println("Startup World weather service stuff");
  }
  
  @Override
  public void destroyWeatherServiceStuff() {
    System.out.println("Destroy World weather service stuff");
  }
  
  @Override
  public String toString() {
    return "WorldWeatherService{" +
            "emailAddress='" + emailAddress + '\'' +
            ", apiEndPoint='" + apiEndPoint + '\'' +
            '}';
  }
}
