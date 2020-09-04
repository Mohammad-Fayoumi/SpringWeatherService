package com.weather.services;

import com.weather.services.search.SearchService;

public interface WeatherService {
  String getWeatherTimeZone();
  float getBarometer();
  float getInsideTemperature();
  float getOutsideTemperature();
  long getInsideHumidity();
  long getOutsideHumidity();
  float getRainRate();
  long getWindDirection();
  long getWindSpeed();
  void startupWeatherServiceStuff();
  void destroyWeatherServiceStuff();
  
  SearchService getSearchService();
}
