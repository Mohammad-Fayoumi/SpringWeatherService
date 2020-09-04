package com.weather.services.timezone;

public class GlobalTimeZone extends CurrentTimeZone implements TimeZoneService{
  @Override
  public String getTimeZone() {
    return "The global time zone is : " + getCurrentTimeZone();
  }
}
