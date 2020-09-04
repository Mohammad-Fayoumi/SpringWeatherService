package com.weather.services.timezone;

import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTimeZone {
  //get Calendar instance
  Calendar now = Calendar.getInstance();
  
  //get current TimeZone using getTimeZone method of Calendar class
  TimeZone timeZone = now.getTimeZone();
  
  public String getCurrentTimeZone() {
    return timeZone.getDisplayName();
  }
}
