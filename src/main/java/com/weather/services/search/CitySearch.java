package com.weather.services.search;

public class CitySearch implements SearchService {
  @Override
  public String getLocation() {
    return "Search service by city name";
  }
}
