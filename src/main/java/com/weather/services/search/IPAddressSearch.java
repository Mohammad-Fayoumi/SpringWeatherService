package com.weather.services.search;

public class IPAddressSearch implements SearchService {
  @Override
  public String getLocation() {
    return "IP address search service";
  }
}
