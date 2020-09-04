package com.weather.services.search;

public class ZIPCodeSearch implements SearchService{
  @Override
  public String getLocation() {
    return "zip code search service";
  }
}
