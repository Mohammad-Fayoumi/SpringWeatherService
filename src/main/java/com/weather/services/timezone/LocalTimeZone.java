package com.weather.services.timezone;

public class LocalTimeZone extends CurrentTimeZone implements TimeZoneService{
  @Override
  public String getTimeZone() {
    return "The current local time zone is : " + getCurrentTimeZone();
  }
}
