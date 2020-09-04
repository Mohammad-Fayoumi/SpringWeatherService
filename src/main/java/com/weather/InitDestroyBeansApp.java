package com.weather;

import com.weather.services.WeatherService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyBeansApp {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
    WeatherService weatherService = context.getBean("accuService", WeatherService.class);
    weatherService.getWeatherTimeZone();
    
    weatherService = context.getBean("natWeather", WeatherService.class);
    weatherService.toString();
    context.close();
  }
}

